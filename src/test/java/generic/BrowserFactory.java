package generic;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory implements Auto_Const {
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	
	public  WebDriver getbrowser(String browser_name){
		WebDriver driver = null;
		switch (browser_name) {
		case "chrome":
			 driver = drivers.get("chrome");
			if(driver==null)
				System.setProperty(chrome_key, chrome_value);
			driver = new ChromeDriver();
			break;
			
		case "firefox":
		   driver = drivers.get("firefox");
			if(driver==null)
				System.setProperty(gecko_key, gecko_value);
			driver = new FirefoxDriver();
			break;

		default: 
			System.out.println("no such browser");
			break;
		}
		return driver;
	}

}
