package com.pages;

import java.time.Duration;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;
import junit.framework.AssertionFailedError;

public class signUp_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	private By FirstName = By.xpath(
			"//body/app-root[1]/div[1]/app-register[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
	private By firstnameerror = By.cssSelector(
			"div.appComponentMainDiv div.signup_main_wrapper div.container div.row.justify-content-center div.col-xl-4.col-lg-5.col-md-6.col-sm-12 div.signup_inner_wrapper form.ng-invalid.ng-dirty.ng-touched div.col-12.inputDesign:nth-child(2) div.inputContainerFName.input_wrapper > div.invalid-feedback.text-danger");
	private By Lastname = By.xpath(
			"//body/app-root[1]/div[1]/app-register[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]");
	
	private By Lastname_error = By.xpath("//div[contains(text(),'Last name is required')]"); 
	private By username = By.xpath(
			"//body/app-root[1]/div[1]/app-register[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]");
	private By username_error=By.xpath("//div[contains(text(),'User name is required')]");
	
	private By mobileno = By.xpath(
			"//body/app-root[1]/div[1]/app-register[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]");
	
	private By mobileid=By.xpath("//select[@id='']");
	private By mobilenumbererror=By.xpath("(//div[@class='invalid-feedback'])[1]");
	private By mailid = By.xpath(
			"//body/app-root[1]/div[1]/app-register[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]");
	
	private By mail_id_error=By.xpath("(//div[@class='invalid-feedback text-danger'])[5]");
	
	private By companyname = By
			.xpath("/html/body/app-root/div/app-register/div[2]/div/div/div/div/form/div[6]/div/input");
	private By companyname_error=By.xpath("//div[contains(text(),'Company Name is required')]");
	
 	private By designation = By
			.xpath("/html/body/app-root/div/app-register/div[2]/div/div/div/div/form/div[7]/div/input");
	private By designation_error=By.xpath("//div[contains(text(),'Designation is required')]");
	
 	private By password = By.xpath("/html/body/app-root/div/app-register/div[2]/div/div/div/div/form/div[8]/div/input");
 	
 	private By password_error = By.xpath("(//div[@class='invalid-feedback text-danger'])[6]");
 	
 	private By conformpassword = By
			.xpath("/html/body/app-root/div/app-register/div[2]/div/div/div/div/form/div[9]/div/input");
	private By termIcon = By.xpath("//input[@id='accepted1']");

	private By signup = By.xpath("//a[@class=\"signUpLink\"]");
	private By signuppage = By.xpath("//h3[@class=\"main_heading_text text-center mb-5\"]");

	private By signupinternal = By.xpath("//button[@id='id_complete2']");

	private By error = By.xpath("/html/body/app-root/div/app-register/div[2]/div/div/div/div/form/div[9]/div/div[2]");

	public signUp_pharma(WebDriver driver) {
		this.driver = driver;
	}

	  
	
	public void click_on_sign_up_link() {
		Base_driver.driver.findElement(signup).click();
	}

	public void sign_up_page() {
		WebElement logo = Base_driver.driver.findElement(signuppage);
		logo.isDisplayed();
	}

	public void click_on_sign_upbutton() throws InterruptedException {

		JavascriptExecutor jd = (JavascriptExecutor) Base_driver.driver;
		jd.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(5000);
		Base_driver.driver.findElement(termIcon).click();
		
		WebElement asg = Base_driver.driver.findElement(signupinternal);
		asg.click();

	}

	public void enterallmendatory_data() {
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Base_driver.driver.findElement(FirstName).sendKeys("Sachin");
		Base_driver.driver.findElement(Lastname).sendKeys("gadekar");
		Base_driver.driver.findElement(username).sendKeys("Sachin Gadekar");
		Base_driver.driver.findElement(mobileno).sendKeys("9856321478");

		Base_driver.driver.findElement(mailid).sendKeys("sachin@varahitechnologies.com");
		Base_driver.driver.findElement(companyname).sendKeys("varahi technologies");
		Base_driver.driver.findElement(designation).sendKeys("Qa ");
		Base_driver.driver.findElement(password).sendKeys("Varahi@9090");
		Base_driver.driver.findElement(conformpassword).sendKeys("Varahi@9090");

		JavascriptExecutor jd = (JavascriptExecutor) Base_driver.driver;
		jd.executeScript("window.scrollBy(0,300)", "  ");
	}

	public void first_name(String firstname) {
		Base_driver.driver.findElement(FirstName).sendKeys(firstname);
	}
     public void enter_last_name(String lastname)  {
        Base_driver.driver.findElement(Lastname).sendKeys(lastname);
    }
     
     public void enter_user_name(String username)  {
         Base_driver.driver.findElement(this.username).sendKeys(username);
     }

      
     
     public void enter_valied_mobileNumber(String  number) {
    	 WebElement id_country= Base_driver.driver.findElement(mobileid);
    	 Select select= new Select(id_country);
    	 select.selectByValue("+91");
    	 Base_driver.driver.findElement(mobileno).sendKeys(number);
     }
     
     public void invalied_mailid(String id) {
    	 Base_driver.driver.findElement(mailid).sendKeys(id);
     }
     
     public void valied_mail_id(String id) {
    	 Base_driver.driver.findElement(mailid).sendKeys(id);
     }
     
     public void valid_company_name(String company_name) {
    	 Base_driver.driver.findElement(companyname).sendKeys(company_name);
     }
     
     public void enter_invalie_company_name(String companyname)   {
         Base_driver.driver.findElement(this.companyname).sendKeys(companyname);
     }
     
     public void enter_valid_designation_name(String designationname)   {
         Base_driver.driver.findElement(designation).sendKeys(designationname);
     }
     
     public void enter_invalie_designation_name(String designationname) {
         Base_driver.driver.findElement(designation).sendKeys(designationname);
     }
     public void enter_password(String password2)  {
         Base_driver.driver.findElement(password).sendKeys(password2);
     }
     
     public void enter_conform_password(String confirmpassword2)  {
         Base_driver.driver.findElement(conformpassword).sendKeys(confirmpassword2);
     }
     
     public void validate_both_same_or_not()  {
         WebElement passwordd= Base_driver.driver.findElement(password);
         String passwordbox=passwordd.getText();
         
         WebElement confirm_password= Base_driver.driver.findElement(conformpassword);
         String confirm_passwordbox=confirm_password.getText();
         if(passwordbox==confirm_passwordbox) {
        	 System.out.println(" password and confirm password both are same");
         }else {
        	 System.out.println("password and confirm password both are not equal");
         }
     }
     public void use_tab_functionality()   {
    	 
    	 WebElement firstbytab=Base_driver.driver.findElement(By.xpath("//div[@class='col-12 inputDesign']"));
           
         if(firstbytab==null) {
        	 firstbytab.sendKeys(Keys.TAB);
         }
     }
	public void get_error() {

		WebElement errorget = Base_driver.driver.findElement(error);
		String msg = errorget.getText();
		Assert.isTrue(true, msg, "Confirm is required");
	}

	public void get_errorr() {
		
			WebElement geterror= Base_driver.driver.findElement(firstnameerror);
			WebElement geterrorlastname= Base_driver.driver.findElement(Lastname_error);
			WebElement geterrorusername= Base_driver.driver.findElement(username_error);
					
			WebElement geterrormailid=Base_driver.driver.findElement(mail_id_error);
			
			WebElement geterrormobilenumber= Base_driver.driver.findElement(mobilenumbererror);
			
			WebElement geterrorcompanyname= Base_driver.driver.findElement(companyname_error);
			WebElement geterrordesignation=Base_driver.driver.findElement(designation_error);

			WebElement geterrorpassword=Base_driver.driver.findElement(password_error);
			String msg = geterror.getText();
			
			Assert.isTrue(true, msg, "Please Enter valid Mobile Number.");
			 
			 Assert.isTrue(true, msg,  "Designation is required");
				
			Assert.isTrue(true, msg, "Please Enter valid email");
		    Assert.isTrue(true, msg, "Confirm is required");  
			Assert.isTrue(true, msg, "Company Name is required");
			Assert.isTrue(true, msg, "Password must contain more than 8 characters, 1 numeric, 1 upper case letter, and 1 special character($@$!%*?&).");
			 
	}
	
}
