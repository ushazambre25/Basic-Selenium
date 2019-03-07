package Library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.regexp.recompile;

public class ConfigReader {
	Properties pro;

	public ConfigReader() {
		try {
			File src = new File("./Configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			Properties pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {

			System.out.println("Exception is" + e.getMessage());
		}

	}

	public String getChromePath() {
		String chromepath = pro.getProperty("chromeDriver");
		System.out.println("Chrome Path is===" + chromepath);
		return chromepath;

	}
	public String getApplication() {
		return pro.getProperty("URL");
		
	}

}
