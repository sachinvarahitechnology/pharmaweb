package logout_stepdef;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.myaccount_pharma;
import com.pages.signout_pharma;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutstepdef {
	
	Base_driver basedriver = new Base_driver();	
	
	
	myaccount_pharma myaccount=new myaccount_pharma(Base_driver.getDriver());	 
	 homepage_pharma homepage=new homepage_pharma(Base_driver.getDriver());
	  signout_pharma signout=new signout_pharma(Base_driver.getDriver());
	
	@Given("^user on homepage$")
   public void user_on_homepage() {
		 homepage.user_on_login_page_login();
		 homepage.user_on_homepage();
   }
	
	@When("^click on menu bar$")
    public void click_on_menu_bar() {
         myaccount.click_on_menu_bar();
    }
	
	@Then("click on logout & logout successfully")
	public void click_on_logout_logout_successfully() {
	     signout.click_on_logout_logout_successfully();
	}
}
