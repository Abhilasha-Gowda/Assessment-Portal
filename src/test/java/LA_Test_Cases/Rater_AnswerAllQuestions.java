package LA_Test_Cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.LoginPage;
import Pom.Rater_AssessmentPage1;
import Pom.Rater_ImpForSuccess;
import Pom.Rater_ResearchQuest;
import Pom.Rater_WrittenComments;
import generic.Base_Page;
import generic.Excel;
import generic.Generic_Test;

public class Rater_AnswerAllQuestions extends Generic_Test{

	@Test
	public void operation()  {
		
		String username = Excel.getdata("Sheet1", 2, 0);
		String password = Excel.getdata("Sheet1", 2, 1);
		String etitle = Excel.getdata("Sheet1", 2, 2);
		
		test = reports.createTest("Rater_AnswerAllQuestions", " Rater is  answering all questions to submit survey ");
		
		LoginPage cp = new LoginPage(driver);
		test.info("Rater_AnswerAllQuestions scenario started");
		cp.setusername(username);
		test.pass("Rater entered username");
		cp.setpassword(password);
		test.pass("Rater entered password");
		cp.clicklogin();
		test.pass("Rater clicked on login button");
		String atitle = driver.getTitle();
		System.out.println(atitle);
		cp.verifyTitle(5, atitle);
		test.pass("title verified");
		Assert.assertEquals(atitle, etitle);
		
		Rater_AssessmentPage1 rp1 = new Rater_AssessmentPage1(driver);
		rp1.clickOnSurvey();
		test.pass("Rater clicked on survey Button");
		rp1.clickOnOpt();
		rp1.clickOnBMKS_LA();
		rp1.clickOni_understand();
		test.pass("Rater clicked on I Understand checkbox");
		rp1.clickOnstart_survey();
		test.pass("Rater clicked on Start survey button");
        rp1.clickOnResponses_1to16();
        test.pass("Rater answered all 1-16 questions in first page");
        rp1.clickOnNextgrp1();
        test.pass("Rater clicked on Nextgroup");
        rp1.clickOnOpt1();
        rp1.clickOnBehavours1();
        rp1.clickOnResponses_17to32();
        test.pass("Rater answered all 17-32 questions in second page");
        rp1.clickOnNextgrp2();
        test.pass("Rater clicked on Nextgroup");
        rp1.clickOnOpt2();
        rp1.clickOnBehavours2();
        rp1.clickOnResponses_33to48();
        test.pass("Rater answered all 33-48 questions in third page");
        rp1.clickOnNext1();
        test.pass("Rater clicked on Next button");
        
        Rater_ImpForSuccess rp2 = new Rater_ImpForSuccess(driver);
        rp2.checkboxes();
        test.pass("Rater clicked on five most important for success");
        
        Rater_ResearchQuest rp3 = new Rater_ResearchQuest(driver);
        rp3.research_questions();
        test.pass("Rater answered Rsearch questions");
        
        Rater_WrittenComments rp4 = new Rater_WrittenComments(driver);
        rp4.written_comments();
        test.pass("Rater gave comments");
        
	}
		
		
}
