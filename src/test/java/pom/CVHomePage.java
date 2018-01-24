package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.CVBasePage;

public class CVHomePage extends CVBasePage{

	public CVHomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
     /*@FindBy(xpath="//*[@id='mega-menu']/div/ul/li[8]/a")
        private WebElement mensfashion;
        public void mhoveronmensfashion()
        {
	     mensfashion.click();
        }*/
   @FindBy(xpath="//a[contains(text(),'Eveningwear Kurta Pyjamas')]")
   private WebElement eveningKurta;
   public void selectEveningKurta()
   {
	   eveningKurta.click();
     
   }

   @FindBy(xpath="//*[@id='sortByNone']")
   private WebElement sortPopularity;
   public void clickPopularity()
   {
	   sortPopularity.click();
	   
   }
   /*@FindBy(xpath=".//*[@id='listProducts']/div[1]/div/div[3]/div/div[1]/a/img")*/
   @FindBy(xpath="//div[@data-id='6091545']")
   private WebElement kurtaSelection;
   public void kurtaClick()
   {
	   kurtaSelection.click();
   }
   
   @FindBy(id="size_38")
   private WebElement sizeSelection;
   public void selectSize()
   {
	   sizeSelection.click();
   }
   
   @FindBy(id="pincode_value")
   private WebElement deliveryCode;
   public void pincodeEnter()
   {
	   deliveryCode.sendKeys("500009");
   }

   @FindBy(id="submitpincode")
   private WebElement checkButton;
   public void checkButton()
   {
	checkButton.click();
   }

   @FindBy(id="addtocart")
   private WebElement addtocartButton;
   public void addToCartclick()
   {
	addtocartButton.click();
   }

   
   @FindBy(id="cart-header-login")
   private WebElement accountmenu;
   public void accountMenu()
   {
	   accountmenu.click();
   }
   
   @FindBy(xpath=".//*[@id='loginLogoutResponse']/ul/li[11]/a")
   private WebElement logoutclick;
   public void logoutButton()
   {
	   logoutclick.click();
   }


}
