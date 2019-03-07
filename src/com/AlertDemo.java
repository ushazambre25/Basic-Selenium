package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemo {
	@Test
	public void alertmsg() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://online.keralartc.com/oprs-web/");
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		Thread.sleep(5000);
		String actual_msg = driver.switchTo().alert().getText();
		System.out.println("Alert msg is---" + actual_msg);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		String expected_msg = "Please select start place.";
		Assert.assertEquals(actual_msg, expected_msg);
		driver.close();

	}

}

