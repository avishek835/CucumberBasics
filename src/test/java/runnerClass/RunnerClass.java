package runnerClass;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class) //Junit
@CucumberOptions(
		 strict=true,
		
		 features= {"classpath:LoginFeature.feature","classpath:HomePage.feature"},
		
		 glue={"stepDefinations"}
		 )

public class RunnerClass {
	
	}
