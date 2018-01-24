package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CVBaseTest implements CVAutoConst{

	public static WebDriver driver;

	@BeforeMethod
	public void preCondition() throws InterruptedException
	{
	 driver= new FirefoxDriver();
	 driver.get("http://www.craftsvilla.com/");
	 WebElement  signin=driver.findElement(By.xpath("//span[.='Sign In']"));
	 signin.click();
	/*String wh= driver.getWindowHandle();
	 driver.switchTo().window(wh);*/
	 WebElement emailid=driver.findElement(By.xpath("//label[@for='emailId']"));
	/* WebElement emailid=driver.findElement(By.xpath("//form[@id='login-form']/div[1]"));*/
	 emailid.sendKeys("prakar26.m@gmail.com");
	 Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='continueBtn']")).click();
	/* driver.findElement(By.xpath("//div[.='CONTINUE']")).click();*/
	 Thread.sleep(1000);
	 WebElement pwd=driver.findElement(By.xpath("//input[@id='userPassword']"));
	 pwd.sendKeys("c@123456");
	 driver.findElement(By.id("loginCheck")).click();
	Thread.sleep(3000);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
		//driver.quit();
	}
}
