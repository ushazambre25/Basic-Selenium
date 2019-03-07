package com.SSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificateChrome {
	public static void main(String[] args) {

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		System.setProperty("webdriver.chrome.driver", "H:\\UshaData\\java soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://www.cacert.org/");

	}

}
