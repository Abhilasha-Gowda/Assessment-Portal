package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Rater_ResearchQuest extends Base_Page{
	
	@FindBy(xpath="//div[contains(text(),'Adequately')]")
	private List<WebElement> Research_quest1;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement nxtgrp;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt;
	
	@FindBy(xpath="//button[contains(text(),'Research Questions')]")
	private WebElement RQ;
	

	@FindBy(xpath="//div[contains(text(),' Somewhat likely ')]")
	private List<WebElement> Research_quest2;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next;
	
	public Rater_ResearchQuest(WebDriver driver) {
		super(driver);
		
		}
	
	public void research_questions() {
		for(int i=0; i<Research_quest1.size(); i++) {
			WebElement we = Research_quest1.get(i);
			verifyElement(60, we);
			we.click();
		}
		
		verifyElement(60, nxtgrp);
		nxtgrp.click();
		
		verifyElement(60, opt);
		opt.click();
		
		verifyElement(60, RQ);
		RQ.click();
		
		for(int i=0; i<Research_quest2.size(); i++) {
			WebElement we = Research_quest2.get(i);
			verifyElement(60, we);
			we.click();
		}
		
		verifyElement(60, next);
		next.click();
	}
	
	

}
