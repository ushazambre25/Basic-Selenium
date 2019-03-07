package com.Cookies;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CookiesDemo {

	@Test
	public void cookiesList() {
		System.setProperty("webdriver.chrome.driver", "H:\\UshaData\\java soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.get("https://www.facebook.com/");

		Set<Cookie> allCookie = driver.manage().getCookies();
		System.out.println("Cookies Count--" + allCookie.size());
		System.out.println("---------");

		for (Cookie cookie : allCookie) {
			System.out.println("Name---" + cookie.getName());
			System.out.println("Domain---" + cookie.getDomain());
			System.out.println("Path---" + cookie.getPath());
			System.out.println("Value---" + cookie.getValue());
			System.out.println("Expiry---" + cookie.getExpiry());
			System.out.println("IsSecure---" + cookie.isSecure());
			System.out.println("================");

		}

	}

}
