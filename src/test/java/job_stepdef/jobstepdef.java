package job_stepdef;

import com.factory.Base_driver;
import com.pages.Jobs_pharma;
import com.pages.homepage_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class jobstepdef {

	Base_driver basedriver = new Base_driver();
	Jobs_pharma job = new Jobs_pharma(Base_driver.getDriver());

	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());

	@Given("user on login page & login")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();

	}

	@When("click on job")
	public void click_on_job() {
		homepage.click_on_jobs();
	}

	@Then("verify job logo")
	public void verify_job_logo() {
		job.verify_job_logo();
	}

	@When("click on any job")
	public void click_on_any_job() {
		job.click_on_any_job();
	}

	@Then("validate rateus function")
	public void validate_rateus_function() throws InterruptedException {
		job.validate_rateus_function();
	}

	@When("post job functionality")
	public void post_job_functionality() {
	     job.post_job_functionality();
	}
	@Then("verify it is uploded or not")
	public void verify_it_is_uploded_or_not() {
	     
	}
	@When("click on filter")
	public void click_on_filter() {
	job.click_on_filter();	 
	}

	@Then("put credential validate result")
	public void put_credential_validate_result() throws InterruptedException {
		Thread.sleep(2000);
		 job.put_credential_validate_result();
	}

	@When("add review")
	public void add_review() throws InterruptedException {
		job.click_on_any_job();
		job.add_review();
	}

	@Then("validate  you review")
	public void validate_you_review() {
		job.validate_you_review();
	}

	@Then("verify job name & review is showing")
	public void verify_job_name_review_is_showing() {
		job.verify_job_name_review_is_showing();
	}
	
	@After
	public void close() {
		basedriver.driver.close();
	}

}
