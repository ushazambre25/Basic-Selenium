package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("9405284500");
		driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("123456");
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel1.selectByValue("25");
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel2.selectByIndex(10);

		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("1992");

		driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();

		driver.findElement(By.xpath(".//*[@id='u_0_11']")).click();

		driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=registration_form']")).click();
		driver.navigate().back();

		// driver.quit();
	}

}
