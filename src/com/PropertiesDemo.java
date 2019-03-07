package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Library.ConfigReader;

public class PropertiesDemo {
	ConfigReader con;
	WebDriver driver;

	@BeforeTest
	public void setUpEnv() {
		con = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", con.getChromePath());
	}

	@Test
	public void testConfig() throws Exception {
		driver = new ChromeDriver();
		driver.get(con.getApplication());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
