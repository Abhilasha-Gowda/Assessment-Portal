package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Self_ImpForSuccess extends Base_Page {
	
	@FindBy(xpath="(//mat-checkbox)[position()<6]")
	private List<WebElement> checkboxes;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next;
	
	public Self_ImpForSuccess(WebDriver driver) {
		super(driver);
		
	}
	


    
    public void checkboxes() {
    	for(int i=0; i<checkboxes.size(); i++) {
			WebElement chkbox = checkboxes.get(i);
			verifyElement(60, chkbox);
			chkbox.click();
		}
		
		verifyElement(20, next);
		next.click();
		
	}
    

}
