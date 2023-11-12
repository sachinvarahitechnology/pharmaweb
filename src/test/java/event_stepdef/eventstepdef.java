package event_stepdef;

import com.factory.Base_driver;
import com.pages.event_pharma;
import com.pages.homepage_pharma;
import com.pages.news_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class eventstepdef {

	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	event_pharma event = new event_pharma(Base_driver.getDriver());

	@Given("^user on login page$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();
	}

	@When("click on event")
	public void click_on_event() {
		homepage.click_on_event();
	}

	@Then("verify all category is clickable")
	public void verify_all_category_is_clickable() throws InterruptedException {
		event.verify_all_category_is_clickable();
	}

	@Then("verify all event is display with date")
	public void verify_all_event_is_display_with_date() {
		event.verify_all_event_is_display_with_date();
	}

	@Then("verify all event is clickable")
	public void verify_all_event_is_clickable() throws InterruptedException {
		event.verify_all_event_is_clickable();
	}

	@When("click on any event")
	public void click_on_any_event() throws InterruptedException {
		 event.click_on_any_event();
		 Thread.sleep(2000);
	}

	@Then("verify map in eventdetails")
	public void verify_map_in_eventdetails() {
		 event.verify_map_in_eventdetails();
	}

	@Then("verify advertisement")
	public void verify_advertisement() {
		event.verify_advertisement();
	}

	@Then("verify location is clickable")
	public void verify_location_is_clickable() {
		event.verify_location_is_clickable();
	}

	@Then("verify event with its website")
	public void verify_event_with_its_website() {
		event.verify_event_with_its_website();
	}

	@After
	public void close() {
		basedriver.driver.quit();
	}
}
