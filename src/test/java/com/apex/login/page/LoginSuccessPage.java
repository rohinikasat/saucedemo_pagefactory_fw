package com.apex.login.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.apex.core.ApexBasePage;
import com.apex.login.constant.LoginConstant;

public class LoginSuccessPage extends ApexBasePage implements LoginConstant{
	
	@FindBy(how=How.XPATH, using= BAGPACK_XPATH_LOCATOR)
	WebElement bagpackElement;
	

	
	public LoginSuccessPage(WebDriver driver){
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getActualText(){
		return bagpackElement.getAttribute("name");
		
	}
	
	
}
