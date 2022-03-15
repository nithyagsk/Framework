package BasePackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilitypackage.BrowserStore;
import utilitypackage.Helperclass;
import utilitypackage.Readconfigdata;
import utilitypackage.Readexceldata;

public class primaryclass {

	public static WebDriver driver;
	public Readexceldata Red;
	public Readconfigdata Rcf;
	public ExtentReports report;
	public ExtentTest logger;
	
	
	@BeforeSuite
	public void presetup() {
	 Red = new Readexceldata();
	 Rcf = new Readconfigdata();	
	 
	 ExtentSparkReporter extent= new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports1/"+ Helperclass.Datetime() +".html")); 
	 report = new ExtentReports();
	 report.attachReporter(extent);
	}
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		
		driver = BrowserStore.StartBrowser(driver, Rcf.Browserdetail(), Rcf.Urldetails());
		
	//driver = BrowserStore.StartBrowser(driver, "firefox", "https://demo.opencart.com/index.php?route=account/login");
		 System.out.println("driver2="+driver);
	}
	
	
	@AfterMethod
	public void teardownmethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			Helperclass.capturescreenshot(driver);
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		
			{
			Helperclass.capturescreenshot(driver);
			}report.flush();
		
		BrowserStore.QuitBrowser(driver);
	
		
	}
	
	
/*	@AfterMethod

	public void teardown() 
	{
		
		BrowserStore.QuitBrowser(driver);
	}
*/
	
	
	}
	
