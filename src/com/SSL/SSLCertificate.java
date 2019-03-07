package com.SSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SSLCertificate {
	public static void main(String[] args) {

		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cacert.org/");

	}

}
