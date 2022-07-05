package TestRunnerClassFornopcommerce;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\DELL\\eclipse-workspace\\FirstCucumberProject\\FearturesFilesOfnopcommerce\\Login.feature",
		glue="StepDefinationFilesFornopcommerce",
		dryRun= false,
		monochrome=true,
		plugin= {"pretty","html:testout"}
		)
public class FirstTestRunnerClass {

}
