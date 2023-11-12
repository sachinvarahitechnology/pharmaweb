package homepage_stepdef;

import org.testng.annotations.AfterTest;

import org.testng.annotations.AfterTest;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.login_Pharma;
import org.testng.asserts.Assertion;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
 
public class homepagestepdef {
	
	Base_driver basedriver = new Base_driver();	
	homepage_pharma homepage=new homepage_pharma(Base_driver.getDriver());
	
	
	@Given("^user on login page & login$")
    public void user_on_login_page_login()     {
		homepage.user_on_login_page_login();
	}
	@Then("^user on homepage$")
    public void user_on_homepage()  {
         homepage.user_on_homepage();
    }
	@Then("^logo is displayed$")
    public void logo_is_displayed()   {
        homepage.logo_is_displayed();
    }
	
	@Then("^click on marketplace$")
    public void click_on_marketplace()   {
        homepage.click_on_marketplace();
    }
	
	@Then("^click on blogs$")
    public void click_on_blogs() throws InterruptedException   {
        homepage.click_on_blogs();
    } 
	
	@Then("^click on jobs$")
    public void click_on_jobs()   {
         homepage.click_on_jobs();
    }
	
	@Then("^click on All$")
    public void click_on_all()   {
        homepage.click_on_all();
    }
	@Then("^verify All feature is open$")
    public void verify_all_feature_is_open()   {
        homepage.verify_all_feature_is_open();
    }
	
	@Then("^verify jobs feature is open$")
    public void verify_jobs_feature_is_open()  {
    homepage.click_on_jobs();
    }
	
	@Then("^verify blogs feature is open$")
    public void verify_blogs_feature_is_open()   {
         homepage.verify_blogs_feature_is_open();
    }
	 @Then("^click on event$")
	    public void click_on_event()  {
	         homepage.click_on_event();
	    }
	 @Then("^verify event feature is open$")
	    public void verify_event_feature_is_open()   {
	      homepage.verify_event_feature_is_open();
	    }
	 @Then("^click on news$")
	    public void click_on_news()  {
	        homepage.click_on_news();
	    }
	 @Then("^verify news feature is open$")
	    public void verify_news_feature_is_open() {
	         homepage.verify_news_feature_is_open();
	    }
	 
	@Then("^verify feature is open$")
    public void verify_feature_is_open()  {
        homepage.verify_feature_is_open();
    }
	
	@Then("click on notification icon")
	public void click_on_notification_icon() {
	     homepage.click_on_notification_icon();
	}
	@Then("verify notification is visible")
	public void verify_notification_is_visible() {
	 homepage.verify_notification_is_visible();    
	}
	
	@After
	public void close() {
		basedriver.driver.close();
	}
}
