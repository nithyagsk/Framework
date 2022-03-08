package BasePackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utilitypackage.BrowserStore;
import utilitypackage.Readconfigdata;
import utilitypackage.Readexceldata;

public class primaryclass {

	public static WebDriver driver;
	public Readexceldata Red;
	public Readconfigdata Rcf;
	
	@BeforeSuite
	public void presetup() {
	 Red = new Readexceldata();
	 Rcf = new Readconfigdata();	
	}
	
	
	
	
	@BeforeClass
	public void setup()
	{
		
		driver = BrowserStore.StartBrowser(driver, Rcf.Browserdetail(), Rcf.Urldetails());
		
	//driver = BrowserStore.StartBrowser(driver, "firefox", "https://demo.opencart.com/index.php?route=account/login");
		 System.out.println("driver2="+driver);
	}


	@AfterClass

	public void teardown() 
	{
		
		BrowserStore.QuitBrowser(driver);
	}

}
