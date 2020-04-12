package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import base.AllBaseFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageClass.AllPages;

public class LoginFeatureSteps extends AllBaseFile{
	
	
	
	AllPages ap;
	
	@Given("^User navigates to Facebook website$")
	 public void  User_navigates_to_Facebook_website() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		ap=PageFactory.initElements(driver, AllPages.class);//this should called after driver initialised
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com");
		System.out.println("@Given--User navigates to Facebook website");
	    
	}

	@And("^user validates the title$")
	public void user_validates_the_title() throws Throwable
	{
		s=driver.getTitle();
		System.out.println("@And--user validates the title" +s );
	}
	
	@Then("^user provides \"([^\"]*)\" in username field$")
	public void user_provides_username_in_username_field(String username) throws Throwable
	{
		ap.userEmail(username);
		System.out.println("@Then--user provides "+username+" in username field");
		
	}
	
	@And("^user provides \"([^\\\"]*)\" in password field$")
	public void provides_password_and_password_filed(String password) throws Throwable
	{
		ap.userPassword(password);
		System.out.println("@And--user provides "+password+" in password field");
	}
	
	@And("^user click on logged in button$")
	public void user_click_on_logged_in_button() throws Throwable
	{
		ap.submit();
		System.out.println("@And--user click on logged in button");
	}
	
	
	
	@And("^user should view the feed page$")
	public void user_should_view_the_feed_page() throws Throwable
	{
		System.out.println("@And--user should view the feed page");	
	}
	
	

}