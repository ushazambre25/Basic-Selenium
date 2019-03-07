package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(right_click).build().perform();
		WebElement copy_Text = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		System.out.println("Name--" + copy_Text.getText());
		copy_Text.click();

	}

}
