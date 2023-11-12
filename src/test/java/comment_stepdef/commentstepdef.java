package comment_stepdef;

import com.factory.Base_driver;
import com.pages.blogs_pharma;
import com.pages.comment_pharma;
import com.pages.homepage_pharma;
import com.pages.news_pharma;
import com.pages.share_pharma;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class commentstepdef {
	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	 comment_pharma comment = new comment_pharma(Base_driver.getDriver());
	 blogs_pharma blog = new blogs_pharma(Base_driver.getDriver());
	
	@Given("^user on login page & login$")
    public void user_on_login_page_login()   {
		homepage.user_on_login_page_login();
		
    }
	
	@When("select any news and comment it")
	public void select_any_news_and_comment_it() throws InterruptedException {
	     comment.select_any_news_and_comment_it();
	}
	
	@Then("verify comment is successfully uploaded")
	public void verify_comment_is_successfully_uploaded() {
	     comment.verify_comment_is_successfully_uploaded();
	}
	
	@Then("verify comment count is increses")
	public void verify_comment_count_is_increses() {
	     comment.verify_comment_count_is_increses();
	}
	
	@When("select any blog and comment it")
	public void select_any_blog_and_comment_it() throws InterruptedException {
	     comment.select_any_blog_and_comment_it();
	}
	
	@When("select any blog")
	public void select_any_blog() throws InterruptedException {
		homepage.click_on_blogs();
	     blog.click_on_any_blog();
	}
	@Then("click on optinal comment icon")
	public void click_on_optinal_comment_icon() {
	 comment.click_on_optinal_comment_icon();   
	}
	
	@Then("verify comment is successfully uploaded in blogs")
	public void verify_comment_is_successfully_uploaded_in_blogs() {
	     comment.verify_comment_is_successfully_uploaded_in_blogs();
	}

	@After
	public void close() {
		//basedriver.driver.quit();
	}
}
