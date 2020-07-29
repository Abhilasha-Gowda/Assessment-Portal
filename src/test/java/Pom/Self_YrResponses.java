package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Self_YrResponses extends Base_Page {
	
	@FindBy(xpath="//span[contains(text(),'SUBMIT SURVEY')]")
	private WebElement submit;

	public Self_YrResponses(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickOnsubmit() {
		
		if(submit.isEnabled()) {
			
			System.out.println("submit button is enabled");
			verifyElement(20, submit);
			submit.click();
			
		}else {
			System.out.println("submit button is disabled");
		}
		
	}

}
