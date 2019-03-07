package com.Screenshot;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class ScreeshotDemo {
	@Test
	public void captureScreenshot() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Utility.captureScreeshot(driver, "Browser Started");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("JavaByUsha");
		Utility.captureScreeshot(driver, "TypeUname");

	}

}
