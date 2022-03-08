package apptestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePackage.primaryclass;
import applicationpages.Apploginpage;

public class Applogintestcase extends primaryclass {

@Test
public void LoginintoApp() {
	
	Apploginpage AP = PageFactory.initElements(driver, Apploginpage.class);
    AP.Loginmethod(Red.Readvalue("login", 0, 0),Red.Readvalue("login", 0, 1));
    
    
    
 // AP.Loginmethod("open1@gmail.com","open1");
}




}
