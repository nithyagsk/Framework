package apptestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.primaryclass;
import applicationpages.Apploginpage;

public class Applogintestcase extends primaryclass {

	
@Test(priority=1)
public void LoginintoApp() {
	 logger=report.createTest("applogintestcase0");
	  
	 //Apploginpage AP = new Apploginpage(driver);
	 Apploginpage AP= PageFactory.initElements(driver, Apploginpage.class);
	 AP.Loginmethod(Red.Readvalue("login", 0, 0),Red.Readvalue("login", 0, 1));
    logger.info("validate using valid credentials");
    System.out.println(driver.getTitle());
   Assert.assertEquals(driver.getTitle(), "My Account");
    logger.pass("Login successful ");
    
    
    
 // AP.Loginmethod("open1@gmail.com","open1");
}

@Test(priority=2)
public void TC_002() {
 logger=report.createTest("applogintestcase1");
 // Apploginpage An = new Apploginpage(driver);
Apploginpage An= PageFactory.initElements(driver, Apploginpage.class);
An.Loginmethod(Red.Readvalue("login", 1, 0),Red.Readvalue("login", 1, 1));
logger.info("validate using invalid credentials");	
System.out.println(An.alertmessage().getText());
Assert.assertEquals(An.alertmessage().getText(), "Warning: No match for E-Mail Address and/or Password.");
logger.info("passed  test for invalid credentials");
}

@Test(priority=3)
public void TC_003() {
	
	logger=report.createTest("applogintestcase2");
	 // Apploginpage An = new Apploginpage(driver);
	Apploginpage Am= PageFactory.initElements(driver, Apploginpage.class);
	Am.Loginmethod(Red.Readvalue("login", 2, 0),Red.Readvalue("login", 2, 1));
	logger.info("validate with blank credentials");	

	logger.info("test passed for blank credentials");	
	
}
  @Test(priority=4)
public void TC_004()
{
	logger = report.createTest("applogintestcase3");
	Apploginpage Aq= PageFactory.initElements(driver, Apploginpage.class);
	Aq.forgotpasswordlink();
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Forgot Your Password?");
	logger.info("validating forgot password link");
}
@Test(priority=5)
public void TC_005()
{
	logger = report.createTest("applogintestcase4");
	Apploginpage At = PageFactory.initElements(driver, Apploginpage.class);
	At.LoginFromReg();
	At.LoginFromRegRmenu();
	At.LoginFromMyaccdropdown();
	logger.info("validating different ways to navigate to login page");
}
@Test(priority=6)
public void TC_006()
{
	logger = report.createTest("applogintestcase5");
	Apploginpage AL = PageFactory.initElements(driver, Apploginpage.class);
	AL.Loginpagedetailsbreadcrmb();
	AL.Loginpagedetails();
    logger.info("validating login page breadcrumb, page title, page url");
} 

}
