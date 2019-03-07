package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///H:/UshaData/Offline%20Website/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();

		driver.findElement(By.xpath("//a[@href='users.html']")).click();
		
		List<WebElement> tr = driver.findElements(By.tagName("tr"));
		System.out.println("total no of rows---" + tr);

		for (WebElement row : tr) {
			List<WebElement> td = driver.findElements(By.tagName("td"));
			for (WebElement col : td) {
				System.out.println(col.getText());
				System.out.println("-------------");

			}

		}
		driver.findElement(By.xpath("//a[@href='logout.html']")).click();
		System.out.println("Test completed");

	}

}
