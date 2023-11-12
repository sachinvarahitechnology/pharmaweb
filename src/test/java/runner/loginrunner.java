package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"./src/test/resources/Features/job.feature"},
		
		glue={"job_stepdef"},
		monochrome = true,
		dryRun = false, 
		tags = "@Job_post",   
		plugin = {
						"pretty",
						"html: test-report"
						}
		)

	public class loginrunner {
	
}
