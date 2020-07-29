package Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generic.Base_Page;
import generic.Excel;

public class Self_InstructionTxtCompare extends Base_Page {
	
	@FindBy(xpath="//i[@class='fa fa-info-circle survey info-button']")
	private WebElement info1;
	
	@FindBy(xpath="//span[contains(text(),'Each behavior is presented with the scale displaye')]")
	private WebElement behaviours_infoText;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt1;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt2;
	
	@FindBy(xpath="//button[contains(text(),'Importance for Success')]")
	private WebElement ImpForSuc;
	
	@FindBy(xpath="//i[@class='fa fa-info-circle survey info-button']")
	private WebElement info2;
	
	@FindBy(xpath="//span[contains(text(),'From the following list, select five competencies')]")
	private WebElement ImpForSuc_infoText;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt3;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt4;
	
	@FindBy(xpath="//button[contains(text(),'Written Comments')]")
	private WebElement writtenComments;
	
	@FindBy(xpath="//i[@class='fa fa-info-circle survey info-button']")
	private WebElement info3;
	
	@FindBy(xpath="//span[contains(text(),'Please answer the following questions. Your respon')]")
	private WebElement writtencomment_infoText;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt5;
	
	@FindBy(xpath="//i[@class='fa fa-bars fa-2x']")
	private WebElement opt6;
	
	@FindBy(xpath="//button[contains(text(),'Your Responses')]")
	private WebElement yourResponses;
	
	@FindBy(xpath="//i[@class='fa fa-info-circle survey info-button']")
	private WebElement info4;
	
	@FindBy(xpath="//span[contains(text(),'Review your responses. It will not be possible to')]")
	private WebElement yourResponse_infoText;

	public Self_InstructionTxtCompare(WebDriver driver) {
		super(driver);
		
	}
	
	public void verify_InstructionText() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		/*verifyElement(60, info1);
		info1.click();
		
		verifyElement(60, behaviours_infoText);
		String expected1 = Excel.getdata("InfoText", 1, 0);
		String actual1 = behaviours_infoText.getText();
		Assert.assertEquals(actual1, expected1);
		if(actual1.equalsIgnoreCase(expected1)) {
			System.out.println("behaviours_infoText matches");
			Excel.wite_data("InfoText", 1, 1, "Pass");
		}else {
			System.out.println("behaviours_infoText is not matching");
			Excel.wite_data("InfoText", 1, 1, "fail");
		}*/
		
		verifyElement(60, opt1);
		opt1.click();
		
		verifyElement(60, ImpForSuc);
		ImpForSuc.click();
		
		verifyElement(60, info2);
		info2.click();
		
		verifyElement(60, ImpForSuc_infoText);
		String expected2 = Excel.getdata("InfoText", 2, 0);
		String actual2 = ImpForSuc_infoText.getText();
		Assert.assertEquals(actual2, expected2);
		if(actual2.equalsIgnoreCase(expected2)) {
			System.out.println("ImpForSuc_infoText matches");
			Excel.wite_data("InfoText", 2, 1, "Pass");
		}else {
			System.out.println("ImpForSuc_infoText is not matching");
			Excel.wite_data("InfoText", 2, 1, "fail");
		}
		
		verifyElement(60, opt3);
		opt3.click();
		
		verifyElement(60, opt4);
		opt4.click();
		
		verifyElement(60, writtenComments);
		writtenComments.click();
		
		verifyElement(60, info3);
		info3.click();
		
		verifyElement(60, writtencomment_infoText);
		String expected3 = Excel.getdata("InfoText", 3, 0);
		String actual3 = writtencomment_infoText.getText();
		Assert.assertEquals(actual3, expected3);
		if(actual3.equalsIgnoreCase(expected3)) {
			System.out.println("writtencomment_infoText matches");
			Excel.wite_data("InfoText", 3, 1, "Pass");
		}else {
			System.out.println("writtencomment_infoText is not matching");
			Excel.wite_data("InfoText", 3, 1, "fail");
		}
		
		verifyElement(60, opt5);
		opt5.click();
		
		verifyElement(60, opt6);
		opt6.click();
		
		verifyElement(60, yourResponses);
		yourResponses.click();
		
		verifyElement(60, info4);
		info4.click();
		
		verifyElement(60, yourResponse_infoText);
		String expected4 = Excel.getdata("InfoText", 4, 0);
		String actual4 = yourResponse_infoText.getText();
		Assert.assertEquals(actual4, expected4);
		if(actual4.equalsIgnoreCase(expected4)) {
			System.out.println("yourResponse_infoText matches");
			Excel.wite_data("InfoText", 4, 1, "Pass");
		}else {
			System.out.println("yourResponse_infoText is not matching");
			Excel.wite_data("InfoText", 4, 1, "fail");
		}
	}

}
