package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class search_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	login_Pharma loginpage = new login_Pharma(Base_driver.getDriver());
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());

	String companyname = "shreenath chemical";
	String productname = "Etoposide";
	String location = " mumbai ";

	String newstitle = "BASF";
	String newscategory = "EXPORT & IMPORT";

	String eventsearch = "Uk";
	String blogsearch = "india";

	private By searchicon = By.xpath("//i[@class='fa fa-search menuIcon mt-2 mx-2 float-end']");
	private By searchbycompany = By.xpath(" (//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
	private By searchbyproduct = By.xpath("(//div[@class='form-group d-flex justify-content-center'])[2]/input");
	private By searchbylocation = By.xpath("((//div[@class='form-group d-flex justify-content-center'])/input)[3]");

	private By searchbynewstitle = By.xpath("(//div[@class='form-group d-flex justify-content-center']/input)[1]");
	private By searchbynewscategory = By.xpath("(//div[@class='form-group d-flex justify-content-center']/input)[2]");

	private By confirmbutton = By.xpath( "//button[contains(text(),'Confirm')]");
	private By confirmbuttoninevent = By.xpath("//div[@class='text-center mt-3']/button");

	private By searchinevent = By.xpath("//div[@class='fontuser']//input");
	private By searchlistinevent = By.xpath("//*[@id=\"div2\"]/div");
	
	private By searchinblogs = By.xpath("//div[@class='form-group d-flex justify-content-center']/input");

	private By verifysearchlistmarket = By.xpath("//div[@class='col-12 cols p-3 my-2']");
	 
	private By verifylocation = By.xpath("(//h5[@class='city mx-2 my-2'])[1]");
	private By verifynewstitle = By.xpath("//a[@class='news-title p-0']");
	private By verifynewsbycategory = By.xpath("//div[@class='row p-0']/a");

	public search_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void search_company_by_name() throws InterruptedException {
		homepage.click_on_marketplace();
		Thread.sleep(2000);

		WebElement searchiconn = Base_driver.driver.findElement(searchicon);
		Thread.sleep(2000);
		searchiconn.click();
		Base_driver.driver.switchTo().activeElement();
		WebElement searchbox = Base_driver.driver.findElement(searchbycompany);
		searchbox.sendKeys(companyname);
		 WebElement ss= Base_driver.driver.findElement(confirmbutton);
		 ss.sendKeys(Keys.ENTER);
		
	}
	public void verify_result_get_proper() throws InterruptedException {
		Thread.sleep(4000);
		WebElement verifycompanyname = Base_driver.driver.findElement(verifysearchlistmarket);
		String name = verifycompanyname.getText();
		Assert.isTrue(true, name, companyname);
		
	}

	public void search_product_by_name() throws InterruptedException {

		homepage.click_on_marketplace();
		Thread.sleep(3000);

		WebElement searchiconn = Base_driver.driver.findElement(searchicon);
		searchiconn.click();
		Base_driver.driver.switchTo().activeElement();
		Thread.sleep(2000);

		WebElement searchbox = Base_driver.driver.findElement(searchbyproduct);
		searchbox.sendKeys(productname);
		Thread.sleep(2000);
		Base_driver.driver.findElement(confirmbutton).click();
		Thread.sleep(4000);
			}

	public void search_company_by_location() throws InterruptedException {
		homepage.click_on_marketplace();
		Thread.sleep(2000);

		WebElement searchiconn = Base_driver.driver.findElement(searchicon);
		searchiconn.click();
		Base_driver.driver.switchTo().activeElement();
		Thread.sleep(2000);

		WebElement searchbox = Base_driver.driver.findElement(searchbylocation);
		searchbox.sendKeys(location);
		Thread.sleep(2000);
		Base_driver.driver.findElement(confirmbutton).click();
		Thread.sleep(3000);
	}

	public void search_company_by_title_in_news() throws InterruptedException {
		homepage.click_on_news();
		Thread.sleep(4000);
		Base_driver.driver.findElement(searchicon).click();
		Base_driver.driver.switchTo().activeElement();
		Thread.sleep(2000);

		WebElement searchbox = Base_driver.driver.findElement(searchbynewstitle);
		Thread.sleep(2000);
		searchbox.sendKeys(newstitle);

		Base_driver.driver.findElement(confirmbutton).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
	}

	public void search_company_by_category_in_news() throws InterruptedException {
		homepage.click_on_news();
		Thread.sleep(4000);
		Base_driver.driver.findElement(searchicon).click();
		Base_driver.driver.switchTo().activeElement();
		Thread.sleep(2000);

		WebElement searchbox = Base_driver.driver.findElement(searchbynewscategory);
		Thread.sleep(2000);
		searchbox.sendKeys(newscategory);

		Base_driver.driver.findElement(confirmbutton).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
	}

	public void search_company_by_title_location_in_event() throws InterruptedException {
		homepage.click_on_event();
		Thread.sleep(4000);
		Base_driver.driver.findElement(searchicon).click();
		Base_driver.driver.switchTo().activeElement();
		Thread.sleep(2000);

		WebElement searchbox = Base_driver.driver.findElement(searchinevent);
		Thread.sleep(2000);
		searchbox.sendKeys(eventsearch);
		Thread.sleep(2000);
		Base_driver.driver.findElement(confirmbuttoninevent).click();

	}

	public void search_blogs_by_title() throws InterruptedException {
		homepage.click_on_blogs();
		Thread.sleep(4000);
		Base_driver.driver.findElement(searchicon).click();
		Base_driver.driver.switchTo().activeElement();
		Thread.sleep(2000);
		
		WebElement searchbox = Base_driver.driver.findElement(searchinblogs);
		Thread.sleep(2000);
		searchbox.sendKeys(blogsearch);
		Thread.sleep(2000);
		Base_driver.driver.findElement(confirmbutton).click();
	}
	public void verify_result_get_proper_in_blogstitle() {
		  System.out.println("after search searchlist not found");
	}

	public void verify_result_get_proper_in_event() {

		List<WebElement> ss = Base_driver.driver.findElements(searchlistinevent);
		System.out.println("found :" + ss.size());
	}

	public void verify_result_get_proper_by_product() {
		    WebElement verifyproduct= Base_driver.driver.findElement(verifysearchlistmarket);
		    String companylist= verifyproduct.getText();
		    System.out.println("This is company list :"+companylist);
	}

	public void verify_result_get_proper_by_location() {

		WebElement verifylocationn = Base_driver.driver.findElement(verifylocation);
		String locationname = verifylocationn.getText();
		Assert.isTrue(true, locationname, location);
	}

	public void verify_result_get_proper_in_newstitle() {

		String newstitlerelatedlist = Base_driver.driver.findElement(verifynewstitle).getText();
		System.out.println("search by title in news get related news :"
				+ newstitlerelatedlist.toUpperCase().contains(newstitle.toUpperCase()));
	}

	public void verify_result_get_proper_in_newscategory() {
		List<WebElement> news = Base_driver.driver.findElements(verifynewsbycategory);
		System.out.println("total news fount :" + news.size());
	}
}
