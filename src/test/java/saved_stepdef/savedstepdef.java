package saved_stepdef;

import org.openqa.selenium.By;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.myaccount_pharma;
import com.pages.saved_pharma;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class savedstepdef {

	Base_driver basedriver = new Base_driver();

	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());
	saved_pharma saved = new saved_pharma(Base_driver.getDriver());

	@Given("^user on login page & login$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();

	}

	@When("^click on menu bar$")
	public void click_on_menu_bar() {
		myaccount.click_on_menu_bar();
	}

	@When("click on saved itom")
	public void click_on_saved_itom() {
		Base_driver.driver.findElement(By.xpath("(//ul[@class='mx-auto']/li)[3]//a")).click();
	}

	@Then("verify all feature are available in saved itom")
	public void verify_all_feature_are_available_in_saved_itom() {
		saved.verify_all_feature_are_available_in_saved_itom();
	}

	@When("select any company and save it")
	public void select_any_company_and_save_it() throws InterruptedException {
		saved.select_any_company_and_save_it();
	}

	@When("select any news and save it")
	public void select_any_news_and_save_it() {
		saved.select_any_news_and_save_it();
	}

	@Then("verify it is coming in saved itom or not")
	public void verify_it_is_coming_in_saved_itom_or_not() throws InterruptedException {
		saved.verify_it_is_coming_in_saved_itom_or_not();
	}

	@Then("verify news is coming in saved itom or not")
	public void verify_news_is_coming_in_saved_itom_or_not() throws InterruptedException {
		saved.verify_news_is_coming_in_saved_itom_or_not();
	}

	@When("select any news and click on external savedicon")
	public void select_any_news_and_click_on_external_savedicon() {
		saved.select_any_news_and_click_on_external_savedicon();
	}

	@Then("verify  message is disaplyed or not")
	public void verify_message_is_disaplyed_or_not() {
		 saved.verify_message_is_disaplyed_or_not();
	}

	@When("select any event and save it")
	public void select_any_event_and_save_it() {
		saved.select_any_event_and_save_it();
	}

	@Then("verify event is coming in saved itom or not")
	public void verify_event_is_coming_in_saved_itom_or_not() throws InterruptedException {
		saved.verify_event_is_coming_in_saved_itom_or_not();
	}

	@Then("verify that event is coming in saved itom or not")
	public void verify_that_event_is_coming_in_saved_itom_or_not() throws InterruptedException {
		saved.verify_that_event_is_coming_in_saved_itom_or_not();
	}

	@When("select any event and click on external savedicon")
	public void select_any_event_and_click_on_external_savedicon() {
		saved.select_any_event_and_click_on_external_savedicon();
	}

	@When("select any blogs and save it")
	public void select_any_blogs_and_save_it() throws InterruptedException {
		saved.select_any_blogs_and_save_it();
	}

	@Then("verify blogs is coming in saved itom or not")
	public void verify_blogs_is_coming_in_saved_itom_or_not() throws InterruptedException {
		saved.verify_blogs_is_coming_in_saved_itom_or_not();
	}

	@When("select any blogs and click on external saved icon")
	public void select_any_blogs_and_click_on_external_saved_icon() throws InterruptedException {
		saved.select_any_blogs_and_click_on_external_saved_icon();
	}

	@When("user on author page")
	public void user_on_author_page() throws InterruptedException {
		saved.user_on_author_page();
	}

	@Then("click on save icon & verify it is saved")
	public void click_on_save_icon_verify_it_is_saved() {
		saved.click_on_save_icon_verify_it_is_saved();
	}

	@When("select any job & save it")
	public void select_any_job_save_it() {
		saved.select_any_job_save_it();
	}

	@Then("verify it is saved or not")
	public void verify_it_is_saved_or_not() {
		saved.verify_it_is_saved_or_not();
	}

	@When("select any job & click on external save icon")
	public void select_any_job_click_on_external_save_icon() {
		saved.select_any_job_click_on_external_save_icon();
	}

}
