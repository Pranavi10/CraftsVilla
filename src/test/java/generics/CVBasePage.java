package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CVBasePage 
{
	public static WebDriver driver;
	public CVBasePage(WebDriver driver)
	{
		this.driver= driver;
	}
		public static void Until_Visible( WebElement hoverelement)
	{
	    try
	    {
	    	WebDriverWait w= new WebDriverWait(driver,10);
	        w.until(ExpectedConditions.visibilityOf(hoverelement));
	        Reporter.log("Text is visible", true);
	    }
	    catch (StaleElementReferenceException e)
	    {
	    	WebDriverWait w= new WebDriverWait(driver,10);
	    	w.until(ExpectedConditions.elementToBeClickable(hoverelement));
	    	Reporter.log("Text is not visible", true);
	    }
	}
	
	public static void verifyTitle(String eTitle)
		{
		 String title=driver.getTitle();
		 eTitle=title;
		
		try
			{
				WebDriverWait wait= new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.titleIs(eTitle));
				Reporter.log("Title is Matching "+eTitle, true);
			}
			catch(Exception e)
			{
				Reporter.log("Title not matching",  true);
				
			}
			
			
		}
		
}
