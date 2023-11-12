package loginwith_stepdef;

import com.factory.Base_driver;
import com.pages.loginwith_pharma;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginwithstepdef {
	Base_driver basedriver = new Base_driver();
	loginwith_pharma loginwith=new loginwith_pharma(Base_driver.getDriver());
	
	@Given("user on login page")
	public void user_on_login_page() {

		basedriver.initializedDriver("firefox");
		basedriver.driver.get("https://pharmaclick.co.in/web/auth/login");
		//basedriver.driver.manage().window().maximize();
	}
	
	@When("^click on loginwithgoogle link$")
    public void click_on_loginwithgoogle_link() throws InterruptedException  {
        loginwith.click_on_loginwithgoogle_link();
    }
	
	@When("^display login icon$")
    public void display_login_icon()   {
      loginwith.display_login_icon();
    }
	
	@After
	public void close() {
		basedriver.driver.quit();
	}
}
