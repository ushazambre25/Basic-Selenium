package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		// remember
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath(".//*[@id='droppable']"));
		Actions act = new Actions(driver);
		// remember
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
	}
}
