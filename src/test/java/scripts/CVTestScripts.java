package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.CVBasePage;
import generics.CVBaseTest;
import generics.CVgenericUtils;
import pom.CVHomePage;

public class CVTestScripts extends CVBaseTest 
{
	
	@Test(enabled=true)
	public void firstTestCase() throws InterruptedException
	{
	CVHomePage c=new CVHomePage(driver);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	CVBasePage.verifyTitle("Ethnic Wear ");
	CVBasePage.Until_Visible(driver.findElement(By.xpath("//*[@id='mega-menu']/div/ul/li[8]/a")));
     CVgenericUtils.mHovering(driver,driver.findElement(By.xpath("//*[@id='mega-menu']/div/ul/li[8]/a")));
    Thread.sleep(3000);
	c.selectEveningKurta();
	/*CVBasePage.Until_Visible(driver.findElement(By.xpath("//*[@id='sortByNone']")));*/
	 new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sortByNone']")));
	c.clickPopularity();
	/*Reporter.log("popularity clicked",true);*/
	Thread.sleep(3000);
	c.kurtaClick();
	Thread.sleep(3000);
	c.selectSize();
	Thread.sleep(3000);
	c.pincodeEnter();
	Thread.sleep(3000);
	c.checkButton();
	Thread.sleep(3000);
	c.addToCartclick();
	Thread.sleep(3000);
	c.accountMenu();
	Thread.sleep(4000);
	c.logoutButton();
	Thread.sleep(4000);
	}
    
    
}
