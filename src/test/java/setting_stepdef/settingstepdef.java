package setting_stepdef;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.myaccount_pharma;
import com.pages.setting_pharma;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class settingstepdef {

	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	setting_pharma setting = new setting_pharma(Base_driver.getDriver());
	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());

	@Given("^user on login page & login$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();

	}
	@When("^click on menu bar$")
    public void click_on_menu_bar() {
         myaccount.click_on_menu_bar();
    }

	@When("click on menu bar & click ion setting")
	public void click_on_menu_bar_click_ion_setting() throws InterruptedException {
		setting.click_on_menu_bar_click_ion_setting();
	}

	@Then("verify all feature is prese or not")
	public void verify_all_feature_is_prese_or_not() throws InterruptedException {
		setting.verify_all_feature_is_prese_or_not();
	}

	@Then("click on change password & verify password is change")
	public void click_on_change_password_verify_password_is_change() throws InterruptedException {
		setting.click_on_change_password_verify_password_is_change();
	}

	@Then("click on rate Us option")
	public void click_on_rate_us_option() {
		 setting.click_on_rate_us_option();
	}
	
	@Then("click on privacy and verify")
	public void click_on_privacy_and_verify() {
	     setting.click_on_privacy_and_verify();
	}
	@Then("click on help & verify")
	public void click_on_help_verify() {
	     setting.click_on_help_verify();
	}
	
	@Then("click on contactUs & verify")
	public void click_on_contact_us_verify() {
	    setting.click_on_contact_us_verify();
	}
	
	@Then("click on notification")
	public void click_on_notification() {
	     
	}

}
