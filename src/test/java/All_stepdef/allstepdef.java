package All_stepdef;

import com.factory.Base_driver;
import com.pages.All_pharma;
import com.pages.homepage_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class allstepdef {

	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	All_pharma all = new All_pharma(Base_driver.getDriver());

	@Given("^user on login page$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();
	}

	@When("click on all")
	public void click_on_all() {
		homepage.click_on_all();
	}

	@Then("verify all features show shortly")
	public void verify_all_features_show_shortly() {
		all.verify_all_features_show_shortly();
	}

	@Then("verify all icon is clickable")
	public void verify_all_icon_is_clickable() {
		all.verify_all_icon_is_clickable();
	}

	@Given("user on view all page")
	public void user_on_view_all_page() {
		homepage.user_on_login_page_login();
		homepage.click_on_all();
	}

	@When("author name in blogs")
	public void author_name_in_blogs() throws InterruptedException {
		all.author_name_in_blogs();
	}

	@Then("verify is go their redirect page")
	public void verify_is_go_their_redirect_page() {
		 all.verify_is_go_their_redirect_page();
	}

	@Then("when you click on blog author name is same or not")
	public void when_you_click_on_blog_author_name_is_same_or_not() {
		all.when_you_click_on_blog_author_name_is_same_or_not();
	}

	@Then("validate image is same or not")
	public void validate_image_is_same_or_not() {
		all.validate_image_is_same_or_not();
	}

	@After
	public void close() {
		// basedriver.driver.quit();
	}
}
