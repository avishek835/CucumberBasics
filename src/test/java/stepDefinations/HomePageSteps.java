package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps {
	
	@Given("^User navigates to Facebook websites$")
	 public void  User_navigates_to_Facebook_websites() throws Throwable
	{
	 System.out.println("@Given--User navigates to Facebook websites");
	    
	}

	@And("^user validate the title$")
	public void user_validate_the_title() throws Throwable
	{
		System.out.println("@And--user validates the title");
	}

}
