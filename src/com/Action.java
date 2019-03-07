package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.javabykiran.com/javabykiranfiles/");
		Actions act = new Actions(driver);
		WebElement usernm = driver.findElement(By.xpath(".//*[@id='login_form_user']"));
		org.openqa.selenium.interactions.Action seriesOfActions = act.moveToElement(usernm).click().
				keyDown(usernm, Keys.SHIFT).
				sendKeys(usernm, "Usha").
				doubleClick(usernm).
				contextClick().
				build();
		seriesOfActions.perform();

	}
}
