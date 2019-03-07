package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath(".//*[@id='onward_cal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[4]")).click();
		System.out.println("Test compled---");

	}

}
