package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Rater_AssessmentPage1 extends Base_Page{
	
	@FindBy(xpath="//assess-survey-card[@class='ng-tns-c8-9 ng-star-inserted']//div[4]//div[1]//button[1]//span[1]//span[1]//span[1]")
	private WebElement survey;
	
	@FindBy(xpath="//button[@class='mat-icon-button']")
	private WebElement opt;
	
	@FindBy(xpath="//button[contains(text(),'Benchmarks for Learning Agility')]")
	private WebElement BMKS_LA;
	
	@FindBy(xpath="//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	private WebElement i_understand;
	
	@FindBy(xpath="//span[contains(text(),'Start Survey')]")
	private WebElement start_survey;
	
	@FindBy(xpath="//div[contains(text(),'Strongly disagree')]")
	private List<WebElement> responses1to16; 
	
	@FindBy(xpath="//div[contains(text(),'Strongly disagree')]")
	private List<WebElement> responses17to32;
	
	@FindBy(xpath="//div[contains(text(),'Strongly disagree')]")
	private List<WebElement> responses33to48;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement Next_Grp1;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement Next_Grp2;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement Next1;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt1;
	
	@FindBy(xpath="//button[contains(text(),'Behaviors')]")
	private WebElement behaviours1;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt2;
	
	@FindBy(xpath="//button[contains(text(),'Behaviors')]")
	private WebElement behaviours2;
	
	
	public Rater_AssessmentPage1(WebDriver driver) {
		super(driver);
		
	}
	
    public void clickOnSurvey() {
		
		verifyElement(20, survey);
		survey.click();
	}
    
    public void clickOnOpt() {
		
		verifyElement(20, opt);
		opt.click();
	}
    
    public void clickOnBMKS_LA() {
		
		verifyElement(20, BMKS_LA);
		BMKS_LA.click();
	}

    public void clickOni_understand() {
		
		verifyElement(20, i_understand);
		i_understand.click();
	}
    
    public void clickOnstart_survey() {
		
		verifyElement(20, start_survey);
		start_survey.click();
	}
    
    public void clickOnResponses_1to16() {
	 	 
		for(int i=0; i<responses1to16.size(); i++) {
			WebElement response = responses1to16.get(i);
			verifyElement(60, response);
			response.click();
		}
		
	}
    
    public void clickOnNextgrp1() {
    	
    	verifyElement(30, Next_Grp1);
    	Next_Grp1.click();
    }
    
    public void clickOnOpt1() {
    	
    	verifyElement(30, opt1);
    	opt1.click();
    }
 
   public void clickOnBehavours1() {
 	
 	verifyElement(30, behaviours1);
 	behaviours1.click();
 }
    
    public void clickOnResponses_17to32() {
	 	 
		for(int i=0; i<responses17to32.size(); i++) {
			WebElement response = responses17to32.get(i);
			verifyElement(60, response);
			response.click();
		}
		
	}
    
    public void clickOnNextgrp2() {
    	
    	verifyElement(30, Next_Grp2);
    	Next_Grp2.click();
    } 
    
   public void clickOnOpt2() {
    	
    	verifyElement(30, opt2);
    	opt2.click();
    }
 
   public void clickOnBehavours2() {
 	
 	verifyElement(30, behaviours2);
 	behaviours2.click();
 }
    
    public void clickOnResponses_33to48() {
	 	 
		for(int i=0; i<responses33to48.size(); i++) {
			WebElement response = responses33to48.get(i);
			verifyElement(60, response);
			response.click();
		}
		
	}
    
   public void clickOnNext1() {
    	
    	verifyElement(30, Next1);
    	Next1.click();
    } 
   
   
}
