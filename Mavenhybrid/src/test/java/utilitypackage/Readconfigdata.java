package utilitypackage;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfigdata {

	public Properties prop;
	
	public Readconfigdata() {
		
		prop = new Properties();
		
		try {
		
			//String SrcFile = "../config/config.Properties";
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91807\\eclipse-workspace\\Mavenhybrid\\config\\config.Properties");
		
			prop.load(fis);
		} catch (Exception e) {
		
			System.out.println("unable to find properites file"+e.getMessage());
		}
		
		
	}
	
	// include methods for returning values
	
	public String Browserdetail() {
		
		return prop.getProperty("Browser");
		
	}
	
    public String Urldetails() {
		return prop.getProperty("Appurl");
    	
    	
    }
  // later we can include methods to search for any key value
}
