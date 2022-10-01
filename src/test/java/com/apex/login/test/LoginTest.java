package com.apex.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.core.ApexBaseWebTest;
import com.apex.login.constant.LoginConstant;
import com.apex.login.page.LoginPage;
import com.apex.login.page.LoginSuccessPage;



public class LoginTest extends ApexBaseWebTest implements LoginConstant{


	@Test(priority=1)
	public static void testLoginWithSuccessfulData() throws InterruptedException {
		
		
		//create the page and call the action with the data
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openUrl(BASEURL);
		
		LoginSuccessPage loginSP = loginPage.performLoginAction(USERNAME_STANDARD_USER, PASSWORD_COMMON);
		
		//validations
		//String actualText = loginPage.getAttributeByXpath(BAGPACK_XPATH_LOCATOR,NAME);	
		Assert.assertEquals(SUCSFL_LOGIN_EXP_TXT, loginSP.getActualText(), TEXT_VERIFICATION_FAILED);
	}
	
	@Test(priority=2)
	public static void testLoginWithBlankData() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openUrl(BASEURL);
		loginPage.performLoginAction("", "");
	
		String actualText =  loginPage.getAttributeByXpath(ERROR_MSG_XPATH_LOCATOR, "data-test");
		Assert.assertEquals(EXPTD_TXT_ERROR, actualText, TEXT_VERIFICATION_FAILED);
	}
	
	@Test(priority=3)
	public static void testLoginWithLockedOutUser() throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openUrl(BASEURL);
		loginPage.performLoginAction(USERNAME_LOCKDOUT_USER, PASSWORD_COMMON);

		String actualText =  loginPage.getAttributeByXpath(ERROR_MSG_XPATH_LOCATOR, "data-test");
		Assert.assertEquals(EXPTD_TXT_ERROR, actualText, TEXT_VERIFICATION_FAILED);
	}
	
	@Test(priority=4)
	public static void testLoginWithProblemUser() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.openUrl(BASEURL);
		loginPage.performLoginAction(USERNAME_PROBLEM_USER, PASSWORD_COMMON);

		String actualText =  loginPage.getAttributeByXpath(PROBLM_USER_BAGPACK_IMG_LOCATOR, "src");
		Assert.assertEquals(PROBLM_USR_BAGPACK_IMAGE_SRC, actualText, TEXT_VERIFICATION_FAILED);
	}
	
	@Test(priority=5)
	public static void testLoginWithPerformanceGlitchUser() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openUrl(BASEURL);
		loginPage.performLoginAction(USERNAME_PERFRMNC_GLITCH_USR, PASSWORD_COMMON);
	}
	
}
