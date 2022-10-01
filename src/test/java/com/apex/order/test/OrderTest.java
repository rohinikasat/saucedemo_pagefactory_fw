package com.apex.order.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.core.ApexBaseWebTest;
import com.apex.login.page.LoginPage;
import com.apex.order.constant.OrderConstant;
import com.apex.order.page.OrderPage;

public class OrderTest extends ApexBaseWebTest implements OrderConstant {
	private static final String BACK2PRODUCT_BTN_XPATH_LOCATOR = "//*[@id=\"back-to-products\"]";

	@Test(priority = 1)
	public static void testBagpackOrder() throws InterruptedException {

		OrderPage orderPage = new OrderPage(driver);
		orderPage.openUrl(BASEURL);
		orderPage.placeBackpackOrder(USERNAME_STANDARD_USER, PASSWORD_COMMON, FIRSTNAME, LASTNAME, POSTCODE);

		String expectedText = "back-to-products";
		String actualText = orderPage.getAttributeByXpath(BACK2PRODUCT_BTN_XPATH_LOCATOR, "name");
		Assert.assertEquals(expectedText, actualText, TEXT_VERIFICATION_FAILED);

	}
}
