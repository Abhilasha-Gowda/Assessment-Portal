package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class LoginPage extends Base_Page{
	
	@FindBy(xpath="//input[@id='1-email']")
	private WebElement uname;
	
	@FindBy(xpath="//input[@placeholder='your password']")
	private WebElement pword;
	
	@FindBy(xpath="//span[.='Log In']")
	private WebElement login;
	

	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public void setusername(String username) {
		
		verifyElement(5, uname);
		uname.sendKeys(username);
	}
	
    public void setpassword(String password) {
    	
    	verifyElement(5, pword);
		pword.sendKeys(password);
	}
    
   public void clicklogin() {
    	
    	verifyElement(5, login);
		login.click();
	}
	
	

}
