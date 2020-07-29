package Pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Base_Page;

public class Self_BehavioursPage extends Base_Page {
	
	@FindBy(xpath="//div[contains(text(),'My Surveys')]")
	private WebElement my_survey;
	

	@FindBy(xpath="//div[@class='striped highlight']//div//button[@class='mat-raised-button mat-primary ng-star-inserted']//span[@class='mat-button-wrapper']//div//span[contains(text(),'Self')]")
	private WebElement self;

	@FindBy(xpath="//div[contains(text(),'Strongly disagree')]")
	private List<WebElement> responses1to16;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement Next_Grp1;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt1;
	
	@FindBy(xpath="//button[contains(text(),'Behaviors')]")
	private WebElement behaviour1;
	
	@FindBy(xpath="//div[contains(text(),'Strongly disagree')]")
	private List<WebElement> responses17to32;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement Next_Grp2;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt2;
	
	@FindBy(xpath="//button[contains(text(),'Behaviors')]")
	private WebElement behaviour2;
	
	@FindBy(xpath="//div[contains(text(),'Strongly disagree')]")
	private List<WebElement> responses33to48;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement Next1;
	
	public Self_BehavioursPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void my_surveys() {
		verifyElement(45, my_survey);
		my_survey.click();
	}
	
	public void self_button() {
		verifyElement(45, self);
		self.click();
	}
	
	public void clickOnResponses1to16() {
		for(int i=0; i<responses1to16.size(); i++) {
			WebElement response = responses1to16.get(i);
			verifyElement(60, response);
			response.click();
		}
	}
	
	public void nextGrp1() {
		verifyElement(45, Next_Grp1);
		Next_Grp1.click();
	}
	
	public void opt1() {
		verifyElement(75, opt1);
		opt1.click();
	}
	
	public void behaviour1() {
		verifyElement(75, behaviour1);
		behaviour1.click();
	}
	
	public void clickOnResponses17to32() {
		for(int i=0; i<responses17to32.size(); i++) {
			WebElement response = responses17to32.get(i);
			verifyElement(60, response);
			response.click();
		}
		
	}
	
	public void nextGrp2() {
		verifyElement(45, Next_Grp2);
		Next_Grp2.click();
	}
	
	public void opt2() {
		verifyElement(75, opt2);
		opt2.click();
	}
	
	public void behaviour2() {
		verifyElement(75, behaviour2);
		behaviour2.click();
	}
	
	public void clickOnResponses33to48() {
		for(int i=0; i<responses33to48.size(); i++) {
			WebElement response = responses33to48.get(i);
			verifyElement(120, response);
			response.click();
		}
		
	}
	
	public void next1() {
		verifyElement(45, Next1);
		Next1.click();
	}
  
  
}
