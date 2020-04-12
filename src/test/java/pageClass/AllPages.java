package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllPages {
	
	WebDriver driver;
	
	public AllPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 @FindBy(xpath="//input[@type='text' and @name='username']") @CacheLookup private WebElement userEmail;
	  @FindBy(name="password") @CacheLookup  private WebElement password;
	  @FindBy(xpath="//input[@type='submit' and @value='Login']") @CacheLookup  private WebElement submit;
	  
	 
	  public void userEmail(String username) {
		    userEmail.sendKeys(username);
		   
	  }
	  
	  public void userPassword(String pass) {
		  password.sendKeys(pass);
	  }
	  
	  public void submit() {
		  submit.click();
	  }
	  

}
