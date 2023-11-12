package ratecompanies_stepdef;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.myaccount_pharma;
import com.pages.ratecompany_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ratecompanystepdef {
	
	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());
    ratecompany_pharma ratecompany = new ratecompany_pharma(Base_driver.getDriver());

	@Given("^user on login page & login$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();
	}
	
	@When("^click on menu bar$")
    public void click_on_menu_bar() {
         myaccount.click_on_menu_bar();
    }
	
	@Then("click on Rated companies")
	public void click_on_rated_companies() {
	     ratecompany.click_on_rated_companies();
	}
	
	@When("click on marketplace & select company")
	public void click_on_marketplace_select_company() throws InterruptedException {
	     ratecompany.click_on_marketplace_select_company();
	}
	@Then("click on Ratnign and verify")
	public void click_on_ratnign_and_verify() {
	    ratecompany.click_on_ratnign_and_verify();
	}
	@After
	public void close() {
		//basedriver.driver.quit();
	}
}
