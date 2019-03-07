package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ErrorMsg {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H:\\UshaData\\java soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);

		String act_title = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
		String exp_title = "Enter an email or phone";
		Assert.assertTrue(act_title.contains(exp_title));

		System.out.println("Test completed-----");
		

	}

}
