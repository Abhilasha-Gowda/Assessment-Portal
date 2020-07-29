package LA_Test_Cases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.LoginPage;
import Pom.Rater_AssessmentPage1;
import Pom.Rater_FormItemCompare;
import generic.Base_Page;
import generic.Excel;
import generic.Generic_Test;

public class Rater_TxtComparision extends Generic_Test {

	@Test
	public void rater_TxtComparision() {
		String username = Excel.getdata("Sheet1", 2, 0);
		String password = Excel.getdata("Sheet1", 2, 1);
		String etitle = Excel.getdata("Sheet1", 2, 2);
		
		test = reports.createTest("rater_TxtComparision", " TE is trying to  compare rater form items and instruction text with requirement ");
		
		LoginPage cp = new LoginPage(driver);
		test.info("rater_TxtComparision scenario started");
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
		test.pass("Rater clicked on survey button");
		rp1.clickOnOpt();
		rp1.clickOnBMKS_LA();
		rp1.clickOni_understand();
		test.pass("Rater checked on i understand checkbox");
		rp1.clickOnstart_survey();
		test.pass("Rater clicked on Start survey button");
		
		Rater_FormItemCompare rfc = new Rater_FormItemCompare(driver);
		rfc.compare_form_items_and_Insttext();
		test.pass("user  is trying to  compared rater form items and instruction text with requirement");
		test.info("rater_TxtComparision scenario ended");
		
	}

	
}
