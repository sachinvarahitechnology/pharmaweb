package myaccount_stepdef;

import java.awt.AWTException;

import com.factory.Base_driver;
import com.pages.homepage_pharma;
import com.pages.myaccount_pharma;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class myaccountstepdef {
	
	Base_driver basedriver = new Base_driver();	
	 
    myaccount_pharma myaccount=new myaccount_pharma(Base_driver.getDriver());	 
	 homepage_pharma homepage=new homepage_pharma(Base_driver.getDriver());
	
	@Given("^user on homepage$")
    public void user_on_homepage() {
		 homepage.user_on_login_page_login();
		 homepage.user_on_homepage();
    }

    @Given("^user on profile page$")
    public void user_on_profile_page()  {
    	homepage.user_on_login_page_login();
    	myaccount.click_on_menu_bar();
    	myaccount.click_on_myaccount();
    }
	
	@When("^click on menu bar$")
    public void click_on_menu_bar() {
         myaccount.click_on_menu_bar();
    }
	
	@When("^click on myaccount$")
    public void click_on_myaccount()   {
       myaccount.click_on_myaccount();
    }
	
	@When("^edit phonenumber(.+)$")
    public void edit_phonenumber(String phonenumber) throws InterruptedException   {
       myaccount.edit_phonenumber(phonenumber);
    }
	
	@Then("^open profilepage$")
    public void open_profilepage()   {
       myaccount.open_profilepage();
    }
	@Given("^open  on profilepage$")
    public void open_on_profilepage()   {
		myaccount.user_on_loginpage();
        myaccount.click_on_menu_bar();
        myaccount.click_on_myaccount();
    }
	
	@Then("^click on myaccount & fillup all field$")
    public void click_on_myaccount_fillup_all_field() throws InterruptedException    {
		myaccount.click_on_myaccount();
		myaccount.click_on_myaccount_fillup_all_field();
    }
	 
	
	@Then("^profile updated succesfully$")
    public void profile_updated_succesfully() throws InterruptedException     {
       myaccount.profile_updated_succesfully();
    }
	
	@When("^click on pencil icon & attach image$")
    public void click_on_pencil_icon_attach_image() throws InterruptedException    {
       myaccount.click_on_pencil_icon_attach_image();
    }
	
	@When("edit currentposition QA")
	public void edit_currentposition_qa() {
	     myaccount.edit_currentposition();
	    
	}
	@When("edit currentposition123654")
	public void edit_currentposition123654() {
	     myaccount.edit_currentposition123654();
	}
	@When("^edit education(.+)$")
    public void edit_education(String education) throws InterruptedException   {
       myaccount.edit_education(education);
    }
	
	@When("^edit location(.+)$")
    public void edit_location(String location) throws InterruptedException   {
       myaccount.edit_location(location);
    }
	
	@Then("verify image successfully uploaded")
	public void verify_image_successfully_uploaded() {
	    
	}
 
	 
	 	
	
	@Then("get error")
	public void get_error() {
	    myaccount.get_error();
		
	}
	@After
	public void close() {
		//basedriver.driver.quit();
	}
	 
}
