package chat_stepdef;

import com.factory.Base_driver;
import com.pages.chat_pharma;
import com.pages.homepage_pharma;
import com.pages.myaccount_pharma;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class chatstepdef {
	
	Base_driver basedriver = new Base_driver();
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());
	chat_pharma chat = new chat_pharma(Base_driver.getDriver());
	
	@Given("^user on login page$")
	public void user_on_login_page_login() {
		homepage.user_on_login_page_login();
	}
	
	@When("^click on menu bar$")
	public void click_on_menu_bar() {
		myaccount.click_on_menu_bar();
	}
	
	@Then("click on chat verify it is openor not")
	public void click_on_chat_verify_it_is_openor_not() {
	    chat.click_on_chat_verify_it_is_openor_not();
	}

}
