package share_stepdef;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.share_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sharestepdef {
	
	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	share_pharma share= new share_pharma(Base_driver.getDriver());
	
	@Given("^user on login page$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();
	} 
	
	@When("click on market place")
	public void click_on_market_place()   {
	     homepage.click_on_marketplace();
	     
	}
	
	@When("click on news")
	public void click_on_news() {
	     homepage.click_on_news();
	}
	@When("click on blogs")
	public void click_on_blogs() throws InterruptedException   {
	     homepage.click_on_blogs();
	     
	}
	@When("click on any news")
	public void click_on_any_news() {
	     share.click_on_any_news();
	}
	@When("click on any blogs")
	public void click_on_any_blogs() {
	    share.click_on_any_blogs();
	}
	
	@Then("click on share icon first news")
	public void click_on_share_icon_first_news() {
	     share.click_on_share_icon_first_news();
	}
	@When("click on event")
	public void click_on_event() {
	     homepage.click_on_event();
	}
	@When("click on any event")
	public void click_on_any_event() {
	     share.click_on_any_event();
	}
	@Then("click on share icon first blogs")
	public void click_on_share_icon_first_blogs() {
	     share.click_on_share_icon_first_blogs();
	}
	
	@Then("click on author name")
	public void click_on_author_name() {
	     
	}
	@When("select any company & go company profile")
	public void select_any_company_go_company_profile() throws InterruptedException {
	     share.select_any_company_go_company_profile();
	}
	@Then("click on share icon")
	public void click_on_share_icon() {
	     share.click_on_share_icon();
	}
	
	@Then("click on share icon first event")
	public void click_on_share_icon_first_event() {
	    share.click_on_share_icon_first_event();
	}

	@Then("share diff media & get title")
	public void share_diff_media_get_title() throws InterruptedException {
	     share.share_diff_media_get_title();
	}
	
	@After
	public void close() {
		//basedriver.driver.quit();
	}
}
