package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
 

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.factory.Base_driver;

import junit.framework.Assert;

public class marketplace_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	login_Pharma loginpage = new login_Pharma(Base_driver.getDriver());

	private By Allcategories = By.xpath("//ul[@class='category_listing']/li");
	
	private By activecategories = By.xpath("(//h5[@class='category_title'])[1]");
	private By sortby = By.xpath("//select[@class='sorted_Cmp_name']");
	private By clickanycompany = By.xpath("(//div[@class='row mt-5 compny_Div company_listing_wrapper'])[1]");
	private By chaticon = By.xpath("(//img[@class='img-fluid'])[2]");
	private By mailicon = By.xpath("(//img[@class='img-fluid'])[4]");
	private By featurecompanies = By.xpath("//div[@class='featured-companies-sliders']");
	private By subcatagoryincompany = By.xpath("(//a[@class='setposition'])[3]");
	private By Allproductlist = By.xpath("//div[@class='col-11 mt-4']/table");
	private By subjectbox = By.xpath("//input[@class='form-control mb-3 ng-untouched ng-pristine ng-invalid']");
	private By messagebox = By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-valid']");
	private By sendicon = By.id("//*[@id=\"emailEnq\"]/div/div/div[2]/form/button[2]");

	String subjectname="Sachin Testing";
	String messageinmail="Good Morning";
	String ss="";
	
	public marketplace_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void verify_all_category_is_clickable() throws InterruptedException {

		List<WebElement> AllCategory = Base_driver.driver.findElements(Allcategories);

		System.out.println("All category size :" + AllCategory.size());
		for (int i = 0; i < Base_driver.driver.findElements(Allcategories).size(); i++) {

			System.out.println("mycategory : " + Base_driver.driver.findElements(Allcategories).get(i).getText());

			Base_driver.driver.findElements(Allcategories).get(i).click();
			Thread.sleep(2000);
		}
	}

	public void click_on_any_category_search_by_product() throws InterruptedException {
		Thread.sleep(3000);
		Base_driver.driver.findElement(activecategories).click();
		Thread.sleep(5000);
		Base_driver.driver.findElement(subcatagoryincompany).click();

	}
	
	public void click_on_any_category_click_on_product() {
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     Base_driver.driver.findElement(activecategories).click();
	     WebElement sortt = Base_driver.driver.findElement(sortby);
			Select sort = new Select((WebElement) sortt);
			sort.selectByValue("products");
			String ss= Base_driver.driver.findElement(By.xpath("//p[@class='mx-3']")).getText();
	     
	}
	public void validate_both_are_match() {
	     String expected="No Product List Available";
	     Assert.assertEquals(expected, ss);
	}

	public void click_on_any_company() {
		WebElement company = Base_driver.driver.findElement(clickanycompany);
		String companyname = company.getText();
		System.out.println("company name :" + companyname);

	}

	public void check_chat_functionality() {
		WebElement chaticonn = Base_driver.driver.findElement(chaticon);
		chaticonn.getText();
		Assert.fail("chat");
	}

	public void check_mail_functionality() throws InterruptedException {
		
		Base_driver.driver.findElement(clickanycompany).click();
		Base_driver.driver.findElement(mailicon).click();
		Thread.sleep(2000);  
		
		Base_driver.driver.switchTo().activeElement();
	
		WebElement subject = Base_driver.driver.findElement(subjectbox);
		subject.sendKeys(subjectname);
		Thread.sleep(2000);
		subject.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement msg = Base_driver.driver.findElement(messagebox);
		msg.sendKeys(messageinmail);
		Thread.sleep(2000);
		msg.sendKeys(Keys.ENTER);
		
		Base_driver.driver.findElement(sendicon).click();
	}

	public void check_visiblility_of_the_feature_companies() {
		WebElement fcompany = Base_driver.driver.findElement(featurecompanies);
		fcompany.isDisplayed();
	}

	public void verify_product_is_visible() {

		WebElement sortt = Base_driver.driver.findElement(sortby);
		Select sort = new Select((WebElement) sortt);
		sort.selectByValue("products");

		List<WebElement> productlist = Base_driver.driver.findElements(Allproductlist);

		System.out.println("total product are present size;" + productlist.size());

		for (int i = 0; i < Base_driver.driver.findElements(Allproductlist).size(); i++) {
			Base_driver.driver.findElements(Allproductlist).get(i);
			System.out.println(
					"this is all product : " + Base_driver.driver.findElements(Allproductlist).get(i).getText());
		}
	}
}
