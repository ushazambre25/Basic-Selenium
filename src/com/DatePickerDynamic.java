package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDynamic {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath(".//*[@id='onward_cal']")).click();
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		Thread.sleep(2000);
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("15")){
				dates.get(i).click();
				break;
			}

		}
		
		System.out.println("Test completed");
	}

}
