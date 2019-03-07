package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='identifierId'and @name='identifier']")).sendKeys("usha1140");
		//driver.findElement(By.xpath("//input[contains(@id,'identifierId')]")).sendKeys("JavaByUsha");
		//driver.findElement(By.xpath("//input[starts-with(@id,'identifierId')]")).sendKeys("JavaByUsha");
		//String a=driver.findElement(By.xpath("//div[text()='Not your computer? Use a Private Window to sign in.']")).getText();
		//System.out.println(a);
		driver.findElement(By.xpath("//input[@id='lastName']//preceding::input[@type='text']")).sendKeys("Usha");
		
		
		driver.close();
	}

}
