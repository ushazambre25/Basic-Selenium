package com.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdownEnhance {
	@Test
	public void selectDDValues() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement day_dropdown = driver.findElement(By.xpath(".//*[@id='day']"));
		Select day_DD = new Select(day_dropdown);

		List<WebElement> day_List = day_DD.getOptions();
		int total_day = day_List.size();
		System.out.println("Days Are===" + total_day);
		for (WebElement ele : day_List) {
			String day = ele.getText();
			System.out.println("Day is---" + day);

		}
		WebElement selected_val = day_DD.getFirstSelectedOption();
		System.out.println("After Selecting val---" + selected_val.getText());
		day_DD.selectByVisibleText("25");
		WebElement selected_val1 = day_DD.getFirstSelectedOption();
		System.out.println("After Selecting val---" + selected_val1.getText());

		System.out.println("-----------------");

		WebElement month_dropdown = driver.findElement(By.xpath(".//*[@id='month']"));
		Select month_DD = new Select(month_dropdown);
		List<WebElement> month_List = month_DD.getOptions();
		int total_month = month_List.size();
		System.out.println("total Month---" + total_month);
		for (WebElement ele : month_List) {
			String month_name = ele.getText();
			System.out.println("Month Name is---" + month_name);

		}
		month_DD.selectByVisibleText("Oct");
		System.out.println("---------------");
		WebElement year_dropdown = driver.findElement(By.xpath(".//*[@id='year']"));
		Select year_DD = new Select(year_dropdown);
		year_DD.selectByVisibleText("1992");
		List<WebElement> year_list = year_DD.getOptions();
		int total_year = year_list.size();
		System.out.println("Total Year" + total_year);
		for (WebElement ele : year_list) {
			String year_name = ele.getText();
			System.out.println("Year is---" + year_name);

		}

		driver.close();

	}

}
