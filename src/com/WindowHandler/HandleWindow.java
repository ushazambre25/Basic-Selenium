package com.WindowHandler;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindow{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window---" + parent);
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("All windows---" + count);
		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child Window---" + driver.getTitle());
				Thread.sleep(5000);
				driver.close();

			}
			driver.switchTo().window(parent);
			System.out.println("Parent window---"+driver.getTitle());

		}

	}
}
