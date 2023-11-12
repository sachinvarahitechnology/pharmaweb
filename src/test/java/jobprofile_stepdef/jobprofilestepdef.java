package jobprofile_stepdef;

import com.factory.Base_driver;
import com.pages.Jobprofile_pharma;
import com.pages.homepage_pharma;
import com.pages.myaccount_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class jobprofilestepdef {

	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());
	Jobprofile_pharma jobpro = new Jobprofile_pharma(Base_driver.getDriver());

	@Given("^user on login page & login$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();

	}

	@When("^click on menu bar$")
	public void click_on_menu_bar() {
		myaccount.click_on_menu_bar();
	}

	@Then("click on job profile")
	public void click_on_job_profile() {
		jobpro.click_on_job_profile();
	}

	@When("click on edit button & fill mendatory data")
	public void click_on_edit_button_fill_mendatory_data() throws InterruptedException {
		jobpro.click_on_edit_button_fill_mendatory_data();
	}

	@Then("click on update")
	public void click_on_update() throws InterruptedException {
		jobpro.click_on_update();
	}

	@When("click on edit button &  enter valied mailid")
	public void click_on_edit_button_enter_valied_mailid() {
		jobpro.click_on_edit_button_enter_valied_mailid();
	}

	@When("click on edit button &  enter valied phonenumber")
	public void click_on_edit_button_enter_valied_phonenumber() throws InterruptedException {
		jobpro.click_on_edit_button_enter_valied_phonenumber();
	}

	@When("click on edit button &  enter invalied phonenumber")
	public void click_on_edit_button_enter_invalied_phonenumber() throws InterruptedException {
		jobpro.click_on_edit_button_enter_invalied_phonenumber();
	}

	@When("click on edit button & enter valied position")
	public void click_on_edit_button_enter_valied_position() {
		jobpro.click_on_edit_button_enter_valied_position();
	}

	@When("click on edit button & enter valied education")
	public void click_on_edit_button_enter_valied_education() throws InterruptedException {
		jobpro.click_on_edit_button_enter_valied_education();
	}

	@When("click on edit button & enter valied location")
	public void click_on_edit_button_enter_valied_location() throws InterruptedException {
		jobpro.click_on_edit_button_enter_valied_location();
	}

	@When("click on edit button & enter same phonenumber")
	public void click_on_edit_button_enter_same_phonenumber() {
		jobpro.click_on_edit_button_enter_same_phonenumber();
	}

	@When("click on edit button & enter valied address")
	public void click_on_edit_button_enter_valied_address() {
		jobpro.click_on_edit_button_enter_valied_address();
	}
	
	@When("click on edit button & enter valied website")
	public void click_on_edit_button_enter_valied_website() {
	     jobpro.click_on_edit_button_enter_valied_website();
	}

	@After
	public void close() {
		// basedriver.driver.quit();
	}
}
