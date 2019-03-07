package com.WindowHandler;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window---" + parent);
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(allWindows);
		driver.switchTo().window(al.get(2));
		driver.close();
		driver.switchTo().window(al.get(1));
		driver.close();
		driver.switchTo().window(al.get(0));
		driver.close();
		System.out.println("Parent Window--" + driver.getTitle());

	}
}
