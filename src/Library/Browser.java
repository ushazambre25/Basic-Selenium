package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {
	public static WebDriver driver;

	@Test
	public static void setupBrowser(String browser) throws Exception {
		if (browser.equalsIgnoreCase("FireFox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "H:\\UshaData\\java soft\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "H:\\UshaData\\java soft\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();

		} else {
			throw new Exception("Browser is not correct");

		}

	}
	
	@Test
	public static void setUpURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

}
