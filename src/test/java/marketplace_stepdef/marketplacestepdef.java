package marketplace_stepdef;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.marketplace_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class marketplacestepdef {
	Base_driver basedriver = new Base_driver();	
	homepage_pharma homepage=new homepage_pharma(Base_driver.getDriver());
	marketplace_pharma market=new marketplace_pharma(Base_driver.getDriver());
	
	@Given("^user on login page$")
    public void user_on_login_page_login()   {
		homepage.user_on_login_page_login();
    }
	
	@When("click on market place")
	public void click_on_market_place()   {
	     homepage.click_on_marketplace();
	     
	}
	@Then("verify all category is clickable")
	public void verify_all_category_is_clickable() throws InterruptedException   {
	     market.verify_all_category_is_clickable();
	}
	@When("click on any category & search by product")
	public void click_on_any_category_search_by_product() throws InterruptedException {
	     market.click_on_any_category_search_by_product();
	}
	
	@When("click on any category & click on product")
	public void click_on_any_category_click_on_product() {
	     market.click_on_any_category_click_on_product();
	}
	
	@Then("validate both are match")
	public void validate_both_are_match() {
	     market.validate_both_are_match();
	}
	
	@When("click on any company")
	public void click_on_any_company() {
	     market.click_on_any_company();
	     
	}
	@Then("check chat functionality")
	public void check_chat_functionality() {
	    market.check_chat_functionality();
	}

	@Then("check mail functionality")
	public void check_mail_functionality() throws InterruptedException {
	    market.check_mail_functionality();
	}
	@Then("check visiblility of the feature companies")
	public void check_visiblility_of_the_feature_companies() {
	     market.check_visiblility_of_the_feature_companies();
	}
	
	@Then("verify product is visible")
	public void verify_product_is_visible() {
	    market.verify_product_is_visible();
	}
	
	@After
	public void close() {
		//basedriver.driver.quit();
	}
}
