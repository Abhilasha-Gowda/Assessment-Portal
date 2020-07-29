package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generic.Base_Page;
import generic.Excel;

public class Rater_FormItemCompare extends Base_Page {
	
	@FindBy(xpath="//div[contains(text(),'Please rate the extent to which')]")
	private WebElement behaviours;
	
	@FindBy(xpath="//div[contains(text(),'Select five competencies you consider to be')]")
	private WebElement importance;
	
	@FindBy(xpath="//div[contains(text(),'These questions are for research purposes only.')]")
	private WebElement Research;
	
	@FindBy(xpath="//div[contains(text(),'Please answer the following questions.')]")
	private WebElement written_comments;
	
	@FindBy(xpath="//div[contains(text(),'Review your responses.')]")
	private WebElement yourResponse;
	
	@FindBy(xpath="//span[contains(text(),'Learns from experience.')]")
	private WebElement item1;
	
	@FindBy(xpath="//span[contains(text(),'Can make mid-course corrections')]")
	private WebElement item2;
	
	@FindBy(xpath="//span[contains(text(),'Is not threatened by criticism.')]")
	private WebElement item3;
	
	@FindBy(xpath="//span[contains(text(),'Clearly demonstrates his')]")
	private WebElement item4;
	
	@FindBy(xpath="//span[contains(text(),'Is good at identifying the most important part of')]")
	private WebElement item5;
	
	@FindBy(xpath="//span[contains(text(),'Will persevere in the face of obstacles or critici')]")
	private WebElement item6;
	
	@FindBy(xpath="//span[contains(text(),'Is able to pull people together around a common go')]")
	private WebElement item7;
	
	@FindBy(xpath="//span[contains(text(),'Can be depended on to tell the truth regardless of')]")
	private WebElement item8;
	
	@FindBy(xpath="//span[contains(text(),'Has a solid understanding of our products and serv')]")
	private WebElement item9;
	
	@FindBy(xpath="//span[contains(text(),'Is sensitive to differences between cultures.')]")
	private WebElement item10;
	
	@FindBy(xpath="//span[contains(text(),'Has grown over time.')]")
	private WebElement item11;
	
	@FindBy(xpath="//span[contains(text(),'Pursues feedback even when others are reluctant to')]")
	private WebElement item12;
	
	@FindBy(xpath="//span[contains(text(),'Deals well with failure')]")
	private WebElement item13;
	
	@FindBy(xpath="//span[contains(text(),'Does not appear brittle--as if criticism might cau')]")
	private WebElement item14;
	
	@FindBy(xpath="//span[contains(text(),'Tries very hard to have a positive impact on the b')]")
	private WebElement item15;
	
	@FindBy(xpath="//span[contains(text(),'Is admired by others for his')]")
	private WebElement item16;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement nxtgrp1;
	
	@FindBy(xpath="//span[contains(text(),'Acts when others hesitate or just talk.')]")
	private WebElement item17;
	
	@FindBy(xpath="//span[contains(text(),'Takes responsibility for his')]")
	private WebElement item18;
	
	@FindBy(xpath="//span[contains(text(),'Is able to draw out the best in people.')]")
	private WebElement item19;
	
	@FindBy(xpath="//span[contains(text(),'When working with people from other cultures, work')]")
	private WebElement item20;
	
	@FindBy(xpath="//span[contains(text(),'Knows how the various parts of the organization fi')]")
	private WebElement item21;
	
	@FindBy(xpath="//span[contains(text(),'Is able to change ineffective behavior without bei')]")
	private WebElement item22;
	
	@FindBy(xpath="//span[contains(text(),'Takes criticism well.')]")
	private WebElement item23;
	
	@FindBy(xpath="//span[contains(text(),'Takes advantage of opportunities to do new things.')]")
	private WebElement item24;
	
	@FindBy(xpath="//span[contains(text(),'Is passionate about seeing the business succeed.')]")
	private WebElement item25;
	
	@FindBy(xpath="//span[contains(text(),'Shows impressive mental agility.')]")
	private WebElement item26;
	
	@FindBy(xpath="//span[contains(text(),'Is willing to go against the grain.')]")
	private WebElement item27;
	
	@FindBy(xpath="//span[contains(text(),'Likes to experience different cultures.')]")
	private WebElement item28;
	
	@FindBy(xpath="//span[contains(text(),'Knows the business.')]")
	private WebElement item29;
	
	@FindBy(xpath="//span[contains(text(),'Is seen by others as an honest person.')]")
	private WebElement item30;
	
	@FindBy(xpath="//span[contains(text(),'Can turn a group into a high-performing team.')]")
	private WebElement item31;
	
	@FindBy(xpath="//span[contains(text(),'Is not afraid to ask others about his')]")
	private WebElement item32;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement nxtgrp2;
	
	@FindBy(xpath="//span[contains(text(),'Is willing to make substantial personal sacrifices')]")
	private WebElement item33;
	
	@FindBy(xpath="//span[contains(text(),'Is good at asking insightful questions.')]")
	private WebElement item34;
	
	@FindBy(xpath="//span[contains(text(),'Enjoys the challenge of working in countries other')]")
	private WebElement item35;
	
	@FindBy(xpath="//span[contains(text(),'Understands the financial side of the business.')]")
	private WebElement item36;
	
	@FindBy(xpath="//span[contains(text(),'Is not self-promoting or arrogant.')]")
	private WebElement item37;
	
	@FindBy(xpath="//span[contains(text(),'Treats all situations as an opportunity to learn s')]")
	private WebElement item38;
	
	@FindBy(xpath="//span[contains(text(),'Learns from mistakes.')]")
	private WebElement item39;
	
	@FindBy(xpath="//span[contains(text(),'Takes personal as well as business risks.')]")
	private WebElement item40;
	
	@FindBy(xpath="//span[contains(text(),'Is able to achieve consensus even when people disa')]")
	private WebElement item41;
	
	@FindBy(xpath="//span[contains(text(),'Is quick to change his')]")
	private WebElement item42;
	
	@FindBy(xpath="//span[contains(text(),'Has developed significant new skills over time.')]")
	private WebElement item43;
	
	@FindBy(xpath="//span[contains(text(),'Responds effectively when given feedback.')]")
	private WebElement item44;
	
	@FindBy(xpath="//span[contains(text(),'Has a special talent for dealing with people.')]")
	private WebElement item45;
	
	@FindBy(xpath="//span[contains(text(),'Is able to start over after setbacks')]")
	private WebElement item46;
	
	@FindBy(xpath="//span[contains(text(),'Seeks experiences that will change his')]")
	private WebElement item47;
	
	@FindBy(xpath="//span[contains(text(),'Has changed as a result of feedback')]")
	private WebElement item48;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next1;
	
	@FindBy(xpath="//div[contains(text(),'Seeks opportunities to learn')]")
	private WebElement imp1;
	
	@FindBy(xpath="//div[contains(text(),'Seeks out experiences that may change perspective')]")
	private WebElement imp1a;
	
	@FindBy(xpath="//div[contains(text(),'Seeks and uses feedback')]")
	private WebElement imp2;
	
	@FindBy(xpath="//div[contains(text(),'Pursues, responds to and uses feedback.')]")
	private WebElement imp2a;
	
	@FindBy(xpath="//div[contains(text(),'Learns from mistakes')]")
	private WebElement imp3;
	
	@FindBy(xpath="//div[contains(text(),'Able to learn from mistakes; changes direction whe')]")
	private WebElement imp3a;
	
	@FindBy(xpath="//div[contains(text(),'Open to criticism')]")
	private WebElement imp4;
	
	@FindBy(xpath="//div[contains(text(),'Handles criticism effectively; does not act threat')]")
	private WebElement imp4a;
	
	@FindBy(xpath="//div[contains(text(),'Committed to making a difference')]")
	private WebElement imp5;
	
	@FindBy(xpath="//div[contains(text(),'Demonstrates a strong commitment to the success of')]")
	private WebElement imp5a;
	
	@FindBy(xpath="//div[contains(text(),'Insightful: sees things from new angles')]")
	private WebElement imp6;
	
	@FindBy(xpath="//div[contains(text(),\"Other people admire this person's intelligence, pa\")]")
	private WebElement imp6a;
	
	@FindBy(xpath="//div[contains(text(),'Has the courage to take risks')]")
	private WebElement imp7;
	
	@FindBy(xpath="//div[contains(text(),'Will take a stand when others disagree, go against')]")
	private WebElement imp7a;
	
	@FindBy(xpath="//div[contains(text(),'Brings out the best in people')]")
	private WebElement imp8;
	
	@FindBy(xpath="//div[contains(text(),'Has a special talent with people that is evident i')]")
	private WebElement imp8a;
	
	@FindBy(xpath="//div[contains(text(),'Acts with integrity')]")
	private WebElement imp9;
	
	@FindBy(xpath="//div[contains(text(),'Tells the truth and is described by others as hone')]")
	private WebElement imp9a;
	
	@FindBy(xpath="//div[contains(text(),'Seeks broad business knowledge')]")
	private WebElement imp10;
	
	@FindBy(xpath="//div[contains(text(),'Has an understanding of the business that goes bey')]")
	private WebElement imp10a;
	
	@FindBy(xpath="//div[contains(text(),'Adapts to cultural differences')]")
	private WebElement imp11;
	
	@FindBy(xpath="//div[contains(text(),'Enjoys the challenge of working in and experiencin')]")
	private WebElement imp11a;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next2;
	
	@FindBy(xpath="//div[@id='1069093']//span[contains(text(),'How would you rate this person')]")
	private WebElement Rq1;
	
	@FindBy(xpath="//span[contains(text(),'Where would you place this person as a leader rela')]")
	private WebElement Rq2;
	
	@FindBy(xpath="//div[@id='1069095']//span[contains(text(),'How would you rate this person')]")
	private WebElement Rq3;
	
	@FindBy(xpath="//div[@id='1069096']//span[contains(text(),'How would you rate this person')]")
	private WebElement Rq4;
	
	@FindBy(xpath="//span[contains(text(),'How effectively would this person handle being pro')]")
	private WebElement Rq5;
	
	@FindBy(xpath="//span[contains(text(),'How well would this person be able to handle advan')]")
	private WebElement Rq6;
	
	@FindBy(xpath="//span[contains(text(),'Next Group')]")
	private WebElement nxtgrp3;
	
	@FindBy(xpath="//div[@id='1069099']//span[contains(text(),'What is the likelihood that this person will derai')]")
	private WebElement Rq7;
	
	@FindBy(xpath="//div[@id='1069100']//span[contains(text(),'What is the likelihood that this person will derai')]")
	private WebElement Rq8;
	
	@FindBy(xpath="//span[contains(text(),'What is the likelihood this person')]")
	private WebElement Rq9;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next3;
	
	@FindBy(xpath="//body/assess-root/div[@class='mat-typography']/div/assess-survey[@class='ng-star-inserted']/assess-survey-container/assess-survey-stepper/assess-survey-direct-feedback-questions[@class='ng-star-inserted']/div[@class='ng-star-inserted']/div/div/div/assess-survey-direct-feedback-question[@class='ng-star-inserted']/div[@id='1069102']/div[1]")
	private WebElement wc;
	

	@FindBy(xpath="//span[contains(text(),'Review')]")
	private WebElement review;
	
	public Rater_FormItemCompare(WebDriver driver) {
		super(driver);
	}
	
	public void compare_form_items_and_Insttext() {
		
		verifyElement(60, behaviours);
		String expected70 = Excel.getdata("Rater_InstText", 1, 0);
		String actual70 = behaviours.getText();
		//Assert.assertEquals(actual70, expected70);
		if(actual70.equalsIgnoreCase(expected70)) {
			System.out.println("behaviours instruction text matches");
			Excel.wite_data("Rater_InstText", 1, 1, "Pass");
		}else {
			System.out.println("behaviours instruction text is not matching");
			Excel.wite_data("Rater_InstText", 1, 1, "fail");
		}
		
		    verifyElement(30, item1);
			String expected1 = Excel.getdata("Rater_FI", 1, 0);
			String actual1 = item1.getText();
			//Assert.assertEquals(actual1, expected1);
			if(actual1.equalsIgnoreCase(expected1)) {
				System.out.println("item1 matches");
				Excel.wite_data("Rater_FI", 1, 1, "Pass");
			}else {
				System.out.println("item1 is not matching");
				Excel.wite_data("Rater_FI", 1, 1, "fail");
			}
		
			verifyElement(30, item2);
			String expected2 = Excel.getdata("Rater_FI", 2, 0);
			String actual2 = item2.getText();
			//Assert.assertEquals(actual2, expected2);
			if(actual2.equalsIgnoreCase(expected2)) {
				System.out.println("item2 matches");
				Excel.wite_data("Rater_FI", 2, 1, "Pass");
			}else {
				System.out.println("item2 is not matching");
				Excel.wite_data("Rater_FI", 2, 1, "fail");
			}
		
			verifyElement(30, item3);
			String expected3 = Excel.getdata("Rater_FI", 3, 0);
			String actual3 = item3.getText();
			//Assert.assertEquals(actual3, expected3);
			if(actual3.equalsIgnoreCase(expected3)) {
				System.out.println("item3 matches");
				Excel.wite_data("Rater_FI", 3, 1, "Pass");
			}else {
				System.out.println("item3 is not matching");
				Excel.wite_data("Rater_FI", 3, 1, "fail");
			}
		
			verifyElement(30, item4);
			String expected4 = Excel.getdata("Rater_FI", 4, 0);
			String actual4 = item4.getText();
			//Assert.assertEquals(actual4, expected4);
			if(actual4.equalsIgnoreCase(expected4)) {
				System.out.println("item4 matches");
				Excel.wite_data("Rater_FI", 4, 1, "Pass");
			}else {
				System.out.println("item4 is not matching");
				Excel.wite_data("Rater_FI", 4, 1, "fail");
			}
			
		verifyElement(30, item5);
		String expected5 = Excel.getdata("Rater_FI", 5, 0);
		String actual5 = item5.getText();
		//Assert.assertEquals(actual5, expected5);
		if(actual5.equalsIgnoreCase(expected5)) {
			System.out.println("item5 matches");
			Excel.wite_data("Rater_FI", 5, 1, "Pass");
		}else {
			System.out.println("item5 is not matching");
			Excel.wite_data("Rater_FI", 5, 1, "fail");
		}
			
		verifyElement(30, item6);
		String expected6 = Excel.getdata("Rater_FI", 6, 0);
		String actual6 = item6.getText();
		//Assert.assertEquals(actual6, expected6);
		if(actual6.equalsIgnoreCase(expected6)) {
			System.out.println("item6 matches");
			Excel.wite_data("Rater_FI", 6, 1, "Pass");
		}else {
			System.out.println("item6 is not matching");
			Excel.wite_data("Rater_FI", 6, 1, "fail");
		}
		
	    verifyElement(30, item7);
		String expected7 = Excel.getdata("Rater_FI", 7, 0);
		String actual7 = item7.getText();
		//Assert.assertEquals(actual7, expected7);
		if(actual7.equalsIgnoreCase(expected7)) {
			System.out.println("item7 matches");
			Excel.wite_data("Rater_FI", 7, 1, "Pass");
		}else {
			System.out.println("item7 is not matching");
			Excel.wite_data("Rater_FI", 7, 1, "fail");
		}
		
		verifyElement(30, item8);
		String expected8 = Excel.getdata("Rater_FI", 8, 0);
		String actual8 = item8.getText();
		//Assert.assertEquals(actual8, expected8);
		if(actual8.equalsIgnoreCase(expected8)) {
			System.out.println("item8 matches");
			Excel.wite_data("Rater_FI", 8, 1, "Pass");
		}else {
			System.out.println("item8 is not matching");
			Excel.wite_data("Rater_FI", 8, 1, "fail");
		}
		
		verifyElement(30, item9);
		String expected9 = Excel.getdata("Rater_FI", 9, 0);
		String actual9 = item9.getText();
		//Assert.assertEquals(actual9, expected9);
		if(actual9.equalsIgnoreCase(expected9)) {
			System.out.println("item9 matches");
			Excel.wite_data("Rater_FI", 9, 1, "Pass");
		}else {
			System.out.println("item9 is not matching");
			Excel.wite_data("Rater_FI", 9, 1, "fail");
		}
		
		verifyElement(30, item10);
		String expected10 = Excel.getdata("Rater_FI", 10, 0);
		String actual10 = item10.getText();
		//Assert.assertEquals(actual10, expected10);
		if(actual10.equalsIgnoreCase(expected10)) {
			System.out.println("item10 matches");
			Excel.wite_data("Rater_FI", 10, 1, "Pass");
		}else {
			System.out.println("item10 is not matching");
			Excel.wite_data("Rater_FI", 10, 1, "fail");
		}
		
		verifyElement(30, item11);
		String expected11 = Excel.getdata("Rater_FI", 11, 0);
		String actual11 = item11.getText();
		//Assert.assertEquals(actual11, expected11);
		if(actual11.equalsIgnoreCase(expected11)) {
			System.out.println("item11 matches");
			Excel.wite_data("Rater_FI", 11, 1, "Pass");
		}else {
			System.out.println("item11 is not matching");
			Excel.wite_data("Rater_FI", 11, 1, "fail");
		}
		
		verifyElement(30, item12);
		String expected12 = Excel.getdata("Rater_FI", 12, 0);
		String actual12 = item12.getText();
		//Assert.assertEquals(actual12, expected12);
		if(actual12.equalsIgnoreCase(expected12)) {
			System.out.println("item12 matches");
			Excel.wite_data("Rater_FI", 12, 1, "Pass");
		}else {
			System.out.println("item12 is not matching");
			Excel.wite_data("Rater_FI", 12, 1, "fail");
		}
		
		verifyElement(30, item13);
		String expected13 = Excel.getdata("Rater_FI", 13, 0);
		String actual13 = item13.getText();
		//Assert.assertEquals(actual13, expected13);
		if(actual13.equalsIgnoreCase(expected13)) {
			System.out.println("item13 matches");
			Excel.wite_data("Rater_FI", 13, 1, "Pass");
		}else {
			System.out.println("item13 is not matching");
			Excel.wite_data("Rater_FI", 13, 1, "fail");
		}
		
		verifyElement(30, item14);
		String expected14 = Excel.getdata("Rater_FI", 14, 0);
		String actual14 = item14.getText();
    	//Assert.assertEquals(actual14, expected14);
		if(actual14.equalsIgnoreCase(expected14)) {
			System.out.println("item14 matches");
			Excel.wite_data("Rater_FI", 14, 1, "Pass");
		}else {
			System.out.println("item14 is not matching");
			Excel.wite_data("Rater_FI", 14, 1, "fail");
		}
		
        verifyElement(30, item15);
		String expected15 = Excel.getdata("Rater_FI", 15, 0);
		String actual15 = item15.getText();
		//Assert.assertEquals(actual15, expected15);
		if(actual15.equalsIgnoreCase(expected15)) {
			System.out.println("item15 matches");
			Excel.wite_data("Rater_FI", 15, 1, "Pass");
		}else {
			System.out.println("item15 is not matching");
			Excel.wite_data("Rater_FI", 15, 1, "fail");
		}
		
		verifyElement(30, item16);
		String expected16 = Excel.getdata("Rater_FI", 16, 0);
		String actual16 = item16.getText();
		//Assert.assertEquals(actual16, expected16);
		if(actual16.equalsIgnoreCase(expected16)) {
			System.out.println("item16 matches");
			Excel.wite_data("Rater_FI", 16, 1, "Pass");
		}else {
			System.out.println("item16 is not matching");
			Excel.wite_data("Rater_FI", 16, 1, "fail");
		}
		
	    verifyElement(60, nxtgrp1);
		nxtgrp1.click();
		
		verifyElement(30, item17);
		String expected17 = Excel.getdata("Rater_FI", 17, 0);
		String actual17 = item17.getText();
		//Assert.assertEquals(actual17, expected17);
		if(actual17.equalsIgnoreCase(expected17)) {
			System.out.println("item17 matches");
			Excel.wite_data("Rater_FI", 17, 1, "Pass");
		}else {
			System.out.println("item17 is not matching");
			Excel.wite_data("Rater_FI", 17, 1, "fail");
		}
		
		verifyElement(30, item18);
		String expected18 = Excel.getdata("Rater_FI", 18, 0);
		String actual18 = item18.getText();
		//Assert.assertEquals(actual18, expected18);
		if(actual18.equalsIgnoreCase(expected18)) {
			System.out.println("item18 matches");
			Excel.wite_data("Rater_FI", 18, 1, "Pass");
		}else {
			System.out.println("item18 is not matching");
			Excel.wite_data("Rater_FI", 18, 1, "fail");
		}
		
		verifyElement(30, item19);
		String expected19 = Excel.getdata("Rater_FI", 19, 0);
		String actual19 = item19.getText();
		//Assert.assertEquals(actual19, expected19);
		if(actual19.equalsIgnoreCase(expected19)) {
			System.out.println("item19 matches");
			Excel.wite_data("Rater_FI", 19, 1, "Pass");
		}else {
			System.out.println("item19 is not matching");
			Excel.wite_data("Rater_FI", 19, 1, "fail");
		}
		
		verifyElement(30, item20);
		String expected20 = Excel.getdata("Rater_FI", 20, 0);
		String actual20 = item20.getText();
		//Assert.assertEquals(actual20, expected20);
		if(actual20.equalsIgnoreCase(expected20)) {
			System.out.println("item20 matches");
			Excel.wite_data("Rater_FI", 20, 1, "Pass");
		}else {
			System.out.println("item20 is not matching");
			Excel.wite_data("Rater_FI", 20, 1, "fail");
		}
		
	    verifyElement(30, item21);
		String expected21 = Excel.getdata("Rater_FI", 21, 0);
		String actual21 = item21.getText();
		//Assert.assertEquals(actual21, expected21);
		if(actual21.equalsIgnoreCase(expected21)) {
			System.out.println("item21 matches");
			Excel.wite_data("Rater_FI", 21, 1, "Pass");
		}else {
			System.out.println("item21 is not matching");
			Excel.wite_data("Rater_FI", 21, 1, "fail");
		}
		
		verifyElement(30, item22);
		String expected22 = Excel.getdata("Rater_FI", 22, 0);
		String actual22 = item22.getText();
		//Assert.assertEquals(actual22, expected22);
		if(actual22.equalsIgnoreCase(expected22)) {
			System.out.println("item22 matches");
			Excel.wite_data("Rater_FI", 22, 1, "Pass");
		}else {
			System.out.println("item22 is not matching");
			Excel.wite_data("Rater_FI", 22, 1, "fail");
		}
		
		verifyElement(30, item23);
		String expected23 = Excel.getdata("Rater_FI", 23, 0);
		String actual23 = item23.getText();
		//Assert.assertEquals(actual23, expected23);
		if(actual23.equalsIgnoreCase(expected23)) {
			System.out.println("item23 matches");
			Excel.wite_data("Rater_FI", 23, 1, "Pass");
		}else {
			System.out.println("item23 is not matching");
			Excel.wite_data("Rater_FI", 23, 1, "fail");
		}
		
		verifyElement(30, item24);
		String expected24 = Excel.getdata("Rater_FI", 24, 0);
		String actual24 = item24.getText();
		//Assert.assertEquals(actual24, expected24);
		if(actual24.equalsIgnoreCase(expected24)) {
			System.out.println("item24 matches");
			Excel.wite_data("Rater_FI", 24, 1, "Pass");
		}else {
			System.out.println("item24 is not matching");
			Excel.wite_data("Rater_FI", 24, 1, "fail");
		}
		
		verifyElement(30, item25);
		String expected25 = Excel.getdata("Rater_FI", 25, 0);
		String actual25 = item25.getText();
		//Assert.assertEquals(actual25, expected25);
		if(actual25.equalsIgnoreCase(expected25)) {
			System.out.println("item25 matches");
			Excel.wite_data("Rater_FI", 25, 1, "Pass");
		}else {
			System.out.println("item25 is not matching");
			Excel.wite_data("Rater_FI", 25, 1, "fail");
		}
		
		verifyElement(30, item26);
		String expected26 = Excel.getdata("Rater_FI", 26, 0);
		String actual26 = item26.getText();
		//Assert.assertEquals(actual26, expected26);
		if(actual26.equalsIgnoreCase(expected26)) {
			System.out.println("item26 matches");
			Excel.wite_data("Rater_FI", 26, 1, "Pass");
		}else {
			System.out.println("item26 is not matching");
			Excel.wite_data("Rater_FI", 26, 1, "fail");
		}
		
		verifyElement(30, item27);
		String expected27 = Excel.getdata("Rater_FI", 27, 0);
		String actual27 = item27.getText();
		//Assert.assertEquals(actual27, expected27);
		if(actual27.equalsIgnoreCase(expected27)) {
			System.out.println("item27 matches");
			Excel.wite_data("Rater_FI", 27, 1, "Pass");
		}else {
			System.out.println("item27 is not matching");
			Excel.wite_data("Rater_FI", 27, 1, "fail");
		}
		
	    verifyElement(30, item28);
		String expected28 = Excel.getdata("Rater_FI", 28, 0);
		String actual28 = item28.getText();
		//Assert.assertEquals(actual28, expected28);
		if(actual28.equalsIgnoreCase(expected28)) {
			System.out.println("item28 matches");
			Excel.wite_data("Rater_FI", 28, 1, "Pass");
		}else {
			System.out.println("item28 is not matching");
			Excel.wite_data("Rater_FI", 28, 1, "fail");
		}
		
		verifyElement(30, item29);
		String expected29 = Excel.getdata("Rater_FI", 29, 0);
		String actual29 = item29.getText();
		//Assert.assertEquals(actual29, expected29);
		if(actual29.equalsIgnoreCase(expected29)) {
			System.out.println("item29 matches");
			Excel.wite_data("Rater_FI", 29, 1, "Pass");
		}else {
			System.out.println("item29 is not matching");
			Excel.wite_data("Rater_FI", 29, 1, "fail");
		}
		
		verifyElement(30, item30);
		String expected30 = Excel.getdata("Rater_FI", 30, 0);
		String actual30 = item30.getText();
		//Assert.assertEquals(actual30, expected30);
		if(actual30.equalsIgnoreCase(expected30)) {
			System.out.println("item30 matches");
			Excel.wite_data("Rater_FI", 30, 1, "Pass");
		}else {
			System.out.println("item30 is not matching");
			Excel.wite_data("Rater_FI", 30, 1, "fail");
		}
		
		verifyElement(30, item31);
		String expected31 = Excel.getdata("Rater_FI", 31, 0);
		String actual31 = item31.getText();
		//Assert.assertEquals(actual31, expected31);
		if(actual31.equalsIgnoreCase(expected31)) {
			System.out.println("item31 matches");
			Excel.wite_data("Rater_FI", 31, 1, "Pass");
		}else {
			System.out.println("item31 is not matching");
			Excel.wite_data("Rater_FI", 31, 1, "fail");
		}
		
		verifyElement(30, item32);
		String expected32 = Excel.getdata("Rater_FI", 32, 0);
		String actual32 = item32.getText();
		//Assert.assertEquals(actual32, expected32);
		if(actual32.equalsIgnoreCase(expected32)) {
			System.out.println("item32 matches");
			Excel.wite_data("Rater_FI", 32, 1, "Pass");
		}else {
			System.out.println("item32 is not matching");
			Excel.wite_data("Rater_FI", 32, 1, "fail");
		}
		
		verifyElement(60, nxtgrp2);
		nxtgrp2.click();
		
	    verifyElement(30, item33);
		String expected33 = Excel.getdata("Rater_FI", 33, 0);
		String actual33 = item33.getText();
		//Assert.assertEquals(actual33, expected33);
		if(actual33.equalsIgnoreCase(expected33)) {
			System.out.println("item33 matches");
			Excel.wite_data("Rater_FI", 33, 1, "Pass");
		}else {
			System.out.println("item33 is not matching");
			Excel.wite_data("Rater_FI", 33, 1, "fail");
		}
		
	    verifyElement(30, item34);
		String expected34 = Excel.getdata("Rater_FI", 34, 0);
		String actual34 = item34.getText();
		//Assert.assertEquals(actual34, expected34);
		if(actual34.equalsIgnoreCase(expected34)) {
			System.out.println("item34 matches");
			Excel.wite_data("Rater_FI", 34, 1, "Pass");
		}else {
			System.out.println("item34 is not matching");
			Excel.wite_data("Rater_FI", 34, 1, "fail");
		}
		
	    verifyElement(30, item35);
		String expected35 = Excel.getdata("Rater_FI", 35, 0);
		String actual35 = item35.getText();
		Assert.assertEquals(actual35, expected35);
		if(actual35.equalsIgnoreCase(expected35)) {
			System.out.println("item35 matches");
			Excel.wite_data("Rater_FI", 35, 1, "Pass");
		}else {
			System.out.println("item35 is not matching");
			Excel.wite_data("Rater_FI", 35, 1, "fail");
		}
		
	    verifyElement(30, item36);
		String expected36 = Excel.getdata("Rater_FI", 36, 0);
		String actual36 = item36.getText();
		//Assert.assertEquals(actual36, expected36);
		if(actual36.equalsIgnoreCase(expected36)) {
			System.out.println("item36 matches");
			Excel.wite_data("Rater_FI", 36, 1, "Pass");
		}else {
			System.out.println("item36 is not matching");
			Excel.wite_data("Rater_FI", 36, 1, "fail");
		}
		
	    verifyElement(30, item37);
		String expected37 = Excel.getdata("Rater_FI", 37, 0);
		String actual37 = item37.getText();
		//Assert.assertEquals(actual37, expected37);
		if(actual37.equalsIgnoreCase(expected37)) {
			System.out.println("item37 matches");
			Excel.wite_data("Rater_FI", 37, 1, "Pass");
		}else {
			System.out.println("item37 is not matching");
			Excel.wite_data("Rater_FI", 37, 1, "fail");
		}
		
		verifyElement(30, item38);
		String expected38 = Excel.getdata("Rater_FI", 38, 0);
		String actual38 = item38.getText();
		//Assert.assertEquals(actual38, expected38);
		if(actual38.equalsIgnoreCase(expected38)) {
			System.out.println("item38 matches");
			Excel.wite_data("Rater_FI", 38, 1, "Pass");
		}else {
			System.out.println("item38 is not matching");
			Excel.wite_data("Rater_FI", 38, 1, "fail");
		}
		
	    verifyElement(30, item39);
		String expected39 = Excel.getdata("Rater_FI", 39, 0);
		String actual39 = item39.getText();
		//Assert.assertEquals(actual39, expected39);
		if(actual39.equalsIgnoreCase(expected39)) {
			System.out.println("item39 matches");
			Excel.wite_data("Rater_FI", 39, 1, "Pass");
		}else {
			System.out.println("item39 is not matching");
			Excel.wite_data("Rater_FI", 39, 1, "fail");
		}
		
		verifyElement(30, item40);
		String expected40 = Excel.getdata("Rater_FI", 40, 0);
		String actual40 = item40.getText();
		//Assert.assertEquals(actual40, expected40);
		if(actual40.equalsIgnoreCase(expected40)) {
			System.out.println("item40 matches");
			Excel.wite_data("Rater_FI", 40, 1, "Pass");
		}else {
			System.out.println("item40 is not matching");
			Excel.wite_data("Rater_FI", 40, 1, "fail");
		}
		
		verifyElement(30, item41);
		String expected41 = Excel.getdata("Rater_FI", 41, 0);
		String actual41 = item41.getText();
		//Assert.assertEquals(actual41, expected41);
		if(actual41.equalsIgnoreCase(expected41)) {
			System.out.println("item41 matches");
			Excel.wite_data("Rater_FI", 41, 1, "Pass");
		}else {
			System.out.println("item41 is not matching");
			Excel.wite_data("Rater_FI", 41, 1, "fail");
		}
		
        verifyElement(30, item42);
		String expected42 = Excel.getdata("Rater_FI", 42, 0);
		String actual42 = item42.getText();
		//Assert.assertEquals(actual42, expected42);
		if(actual42.equalsIgnoreCase(expected42)) {
			System.out.println("item42 matches");
			Excel.wite_data("Rater_FI", 42, 1, "Pass");
		}else {
			System.out.println("item42 is not matching");
			Excel.wite_data("Rater_FI", 42, 1, "fail");
		}
		
		verifyElement(30, item43);
		String expected43 = Excel.getdata("Rater_FI", 43, 0);
		String actual43 = item43.getText();
		//Assert.assertEquals(actual43, expected43);
		if(actual43.equalsIgnoreCase(expected43)) {
			System.out.println("item43 matches");
			Excel.wite_data("Rater_FI", 43, 1, "Pass");
		}else {
			System.out.println("item43 is not matching");
			Excel.wite_data("Rater_FI", 43, 1, "fail");
		}
		
		verifyElement(30, item44);
		String expected44 = Excel.getdata("Rater_FI", 44, 0);
		String actual44 = item44.getText();
		//Assert.assertEquals(actual44, expected44);
		if(actual44.equalsIgnoreCase(expected44)) {
			System.out.println("item44 matches");
			Excel.wite_data("Rater_FI", 44, 1, "Pass");
		}else {
			System.out.println("item44 is not matching");
			Excel.wite_data("Rater_FI", 44, 1, "fail");
		}
		
        verifyElement(30, item45);
		String expected45 = Excel.getdata("Rater_FI", 45, 0);
		String actual45 = item45.getText();
		//Assert.assertEquals(actual45, expected45);
		if(actual45.equalsIgnoreCase(expected45)) {
			System.out.println("item45 matches");
			Excel.wite_data("Rater_FI", 45, 1, "Pass");
		}else {
			System.out.println("item45 is not matching");
			Excel.wite_data("Rater_FI", 45, 1, "fail");
		}
		
	    verifyElement(30, item46);
		String expected46 = Excel.getdata("Rater_FI", 46, 0);
		String actual46 = item46.getText();
		//Assert.assertEquals(actual46, expected46);
		if(actual46.equalsIgnoreCase(expected46)) {
			System.out.println("item46 matches");
			Excel.wite_data("Rater_FI", 46, 1, "Pass");
		}else {
			System.out.println("item46 is not matching");
			Excel.wite_data("Rater_FI", 46, 1, "fail");
		}
		
		verifyElement(30, item47);
		String expected47 = Excel.getdata("Rater_FI", 47, 0);
		String actual47 = item47.getText();
		//Assert.assertEquals(actual47, expected47);
		if(actual47.equalsIgnoreCase(expected47)) {
			System.out.println("item47 matches");
			Excel.wite_data("Rater_FI", 47, 1, "Pass");
		}else {
			System.out.println("item47 is not matching");
			Excel.wite_data("Rater_FI", 47, 1, "fail");
		}
		
		verifyElement(30, item48);
		String expected48 = Excel.getdata("Rater_FI", 48, 0);
		String actual48 = item48.getText();
		//Assert.assertEquals(actual48, expected48);
		if(actual48.equalsIgnoreCase(expected48)) {
			System.out.println("item48 matches");
			Excel.wite_data("Rater_FI", 48, 1, "Pass");
		}else {
			System.out.println("item48 is not matching");
			Excel.wite_data("Rater_FI", 48, 1, "fail");
		}
		
		verifyElement(60, next1);
		next1.click();
		
		verifyElement(60, importance);
		String expected71 = Excel.getdata("Rater_InstText", 2, 0);
		String actual71 = importance.getText();
		//Assert.assertEquals(actual71, expected71);
		if(actual71.equalsIgnoreCase(expected71)) {
			System.out.println("importance instruction text matches");
			Excel.wite_data("Rater_InstText", 2, 1, "Pass");
		}else {
			System.out.println("importance instruction text is  matching");
			Excel.wite_data("Rater_InstText", 2, 1, "pass");
		}
	
		verifyElement(60, imp1);
		String expected49 = Excel.getdata("Rater_impforsuc", 1, 0);
		String actual49 = imp1.getText();
		//Assert.assertEquals(actual49, expected49);
		if(actual49.equalsIgnoreCase(expected49)) {
			System.out.println("imp1 matches");
			Excel.wite_data("Rater_impforsuc", 1, 1, "Pass");
		}else {
			System.out.println("imp1 is not matching");
			Excel.wite_data("Rater_impforsuc", 1, 1, "fail");
		}
		
		verifyElement(60, imp2);
		String expected50 = Excel.getdata("Rater_impforsuc", 2, 0);
		String actual50 = imp2.getText();
		//Assert.assertEquals(actual50, expected50);
		if(actual50.equalsIgnoreCase(expected50)) {
			System.out.println("imp2 matches");
			Excel.wite_data("Rater_impforsuc", 2, 1, "Pass");
		}else {
			System.out.println("imp2 is not matching");
			Excel.wite_data("Rater_impforsuc", 2, 1, "fail");
		}
		
		verifyElement(60, imp3);
		String expected51 = Excel.getdata("Rater_impforsuc", 3, 0);
		String actual51 = imp3.getText();
		//Assert.assertEquals(actual51, expected51);
		if(actual51.equalsIgnoreCase(expected51)) {
			System.out.println("imp3 matches");
			Excel.wite_data("Rater_impforsuc", 3, 1, "Pass");
		}else {
			System.out.println("imp3 is not matching");
			Excel.wite_data("Rater_impforsuc", 3, 1, "fail");
		}
		
		verifyElement(60, imp4);
		String expected52 = Excel.getdata("Rater_impforsuc", 4, 0);
		String actual52 = imp4.getText();
		//Assert.assertEquals(actual52, expected52);
		if(actual52.equalsIgnoreCase(expected52)) {
			System.out.println("imp4 matches");
			Excel.wite_data("Rater_impforsuc", 4, 1, "Pass");
		}else {
			System.out.println("imp4 is not matching");
			Excel.wite_data("Rater_impforsuc", 4, 1, "fail");
		}
		
		verifyElement(60, imp5);
		String expected53 = Excel.getdata("Rater_impforsuc", 5, 0);
		String actual53 = imp5.getText();
		//Assert.assertEquals(actual53, expected53);
		if(actual53.equalsIgnoreCase(expected53)) {
			System.out.println("imp5 matches");
			Excel.wite_data("Rater_impforsuc", 5, 1, "Pass");
		}else {
			System.out.println("imp5 is not matching");
			Excel.wite_data("Rater_impforsuc", 5, 1, "fail");
		}
		
		verifyElement(60, imp6);
		String expected54 = Excel.getdata("Rater_impforsuc", 6, 0);
		String actual54 = imp6.getText();
		//Assert.assertEquals(actual54, expected54);
		if(actual54.equalsIgnoreCase(expected54)) {
			System.out.println("imp6 matches");
			Excel.wite_data("Rater_impforsuc", 6, 1, "Pass");
		}else {
			System.out.println("imp6 is not matching");
			Excel.wite_data("Rater_impforsuc", 6, 1, "fail");
		}
		
		verifyElement(60, imp7);
		String expected55 = Excel.getdata("Rater_impforsuc", 7, 0);
		String actual55 = imp7.getText();
		//Assert.assertEquals(actual55, expected55);
		if(actual55.equalsIgnoreCase(expected55)) {
			System.out.println("imp7 matches");
			Excel.wite_data("Rater_impforsuc", 7, 1, "Pass");
		}else {
			System.out.println("imp7 is not matching");
			Excel.wite_data("Rater_impforsuc", 7, 1, "fail");
		}
		
		verifyElement(60, imp8);
		String expected56 = Excel.getdata("Rater_impforsuc", 8, 0);
		String actual56 = imp8.getText();
		//Assert.assertEquals(actual56, expected56);
		if(actual56.equalsIgnoreCase(expected56)) {
			System.out.println("imp8 matches");
			Excel.wite_data("Rater_impforsuc", 8, 1, "Pass");
		}else {
			System.out.println("imp8 is not matching");
			Excel.wite_data("Rater_impforsuc", 8, 1, "fail");
		}
		
		verifyElement(60, imp9);
		String expected57 = Excel.getdata("Rater_impforsuc", 9, 0);
		String actual57 = imp9.getText();
		//Assert.assertEquals(actual57, expected57);
		if(actual57.equalsIgnoreCase(expected57)) {
			System.out.println("imp9 matches");
			Excel.wite_data("Rater_impforsuc", 9, 1, "Pass");
		}else {
			System.out.println("imp9 is not matching");
			Excel.wite_data("Rater_impforsuc", 9, 1, "fail");
		}
		
		verifyElement(60, imp10);
		String expected58 = Excel.getdata("Rater_impforsuc", 10, 0);
		String actual58 = imp10.getText();
		//Assert.assertEquals(actual58, expected58);
		if(actual58.equalsIgnoreCase(expected58)) {
			System.out.println("imp10 matches");
			Excel.wite_data("Rater_impforsuc", 10, 1, "Pass");
		}else {
			System.out.println("imp10 is not matching");
			Excel.wite_data("Rater_impforsuc", 10, 1, "fail");
		}
		
		verifyElement(60, imp11);
		String expected59 = Excel.getdata("Rater_impforsuc", 11, 0);
		String actual59 = imp11.getText();
		//Assert.assertEquals(actual59, expected59);
		if(actual59.equalsIgnoreCase(expected59)) {
			System.out.println("imp11 matches");
			Excel.wite_data("Rater_impforsuc", 11, 1, "Pass");
		}else {
			System.out.println("imp11 is not matching");
			Excel.wite_data("Rater_impforsuc", 11, 1, "fail");
		}
		
	    verifyElement(60, next2);
		next2.click();
		
		verifyElement(60, Research);
		String expected72 = Excel.getdata("Rater_InstText", 3, 0);
		String actual72 = Research.getText();
		//Assert.assertEquals(actual72, expected72);
		if(actual72.equalsIgnoreCase(expected72)) {
			System.out.println("Research instruction text matches");
			Excel.wite_data("Rater_InstText", 3, 1, "Pass");
		}else {
			System.out.println("Research instruction text is not matching");
			Excel.wite_data("Rater_InstText", 3, 1, "fail");
		}
	
        verifyElement(60, Rq1);
		String expected61 = Excel.getdata("Rater_RQ", 1, 0);
		String actual61 = Rq1.getText();
		//Assert.assertEquals(actual61, expected61);
		if(actual61.equalsIgnoreCase(expected61)) {
			System.out.println("Rq1 matches");
			Excel.wite_data("Rater_RQ", 1, 1, "Pass");
		}else {
			System.out.println("Rq1  is not matching");
			Excel.wite_data("Rater_RQ", 1, 1, "fail");
		}
		
		verifyElement(60, Rq2);
		String expected62 = Excel.getdata("Rater_RQ", 2, 0);
		String actual62 = Rq2.getText();
		//Assert.assertEquals(actual62, expected62);
		if(actual62.equalsIgnoreCase(expected62)) {
			System.out.println("Rq2 matches");
			Excel.wite_data("Rater_RQ", 2, 1, "Pass");
		}else {
			System.out.println("Rq2  is not matching");
			Excel.wite_data("Rater_RQ", 2, 1, "fail");
		}
		
		verifyElement(60, Rq3);
		String expected63 = Excel.getdata("Rater_RQ", 3, 0);
		String actual63 = Rq3.getText();
		//Assert.assertEquals(actual63, expected63);
		if(actual63.equalsIgnoreCase(expected63)) {
			System.out.println("Rq3 matches");
			Excel.wite_data("Rater_RQ", 3, 1, "Pass");
		}else {
			System.out.println("Rq3  is not matching");
			Excel.wite_data("Rater_RQ", 3, 1, "fail");
		}
		
	    verifyElement(60, Rq4);
		String expected64 = Excel.getdata("Rater_RQ", 4, 0);
		String actual64 = Rq4.getText();
		//Assert.assertEquals(actual64, expected64);
		if(actual64.equalsIgnoreCase(expected64)) {
			System.out.println("Rq4 matches");
			Excel.wite_data("Rater_RQ", 4, 1, "Pass");
		}else {
			System.out.println("Rq4  is not matching");
			Excel.wite_data("Rater_RQ", 4, 1, "fail");
		}
		
		verifyElement(60, Rq5);
		String expected65 = Excel.getdata("Rater_RQ", 5, 0);
		String actual65 = Rq5.getText();
		//Assert.assertEquals(actual65, expected65);
		if(actual65.equalsIgnoreCase(expected65)) {
			System.out.println("Rq5 matches");
			Excel.wite_data("Rater_RQ", 5, 1, "Pass");
		}else {
			System.out.println("Rq5  is not matching");
			Excel.wite_data("Rater_RQ", 5, 1, "fail");
		}
		
		verifyElement(60, Rq6);
		String expected66 = Excel.getdata("Rater_RQ", 6, 0);
		String actual66 = Rq6.getText();
		//Assert.assertEquals(actual66, expected66);
		if(actual66.equalsIgnoreCase(expected66)) {
			System.out.println("Rq6 matches");
			Excel.wite_data("Rater_RQ", 6, 1, "Pass");
		}else {
			System.out.println("Rq6  is not matching");
			Excel.wite_data("Rater_RQ", 6, 1, "fail");
		}
		
		verifyElement(60, nxtgrp3);
		nxtgrp3.click();
		
		verifyElement(60, Rq7);
		String expected67 = Excel.getdata("Rater_RQ", 7, 0);
		String actual67 = Rq7.getText();
		//Assert.assertEquals(actual67, expected67);
		if(actual67.equalsIgnoreCase(expected67)) {
			System.out.println("Rq7 matches");
			Excel.wite_data("Rater_RQ", 7, 1, "Pass");
		}else {
			System.out.println("Rq7  is not matching");
			Excel.wite_data("Rater_RQ", 7, 1, "fail");
		}
		
		verifyElement(60, Rq8);
		String expected68 = Excel.getdata("Rater_RQ", 8, 0);
		String actual68 = Rq8.getText();
		//Assert.assertEquals(actual68, expected68);
		if(actual68.equalsIgnoreCase(expected68)) {
			System.out.println("Rq8 matches");
			Excel.wite_data("Rater_RQ", 8, 1, "Pass");
		}else {
			System.out.println("Rq8  is not matching");
			Excel.wite_data("Rater_RQ", 8, 1, "fail");
		}
		
		verifyElement(60, Rq9);
		String expected69 = Excel.getdata("Rater_RQ", 9, 0);
		String actual69 = Rq9.getText();
		//Assert.assertEquals(actual69, expected69);
		if(actual69.equalsIgnoreCase(expected69)) {
			System.out.println("Rq9 matches");
			Excel.wite_data("Rater_RQ", 9, 1, "Pass");
		}else {
			System.out.println("Rq9  is not matching");
			Excel.wite_data("Rater_RQ", 9, 1, "fail");
		}
		
		verifyElement(60, next3);
		next3.click();
		
		verifyElement(60, written_comments);
		String expected73 = Excel.getdata("Rater_InstText", 4, 0);
		String actual73 = written_comments.getText();
		//Assert.assertEquals(actual73, expected73);
		if(actual73.equalsIgnoreCase(expected73)) {
			System.out.println("written_comments instruction text matches");
			Excel.wite_data("Rater_InstText", 4, 1, "Pass");
		}else {
			System.out.println("written_comments instruction text is not matching");
			Excel.wite_data("Rater_InstText", 4, 1, "fail");
		}
		
		verifyElement(60, wc);
		String expected60 = Excel.getdata("Rater_Wc", 1, 0);
		String actual60 = wc.getText();
		//Assert.assertEquals(actual60, expected60);
		if(actual60.equalsIgnoreCase(expected60)) {
			System.out.println("Written comments matches");
			Excel.wite_data("Rater_Wc", 1, 1, "Pass");
		}else {
			System.out.println("Written comments  is  matching");
			Excel.wite_data("Rater_Wc", 1, 1, "pass");
		}
		
		
		verifyElement(60, review);
		review.click();
		
		
		verifyElement(60, yourResponse);
		String expected74 = Excel.getdata("Rater_InstText", 5, 0);
		String actual74 = yourResponse.getText();
		//Assert.assertEquals(actual74, expected74);
		if(actual74.equalsIgnoreCase(expected74)) {
			System.out.println("yourResponse instruction text matches");
			Excel.wite_data("Rater_InstText", 5, 1, "Pass");
		}else {
			System.out.println("yourResponse instruction text is not matching");
			Excel.wite_data("Rater_InstText", 5, 1, "fail");
		}
		
	}
}
	
	




	
