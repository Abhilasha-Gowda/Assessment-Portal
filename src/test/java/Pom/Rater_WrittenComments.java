package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Rater_WrittenComments extends Base_Page {
	
	@FindBy(xpath="//textarea")
	private WebElement comments;
	
	@FindBy(xpath="//span[contains(text(),'Review')]")
	private WebElement review;

	public Rater_WrittenComments(WebDriver driver) {
		super(driver);
		
	}
	
	public void written_comments() {
		
		verifyElement(60, comments);
		comments.sendKeys(" BMKSLA_BOSS ");
		
		verifyElement(60, review);
		review.click();
	}

}
