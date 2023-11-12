package search_stepdef;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.search_pharma;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchstepdef {
	Base_driver basedriver = new Base_driver();

	search_pharma search = new search_pharma(Base_driver.getDriver());
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());

	@Given("^user on login page & login$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();

	}

	@When("search company by name")
	public void search_company_by_name() throws InterruptedException {
		search.search_company_by_name();
	}

	@When("search company by title in news")
	public void search_company_by_title_in_news() throws InterruptedException {
		search.search_company_by_title_in_news();
	}

	@When("search product by name")
	public void search_product_by_name() throws InterruptedException {
		search.search_product_by_name();
	}

	@When("search company by location")
	public void search_company_by_location() throws InterruptedException {
		search.search_company_by_location();
	}

	@Then("verify result get proper")
	public void verify_result_get_proper() throws InterruptedException {
		search.verify_result_get_proper();
	}

	@Then("verify result get proper by product")
	public void verify_result_get_proper_by_product() {
		search.verify_result_get_proper_by_product();
	}

	@Then("verify result get proper by location")
	public void verify_result_get_proper_by_location() {
		search.verify_result_get_proper_by_location();
	}

	@Then("verify result get proper in newstitle")
	public void verify_result_get_proper_in_newstitle() {
		search.verify_result_get_proper_in_newstitle();

	}

	@When("search company by category in news")
	public void search_company_by_category_in_news() throws InterruptedException {
		search.search_company_by_category_in_news();
	}

	@Then("verify result get proper in newscategory")
	public void verify_result_get_proper_in_newscategory() {
		search.verify_result_get_proper_in_newscategory();
	}

	@When("search company by title\\/location in event")
	public void search_company_by_title_location_in_event() throws InterruptedException {
		search.search_company_by_title_location_in_event();
	}

	@Then("verify result get proper in event")
	public void verify_result_get_proper_in_event() {
		search.verify_result_get_proper_in_event();
	}

	@When("search blogs by title")
	public void search_blogs_by_title() throws InterruptedException {
		 search.search_blogs_by_title();
	}

	@Then("verify result get proper in blogstitle")
	public void verify_result_get_proper_in_blogstitle() {
		 search.verify_result_get_proper_in_blogstitle();
	}

}
