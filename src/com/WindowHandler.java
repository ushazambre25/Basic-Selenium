package com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\UshaData\\java soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		System.out.println("Size"+handles.size());
		String parent = itr.next();
		System.out.println("Parent " + parent);
		System.out.println("pNAme" + driver.getTitle());
		String child = itr.next();
		System.out.println("Child " + child);
		System.out.println("CNAme" + driver.getTitle());
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();

	}

}
