package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeLogin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\UshaData\\java soft\\chromedriver.exe");

		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
			WebDriver driver = new ChromeDriver(options);*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
