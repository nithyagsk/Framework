package utilitypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStore {
	
		
	public static WebDriver	StartBrowser(WebDriver driver, String Browsername, String appURL) {
		
		
		if(Browsername.equalsIgnoreCase("chrome"))
		{
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(Browsername.equalsIgnoreCase("firefox")) {
			
		WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		
		}
		else
			System.out.println("Browser not supported");
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

		
		
		
	}
		
	public static void QuitBrowser(WebDriver driver) {
		
	driver.quit();
	}
	}
	

