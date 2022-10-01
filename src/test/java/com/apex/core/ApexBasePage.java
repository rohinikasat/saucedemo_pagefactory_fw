package com.apex.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApexBasePage {
	
	protected WebDriver driver;
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getAttributeByXpath(String xpath,String name){
		return driver.findElement(By.xpath(xpath))
		.getAttribute(name);
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
}
