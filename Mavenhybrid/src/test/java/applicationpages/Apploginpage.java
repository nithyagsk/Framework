package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Apploginpage {

WebDriver driver;
public Apploginpage(WebDriver ldriver) {
	this.driver=ldriver;
	//PageFactory.initElements(driver,this);
	System.out.println("driver3="+driver);
}

// ("driver3="+ driver);
@FindBy(id="input-email") WebElement emailfield;

@FindBy(id = "input-password") WebElement passwordfield;

@FindBy(xpath = "//input[@value='Login']") WebElement loginbutton;

@FindBy (xpath = "//div[text()=' Warning: No match for E-Mail Address and/or Password.']") WebElement alertmessage;
@FindBy(linkText ="Forgotten Password") WebElement forgotpasswordlink;
@FindBy(linkText = "Register") WebElement RmenuReglink;
@FindBy(xpath = "//a[normalize-space()='login page']") WebElement Rpgloginlink;
@FindBy(xpath = "//body/div[@id='account-register']/div[1]/aside[1]/div[1]/a[1]") WebElement Rmenuloginlink;
@FindBy(xpath = "//a[@title='My Account']") WebElement MyaccountDropdown;
@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") WebElement MyAcddloginlink;
@FindBy(xpath ="//ul[@class='breadcrumb']//a[normalize-space()='Login']") WebElement Breadcrumbloginpage;





public void Loginmethod(String usermail, String userpass) {
	
try {
	Thread.sleep(2000);
} catch (InterruptedException e) 

{	
}	
	
emailfield.sendKeys(usermail);
passwordfield.sendKeys(userpass);
loginbutton.click();


}

public WebElement alertmessage() {
	
 	
	return alertmessage;
}

public void forgotpasswordlink() {
	
 forgotpasswordlink.click();

}
public void LoginFromReg() {
 
	RmenuReglink.click();
	Rpgloginlink.click();
	System.out.println(driver.getTitle());
	//Assert.assertEquals(driver.getTitle(),"Account Login");
	Assert.assertEquals(driver.getTitle(),"Account Login" , "Not able to navigate to login page from registration page(login page link )");
	/*if(driver.getTitle()=="Account Login") {
		Assert.assertTrue(true, "Not able to navigate to login page from registration page(login page link )");
	}*/
	
	
}
public  void LoginFromRegRmenu() {
	RmenuReglink.click();
	Rmenuloginlink.click();
	Assert.assertEquals(driver.getTitle(),"Account Login");
	/*if(driver.getTitle()=="Account Login")
    {
    Assert.assertTrue(true, "not able to navigate to login page from registrationpage(right menu option)");
}*/
}

public void LoginFromMyaccdropdown() {
	
	MyaccountDropdown.click();
	MyAcddloginlink.click();

	Assert.assertEquals(driver.getTitle(),"Account Login");
	
	/*if(driver.getTitle()=="Account Login")
    {
    Assert.assertTrue(true, "not able to navigate to login page from My AccountDrop down");
}*/
}

public void Loginpagedetailsbreadcrmb() {
	
	Assert.assertEquals(Breadcrumbloginpage.getText(),"Login");
  /*	if(Breadcrumbloginpage.getText()=="Login")
	{
		Assert.assertTrue(true, "not able to find login-breadcrumb");
	}*/
}

public void Loginpagedetails() {
	
	Assert.assertEquals(driver.getTitle(),"Account Login");
	
	/*if(driver.getTitle()== "Account Login")
{
Assert.assertTrue(true, "not able to verify, mismatch in login page title");
}*/
	System.out.println("...driver.getCurrentUrl()"+driver.getCurrentUrl());
  //
	Assert.assertEquals(driver.getCurrentUrl(),"https://demo.opencart.com/index.php?route=account/login" );
	
	
}




}