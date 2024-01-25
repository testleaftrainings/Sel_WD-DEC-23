package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.ProjectSpecificMethod;


@CucumberOptions(features={"src/test/java/features/CreateLead.feature","src/test/java/features/Login.feature"},
				glue="stepDefinition",
				monochrome = true,
				publish =true)
public class CreateLeadRunner extends ProjectSpecificMethod {

}
