package TestRunnerClassForActitime;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\DELL\\eclipse-workspace\\FirstCucumberProject\\Features\\CustomerCreation.feature",
		glue="StepDefinationFilesForActitime",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:testoutput"}
		)
public class ActimeTestRunner {
	
	

}
