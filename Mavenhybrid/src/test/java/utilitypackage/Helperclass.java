package utilitypackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helperclass {

//capture screenshot, alerts, frames, date time format
	
	public static void capturescreenshot(WebDriver driver) {
		
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 try {
		FileHandler.copy(src, new File("./screenshots/"+ Datetime() +".png"));
	System.out.println("captured screenshot");
	 
	 } catch (IOException e) {
	 System.out.println("unable to caputure screenshot");
	}
	}

public static String Datetime() {
	
	
	DateFormat cusformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date currentdate = new Date();
    return cusformat.format(currentdate);
} 

}
