package news_stepdef;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.news_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newsstepdef {

	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	news_pharma news = new news_pharma(Base_driver.getDriver());

	@Given("^user on login page$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();
	}

	@When("click on news")
	public void click_on_news() {
		homepage.click_on_news();
	}
	
	@Then("verify all category is clickable")
	public void verify_all_category_is_clickable() throws InterruptedException {
		Thread.sleep(3000);
	     news.verify_all_category_is_clickable();
	}
	@Then("verify all images are different")
	public void verify_all_images_are_different() {
	    news.verify_all_images_are_different();
	}
	@Then("news select by category")
	public void news_select_by_category() throws InterruptedException {
		Thread.sleep(3000);
	     news.news_select_by_category();
	}
	
	@Then("visible with time")
	public void visible_with_time() {
	     news.visible_with_time();
	}
	
	@When("scroll all category & count news")
	public void scroll_all_category_count_news() throws InterruptedException {
		news.scroll_all_category_count_news();
	     
	}
	@Then("same count for diff category section")
	public void same_count_for_diff_category_section() {
	     
	}

	
	@Then("visible yesterday news")
	public void visible_yesterday_news() {
	   news.visible_yesterday_news();
	}
	@After
	public void close() {
		//basedriver.driver.quit();
	}
}
