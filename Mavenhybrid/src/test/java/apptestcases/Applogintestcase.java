package apptestcases;

import org.openqa.selenium.support.PageFactory;
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

logger.info("passed  test for invalid credentials");
}

@Test(priority=3)
public void TC_003() {
	
	logger=report.createTest("applogintestcase2");
	 // Apploginpage An = new Apploginpage(driver);
	Apploginpage Am= PageFactory.initElements(driver, Apploginpage.class);
	Am.Loginmethod(Red.Readvalue("login", 2, 0),Red.Readvalue("login", 2, 1));
	logger.info("validate using invalid credentials");	

	logger.info("passed  test for invalid credentials");	
	
}


}
