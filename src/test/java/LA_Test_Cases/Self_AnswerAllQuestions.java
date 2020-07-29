package LA_Test_Cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.Self_BehavioursPage;

import Pom.LoginPage;
import Pom.Self_ImpForSuccess;
import Pom.Self_WrittenComments;
import Pom.Self_YrResponses;
import generic.Excel;
import generic.Generic_Test;

public class Self_AnswerAllQuestions extends Generic_Test{
	
	@Test
	public void operation() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		String username = Excel.getdata("Sheet1", 1, 0);
		String password = Excel.getdata("Sheet1", 1, 1);
		String etitle = Excel.getdata("Sheet1", 1, 2);
		
		test = reports.createTest("Self_AnswerAllQuestions", " Participant is  answering all questions to submit survey ");
		
		LoginPage cp = new LoginPage(driver);
		test.info("Self_AnswerAllQuestions scenario started");
		cp.setusername(username);
		test.pass("participant entered username");
		cp.setpassword(password);
		test.pass("participant entered password");
		cp.clicklogin();
		test.pass("participant clicked on login button");
		String atitle = driver.getTitle();
		System.out.println(atitle);
		cp.verifyTitle(5, atitle);
		test.pass("title verified");
		Assert.assertEquals(atitle, etitle);
		
		Self_BehavioursPage ap = new Self_BehavioursPage(driver);
		
		ap.my_surveys();
		test.pass("participant clicked on my survey link");
		ap.self_button();
		test.pass("participant clicked on my self button of BMKSLA survey");
		ap.clickOnResponses1to16();
		test.pass("participant answered all 1-16 questions in first page");
		ap.nextGrp1();
		test.pass("participant clicked on Nextgroup");
		ap.opt1();
		ap.behaviour1();
		ap.clickOnResponses17to32();
		test.pass("participant answered all 17-32 questions in second page");
		ap.nextGrp2();
		test.pass("participant clicked on Nextgroup");
		ap.opt2();
		ap.behaviour2();
		ap.clickOnResponses33to48();
		test.pass("participant answered all 33-48 questions in third page");
		ap.next1();
		test.pass("participant clicked on Next button");
		
		Self_ImpForSuccess si = new Self_ImpForSuccess(driver);
		si.checkboxes();
		test.pass("participant clicked on five most important for success");
		
		Self_WrittenComments sw = new Self_WrittenComments(driver);
		sw.writtenComments();
		test.pass("participant gave comments");
		sw.clickOnReview();
		test.pass("participant clicked on Review button");
		
		/*Self_YrResponses sy = new Self_YrResponses(driver);
		sy.clickOnsubmit();
		test.pass("participant clicked on Submit button");
		test.info("Self_AnswerAllQuestions scenario ended");*/
	}

}
