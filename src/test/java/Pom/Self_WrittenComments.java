package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Self_WrittenComments extends Base_Page {
	
	@FindBy(xpath="//textarea")
	private WebElement comments;
	
	@FindBy(xpath="//span[contains(text(),'Review')]")
	private WebElement review;

	public Self_WrittenComments(WebDriver driver) {
		super(driver);
		
	}
	
	public void writtenComments() {
		 verifyElement(60, comments);
		 comments.sendKeys("BMKSLA-Self");
	}
	
	public void clickOnReview() {
		 verifyElement(45, review);
		 review.click();
	}

}
