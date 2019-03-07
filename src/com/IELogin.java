package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "H:\\UshaData\\java soft\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Test"); 
		driver.close();
	}

}
