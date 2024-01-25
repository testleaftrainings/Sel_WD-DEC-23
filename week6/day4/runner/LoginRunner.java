package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.ProjectSpecificMethod;


@CucumberOptions(features="src/test/java/features",
					glue="stepDefinition",
					monochrome=true,
					publish=true,
					tags ="@regression")
	
public class LoginRunner extends ProjectSpecificMethod {

}