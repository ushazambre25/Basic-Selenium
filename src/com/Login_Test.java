package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Test {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///H:/UshaData/Offline%20Website/index.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		

		driver.findElement(By.xpath("//a[@class=\'text-center\']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Usha Zambre");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9405284500");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);

		driver.close();

	}
}
