package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	@Test
	public void verifyTitle() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		String actual = driver.getTitle();
	//Assert.assertTrue(actual.contains("facebook"));
	}

}
