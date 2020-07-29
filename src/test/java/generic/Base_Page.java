package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base_Page {
	
	public WebDriver driver;
	
	public Base_Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle(int seconds, String title){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try{
		wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e){
			System.out.println("page not displayed");
		}
	}
	public void verifyElement(int seconds, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try{
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e){
			System.out.println("element not found");
		}
		
	}
		
	public void verifyElements(int seconds,List<WebElement> elements){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try{
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		}
		catch(Exception e){
			System.out.println("element not found");
		}
		
	}
	
	public void presenceofele(int seconds, String xpath){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try{
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		}
		catch(Exception e){
			System.out.println("element not present");
		}
	}
	
	public void clickableElement(int seconds, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch(Exception e){
			System.out.println("element not clickable");
		}
	}
}
