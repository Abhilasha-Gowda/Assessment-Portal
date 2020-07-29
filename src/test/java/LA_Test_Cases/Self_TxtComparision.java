package LA_Test_Cases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.LoginPage;
import Pom.Self_BehavioursPage;
import Pom.Self_FormItemCompare;
import Pom.Self_InstructionTxtCompare;
import generic.Excel;
import generic.Generic_Test;

public class Self_TxtComparision extends Generic_Test {
	
	@Test
	public void self_txt_comaprision()  {
		
		String username = Excel.getdata("Sheet1", 1, 0);
		String password = Excel.getdata("Sheet1", 1, 1); 
		String etitle = Excel.getdata("Sheet1", 1, 2);
		
		test = reports.createTest("Self_TxtComparision", " TE is trying to  compare Self form items and instruction text with requirement ");
		
		LoginPage cp = new LoginPage(driver);
		test.info("self_txt_comaprision scenario started");
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
		
		Self_FormItemCompare st = new Self_FormItemCompare(driver);
		st.compare_form_items_and_InstText();
		test.pass("user  is trying to  compared self form items and instruction text with requirement");
		test.info("self_txt_comaprision scenario ended");
		
	}
	

}
