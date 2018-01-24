package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CVgenericUtils extends CVBaseTest{
	public static void gSelectByIndex(WebElement element, int n)
    {
    	Select select=new Select(element);
   	select.selectByIndex(n);
    }
  
    public static void gSelectByValue(WebElement element,String Value)
  {
	   Select select =new Select(element);
	   select.selectByValue(Value);
  }
    
  public static void gSelctByVisibleTEst(WebElement element,String V)
  {
 	Select select= new Select(element);
 	select.selectByVisibleText(V);
 }
  
 
  public static void mHovering(WebDriver driver,WebElement element)
  {
	
    Actions actions=new Actions(driver);
    actions.moveToElement(element).click().perform();
	
  }
  public static void sortListBox(WebElement element)
 {
 	Select s= new Select(element);
 	List<WebElement> li=s.getOptions();
 	ArrayList<String> a=new ArrayList<String>();
 	ArrayList<String> a1=new ArrayList<String>();
 	for(int i=1;i<li.size();i++)
 	{
 		String st=li.get(i).getText();
 		a.add(st);
 		a1.add(st);
    }
     Collections.sort(a);
 
	for(int i=0;i<a.size();i++)
	{
	  if(!(a1.get(i).equals(a.get(i))))
	  {
		Reporter.log("List is not sorted",true);
	   }
	}
    Reporter.log("List is sorted");	
 	
 } 

}
