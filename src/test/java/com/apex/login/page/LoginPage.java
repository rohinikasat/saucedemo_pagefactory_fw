package com.apex.login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.apex.core.ApexBasePage;
import com.apex.login.constant.LoginConstant;

public class LoginPage extends ApexBasePage implements LoginConstant{

	WebDriver driver = null;
	
	@FindBy(how=How.NAME, using=USERNAME_NAME_LOCATOR)
	WebElement usernameBoxElement;
	
	@FindBy(how=How.NAME, using=PASSWORD_NAME_LOCATOR)
	WebElement passwordBoxElement;
	
	@FindBy(how=How.NAME, using=LOGINBTN_NAME_LOCATOR)
	WebElement loginBtnElement;
	
	public LoginPage(WebDriver driver){
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsernameBoxElementData(String userName) {
		usernameBoxElement.sendKeys(userName);
	}
	
	public void setPasswordBoxElementData(String pass) {
		passwordBoxElement.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginBtnElement.click();
	}
	
	public LoginSuccessPage performLoginAction(String userName, String pass) throws InterruptedException {
		setUsernameBoxElementData(userName);
		Thread.sleep(TIMEOUT_2000);
		setPasswordBoxElementData(pass);
		Thread.sleep(TIMEOUT_2000);
		clickLoginBtn();
		Thread.sleep(TIMEOUT_2000);
		
		return new LoginSuccessPage(driver);
	}
}
