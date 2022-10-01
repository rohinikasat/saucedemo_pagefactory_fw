package com.apex.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.apex.core.ApexBasePage;
import com.apex.order.constant.OrderConstant;


public class OrderPage extends ApexBasePage implements OrderConstant{


WebDriver driver = null;
	
	@FindBy(how=How.NAME, using=USERNAME_NAME_LOCATOR)
	WebElement usernameBoxElement;
	
	@FindBy(how=How.NAME, using=PASSWORD_NAME_LOCATOR)
	WebElement passwordBoxElement;
	
	@FindBy(how=How.NAME, using=LOGINBTN_NAME_LOCATOR)
	WebElement loginBtnElement;
	
	@FindBy(how=How.ID, using=ADD_BAG2CART_ID_LOCATOR)
	WebElement addBagToCartElement;
	
	@FindBy(how=How.XPATH, using=CART_XPATH_LOCATOR)
	WebElement cartElement;
	
	@FindBy(how=How.NAME, using=CHCKOUT_NAME_LOCATOR)
	WebElement checkoutBtnElement;
	
	@FindBy(how=How.NAME, using=FRSTNAME_NAME_LOCATOR)
	WebElement firstNameBoxElement;
	
	@FindBy(how=How.NAME, using=LASTNAME_NAME_LOCATOR)
	WebElement lastNameBoxElement;
	
	@FindBy(how=How.NAME, using=POSTCODE_NAME_LOCATOR)
	WebElement postalCodeBoxElement;
	
	@FindBy(id=CNTINUE_BTN_ID_LOCATOR)
	WebElement continueBtnElement;
	
	@FindBy(name=FINISH_BTN_NAME_LOCATOR)
	WebElement finishBtnElement;
	
	public OrderPage(WebDriver driver){
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
	
	public void performLoginAction(String userName, String pass) throws InterruptedException {
		setUsernameBoxElementData(userName);
		Thread.sleep(TIMEOUT_2000);
		setPasswordBoxElementData(pass);
		Thread.sleep(TIMEOUT_2000);
		clickLoginBtn();
		Thread.sleep(TIMEOUT_2000);
	}
	
	public void clickAddBagToCart() {
		addBagToCartElement.click();
	}
	public void clickCart() {
		cartElement.click();
	}
	public void clickCheckout() {
		checkoutBtnElement.click();
	}
	public void setFirstNameBoxElementData(String firstName) {
		firstNameBoxElement.sendKeys(firstName);
	}
	public void setLastNameBoxElementData(String lastName) {
		lastNameBoxElement.sendKeys(lastName);
	}
	public void setPostalCodeBoxElementData(String postalCode) {
		postalCodeBoxElement.sendKeys(postalCode);
	}
	public void clickContinue() {
		continueBtnElement.click();
	}
	public void clickFinish() {
		finishBtnElement.click();
	}
	
	public void placeBackpackOrder(String userName, String pass, String firstName,String lastName,String postalCode) throws InterruptedException {
		performLoginAction(userName, pass);
		clickAddBagToCart();
		Thread.sleep(TIMEOUT_2000);
		clickCart();
		Thread.sleep(TIMEOUT_2000);
		clickCheckout();
		Thread.sleep(TIMEOUT_2000);
		setFirstNameBoxElementData(firstName);
		Thread.sleep(TIMEOUT_2000);
		setLastNameBoxElementData(lastName);
		Thread.sleep(TIMEOUT_2000);
		setPostalCodeBoxElementData(postalCode);
		Thread.sleep(TIMEOUT_2000);
		clickContinue();
		Thread.sleep(TIMEOUT_2000);
		clickFinish();
		Thread.sleep(TIMEOUT_2000);
	}
}
