package signupstepdef;

import org.apache.hc.core5.util.Asserts;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.factory.Base_driver;
import com.pages.signUp_pharma;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;

public class signUpstepdef {
	
	Base_driver basedriver = new Base_driver();
	signUp_pharma signup=new signUp_pharma(Base_driver.getDriver());
	SoftAssert softassert= new SoftAssert();
	
	 
	@Given("user on login page")
	public void user_on_login_page() throws InterruptedException {

		basedriver.initializedDriver("chrome");
		basedriver.driver.get("https://pharmaclick.co.in/web/auth/login");
		Thread.sleep(4000);
		//basedriver.driver.manage().window().maximize();
	}
	
	@When("click on sign up link")
	public void click_on_sign_up_link() {
	     signup.click_on_sign_up_link();
	}

	@Then("signup page is open")
	public void signup_page_is_open() {
		signup.sign_up_page();
	}
	
	@Then("click on sign up button")
    public void click_on_sign_up_button() throws InterruptedException  {
			signup.click_on_sign_upbutton();
    }
	
	@Then("enter all mendatory data")
    public void enter_all_mendatory_data()  {
         signup.enterallmendatory_data();
    }
	
	@Then("^enter first name(.+)$")
    public void enter_first_name(String firstname)   {
     signup.first_name(firstname); 
      
    }
	@Then("^enter last name(.+)$")
    public void enter_last_name(String lastname)  {
        signup.enter_last_name(lastname);
    }
	
	@Then("^enter user name(.+)$")
    public void enter_user_name(String username)   {
        signup.enter_user_name(username);
    }
	
	 
	
	@Then("^enter  mobile number(.+)$")
    public void enter_mobile_number(String number)  {
         signup.enter_valied_mobileNumber(number);
    }
	
	@Then("^enter invalie mailid(.+)$")
    public void enter_invalie_mailid(String id)   {
      signup.invalied_mailid(id);
    }
	
	@Then("^enter  valid mail id(.+)$")
    public void enter_valid_mail_id(String id)  {
         signup.valied_mail_id(id);
    }
	
	@Then("^enter  valid  company name(.+)$")
    public void enter_valid_company_name(String company_name)   {
         signup.valid_company_name(company_name);
    }
	@Then("^enter invalie company name(.+)$")
    public void enter_invalie_company_name(String companyname)   {
       signup.enter_invalie_company_name(companyname);
    }
	
	@Then("^enter  valid  designation name(.+)$")
    public void enter_valid_designation_name(String designationname)   {
       signup.enter_valid_designation_name(designationname);
       }
	
	@Then("^enter invalie designation name(.+)$")
    public void enter_invalie_designation_name(String designationname) {
        signup.enter_invalie_designation_name(designationname);
    }
	
	@Then("^enter password(.+)$")
    public void enter_password(String password2)  {
         signup.enter_password(password2);
    }
	
	@And("^enter conform password(.+)$")
    public void enter_conform_password(String confirmpassword2)  {
        signup.enter_conform_password(confirmpassword2);
    }
	
	@And("^validate both same or not$")
    public void validate_both_same_or_not()  {
         signup.validate_both_same_or_not();
    }
	@And("^use tab functionality$")
    public void use_tab_functionality()   {
         signup.use_tab_functionality();
    }
	@Then("get error")
    public void get_error()  {
         signup.get_error();
    }
	@And("get errorr")
    public void get_errorr()  {
		signup.get_errorr();
    }
	
	@After
	public void close() {
		//basedriver.driver.quit();
	}
	
}
