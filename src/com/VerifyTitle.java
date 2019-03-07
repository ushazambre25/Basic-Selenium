package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.Browser;

public class VerifyTitle {

	@Test
	public void verifyTitle() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		System.out.println("Test started--------");

		String actual_title = driver.getPageSource();
		System.out.println("Page title---" + actual_title);

		String expected_title = "Facebook – log in or sign up";

		// Assert.assertEquals(actual_title, expected_title);
		Assert.assertTrue(actual_title.contains("Facebook – log in or "));
		System.out.println("Test completed--------page varified");

	}

}
