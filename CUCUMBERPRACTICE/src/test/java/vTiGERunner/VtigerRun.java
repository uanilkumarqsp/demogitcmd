package vTiGERunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="./src/test/java/vTiGERfeatureFiles/VtigerLogin.feature",
		glue="vTiGERStepDefination"
		
		//dryRun=true // it will not launch the browser b
		)

public class VtigerRun {

}
