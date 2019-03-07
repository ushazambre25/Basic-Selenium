package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdownValue {
	@Test
	public void selectDDValues() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement day_dropdown = driver.findElement(By.xpath(".//*[@id='day']"));
		Select day_DD = new Select(day_dropdown);
		WebElement selected_val = day_DD.getFirstSelectedOption();
		System.out.println("After Selecting val---" + selected_val.getText());
		day_DD.selectByVisibleText("25");
		WebElement selected_val1 = day_DD.getFirstSelectedOption();
		System.out.println("After Selecting val---" + selected_val1.getText());

	}

}
