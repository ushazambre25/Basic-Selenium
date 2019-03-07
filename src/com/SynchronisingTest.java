package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronisingTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\UshaData\\java soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("9405284500");
		driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("123456");
	}

}
