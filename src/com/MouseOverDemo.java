package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@class='dropbtn']"))).build().perform();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int total_links = links.size();

		for (int i = 0; i < total_links; i++) {
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML");

			boolean status = element.isEnabled();
			System.out.println("Name---" + text + "Link Status" + status);
			if (text.equalsIgnoreCase("Appium")) {
				element.click();
				break;

			}

		}
	}

}
