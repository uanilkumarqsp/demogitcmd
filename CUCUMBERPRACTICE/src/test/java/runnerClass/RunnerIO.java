package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
	
		features="C:\\Users\\admin\\Desktop\\Selenium\\CUCUMBERPRACTICE\\src\\test\\java\\featureFiles\\Amazon.feature",
		glue="stepDefinitionClass"
		
		//dryRun=true // it will not launch the browser b
		)


public class RunnerIO {

}
