package blogs_stepdef;

import org.openqa.selenium.By;

import com.factory.Base_driver;
import com.pages.blogs_pharma;
import com.pages.homepage_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class blogstepdef {

	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	blogs_pharma blogs = new blogs_pharma(Base_driver.getDriver());

	@Given("^user on login page$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();
	}

	@When("click on blogs")
	public void click_on_blogs() throws InterruptedException {
		homepage.click_on_blogs();
	}

	@Then("verify author name & title")
	public void verify_author_name_title() {
		blogs.verify_author_name_title();
	}

	@Then("verify blog with time and date")
	public void verify_blog_with_time_and_date() {
		blogs.verify_blog_with_time_and_date();
	}

	@Then("verify like icon in author page")
	public void verify_like_icon_in_author_page() {
		blogs.verify_like_icon_in_author_page();
	}

	@Then("verify blogs with how is posted")
	public void verify_blogs_with_how_is_posted() throws InterruptedException {
		blogs.verify_blogs_with_how_is_posted();
	}

	@Then("verify visible author information")
	public void verify_visible_author_information() {
		blogs.verify_visible_author_information();
	}

	@When("click on write blogs and fillup all field click on submit")
	public void click_on_write_blogs_and_fillup_all_field_click_on_submit() {
		blogs.click_on_write_blogs_and_fillup_all_field_click_on_submit();
	}

	@Then("write blog is posted")
	public void write_blog_is_posted() {
		blogs.write_blog_is_posted();
	}

	@Given("user on write blog page")
	public void user_on_write_blog_page() throws InterruptedException {
		homepage.user_on_login_page_login();
		homepage.click_on_blogs();
		blogs.user_on_write_blog_page();
	}

	@When("user is sign out")
	public void user_is_sign_out() throws InterruptedException {
		blogs.user_is_sign_out();
	}

	@When("again user login with valied credential")
	public void again_user_login_with_valied_credential() {
		blogs.again_user_login_with_valied_credential();
	}

	@Then("validate user on write blog page")
	public void validate_user_on_write_blog_page() {
		blogs.validate_user_on_write_blog_page();
	}

	@After
	public void close() {
		// basedriver.driver.quit();
	}

}
