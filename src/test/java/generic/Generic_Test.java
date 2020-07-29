package generic;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Generic_Test implements Auto_Const {

	public WebDriver driver;
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	BrowserFactory bff = new BrowserFactory();
	FileManager fm = new FileManager();
	
	@BeforeSuite
	public void setUp() {
		
		htmlreporter = new ExtentHtmlReporter("./reports/"+new Date().toString().replace(":", "-")+"BMKSLA.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
		
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openapp(@Optional("chrome")String browser) {
     if(browser.equals("chrome")){	
			
			driver = bff.getbrowser("chrome");
			driver.manage().window().maximize();
			driver.get(fm.getappurl());
		}else{
			driver = bff.getbrowser("firefox");
			driver.manage().window().maximize();
			driver.get(fm.getappurl());
		}

        driver.manage().timeouts().implicitlyWait(fm.getImplicitlywait(), TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeapp(ITestResult res) throws InterruptedException, IOException{
		System.out.println(res.getStatus());
		if(ITestResult.FAILURE==res.getStatus()){
			String testcasename = res.getName();
			Screenshot.capturePhoto(driver, testcasename);
			test.fail("Test Script Failed", MediaEntityBuilder.createScreenCaptureFromPath(Screenshot.capturePhoto(driver, testcasename)).build());
		}
		test.assignAuthor("Abhilasha Gowdaiah");
		test.assignCategory("GUI Automation");
		test.assignDevice("Laptop");
        reports.setSystemInfo("Windows", "10");
		Thread.sleep(5000);
		driver.quit();
	
	}
	
	@AfterSuite
	public void tearDown() {
		
		reports.flush();
	}
}
