package forgotstepdef;

import com.factory.Base_driver;
import com.pages.forgot_pharma;
import com.pages.signUp_pharma;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class forgotstepdef {
	
	Base_driver basedriver = new Base_driver();
	forgot_pharma forgot=new forgot_pharma(Base_driver.getDriver());
	
	@Given("user on login page")
	public void user_on_login_page() {

		basedriver.initializedDriver("chrome");
		basedriver.driver.get("https://pharmaclick.co.in/web/auth/login");
		//basedriver.driver.manage().window().maximize();
	}
	
	@When("forgot password link")
    public void forgot_password_link()  {
         forgot.forgot_password_link();
    }
	
	@Then("^enter register mail id(.+)$")
    public void enter_register_mail_id(String id)   {
         forgot.enter_register_mail_id(id);
    }
	
	 
	
	 
	@Then("click on submit button")
    public void click_on_submit_button()   {
         forgot.click_on_submit_button();
    }
	@After
	public void close() {
		basedriver.driver.quit();
	}
	}
