package com.apex.core;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApexBaseWebTest {
	protected static WebDriver driver = null;
	

	@BeforeMethod
	public void setUp(){
		driver=BrowserFactory.startBrowser("Chrome");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
