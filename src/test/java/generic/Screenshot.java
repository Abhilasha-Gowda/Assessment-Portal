package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static String capturePhoto(WebDriver driver, String testcasename) {
		
		Date d =new Date();
		String d1 = d.toString();
		String date = d1.replace(":", "-"); 
		
		String path = System.getProperty("user.dir")+"/Screenshots/"+date+testcasename+".png";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File(path+System.currentTimeMillis()+".png");
		File dest = new File(path);
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			
		System.out.println("failed to take screenshot");
		}
		return path;
	}
}


