package com.pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_driver;

public class Jobs_pharma {
	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	
	  
	
	private By jobinfo = By.xpath("(//div[@class='col-6 text-start'])[1]");
	private By firstjobimage = By.xpath("(//img[@class='img-fluid companyImg'])[1]");
	private By firstjobtitle = By.xpath("(//div[@class='col-6 text-start'])[1]");
	private By rateusicon = By.xpath("//span[@class='rate']");
	private By rating = By.xpath("(//i[@class='fa-solid fa-star mt-2 mx-1 starIcons'])[2]");
	private By ratingsubmit = By.xpath("//button[@class='btn btn-success btn-sm']");
	private By review = By.xpath("//li[@class='active']/a");
	private By addreview = By.xpath("//button[@class='addrev mx-2']");
	private By reviewbox = By.xpath("//form[@class='ng-pristine ng-invalid ng-touched']");
	private By post_review = By.xpath("//button[@class='btn btnpost']");
	private By posted_review = By.xpath("//li[@class='mainLI']");
	private By filtericon = By.xpath("//i[@class='fa-solid fa-sliders mt-1']");
	private By filter_location= By.xpath("(//input[@class='form-control my-4 ng-untouched ng-pristine ng-valid'])[1]");
	private By filter_submit= By.xpath("(//button[@class='btn btn-success btn2'])[1]");
	private By post_job= By.xpath("//button[@class=\"btn px-5\"]");
	
	private By job_title= By.xpath("//input[@placeholder=\"Enter Job Title\"]");	
	private By company_name= By.xpath("//input[@placeholder=\"Enter Company Name\"]");
	private By Department_name= By.xpath("//input[@placeholder=\"Enter Department Name\"]");	
	private By company_email= By.xpath("(//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[4]");	
	private By city_name= By.xpath("(//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[5]");
	private By state_name= By.xpath("(//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[6]");	
	private By experiance= By.xpath("(//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[7]");	
	private By job_description= By.xpath("//input[@placeholder=\"Enter Job Description\"]");
	private By company_description= By.xpath("//textarea[@placeholder=\"Enter Company Description\"]");
	private By submit_job_post= By.xpath("(//div[@class=\"col-md-4\"]/button)[1]");
	private By submit_job_post_conformation= By.xpath("//div[@class=\"ng-tns-c74-0 toast-message ng-star-inserted\"]");
	private By post_by= By.xpath("//select[@name=\"PostedBy\"]");
	private By company_logo= By.xpath("//input[@placeholder=\"Enter Company Logo\"]");
	
	private By salary= By.xpath("//select[@formcontrolname=\"Salary\"]");
	private By job_type= By.xpath("//select[@name=\"JobType\"]");
	
	 
	
	public Jobs_pharma(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verify_job_logo() {
		    Base_driver.driver.findElement(firstjobimage).isDisplayed();
	}
	
	public void add_review() throws InterruptedException {
		Base_driver.driver.findElement(review).click();
		 Thread.sleep(2000); 		 
		 Base_driver.driver.findElement(addreview).click();
		Base_driver.driver.findElement(reviewbox).sendKeys("nice one");
		Base_driver.driver.findElement(post_review).click();
	} 
	
	public void post_job_functionality() {
		
		Base_driver.driver.findElement(job_title).sendKeys("Automation_tester");
		Base_driver.driver.findElement(Department_name).sendKeys("tester");		
		Base_driver.driver.findElement(company_name).sendKeys("Varahi Technology");
		Base_driver.driver.findElement(post_by).sendKeys(Keys.DOWN,Keys.ENTER);		
		Base_driver.driver.findElement(company_email).sendKeys("sachin@varahitechnologies.com");
		String imagepath = "C:\\Users\\Pappya\\Pictures\\sign122.jpg";
		Base_driver.driver.findElement(company_logo).sendKeys(imagepath);
		Base_driver.driver.findElement(city_name).sendKeys("pune");
		Base_driver.driver.findElement(state_name).sendKeys("maharastra");
		Base_driver.driver.findElement(salary).sendKeys(Keys.DOWN,Keys.ENTER);
		Base_driver.driver.findElement(job_type).sendKeys(Keys.DOWN,Keys.ENTER);
		
		Base_driver.driver.findElement(experiance).sendKeys("2+");
		Base_driver.driver.findElement(job_description).sendKeys("quality asurance");
		Base_driver.driver.findElement(company_description).sendKeys("tester");
		Base_driver.driver.findElement(submit_job_post).click();
		
	    String jobpost_expected= Base_driver.driver.findElement(submit_job_post_conformation).getText();
	    String jobpost_actual="Job Post submitted successfully! The Post will be published within 24 hours.";
	   junit.framework.Assert.assertEquals(jobpost_expected, "jobpost_actual");
	     
	}

	public void validate_you_review() {
		 List<WebElement>ss= Base_driver.driver.findElements(posted_review);
		 for(int i=0; i<ss.size(); i++) {
			 ss.get(i).getText();
			 if(ss.size()>ss.size()-1) {
				 System.out.println(ss.get(i).getText());
			 }
		 }
	}
	
	public void click_on_any_job() {
		Base_driver.driver.findElement(firstjobtitle).click();
		
	}
	
	public void put_credential_validate_result() {
		WebElement location= Base_driver.driver.findElement(filter_location) ;
		 location.sendKeys("mumbai");
		 Base_driver.driver.findElement(filter_submit).click();
	}
	
	public void click_on_filter() {
		Base_driver.driver.findElement(filtericon).click();
	}
	public void validate_rateus_function() throws InterruptedException {
		Thread.sleep(2000);
		Base_driver.driver.findElement(rateusicon).click();
		Base_driver.driver.findElement(rating).click();
		Base_driver.driver.findElement(ratingsubmit).click();
	}
	
	public void verify_job_name_review_is_showing() {
	    System.out.println( "job name -" +Base_driver.driver.findElement(jobinfo).getText());
	}
	
}
