package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


}
