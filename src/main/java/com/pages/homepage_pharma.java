package com.pages;

import java.time.Duration;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class homepage_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	login_Pharma loginpage = new login_Pharma(Base_driver.getDriver());

	private By logo = By.xpath("//img[@class='img-fluid logimg']");
	private By menuicon = By.xpath("//i[@class='fa fa-bars menuIcon']");

	private By marketplace = By.xpath("(//div[@class='img'])[1]");
	private By marketplacetext = By.xpath("//h2[contains(text(),'Marketplace')]");

	private By news = By.xpath("(//div[@class='img'])[3]");
	private By newstext = By.xpath("//div[@class='col-10']");

	private By event = By.xpath("(//div[@class='img'])[4]");
	private By eventtext = By.xpath("//div[@class='row mx-1']");

	private By blogs = By.xpath("((//div[@class='img'])[5])//h1/i");
	private By blogstext = By.xpath("//h2[@class='content_heading mb-3']");

	private By job = By.xpath("(//div[@class='img'])[7]");
	private By jobtext = By.xpath("//h2[@class='content_heading mb-3']");

	private By All = By.xpath("(//div[@class='img'])[6]");
	private By ViewAlltext = By.xpath("(//h5[@class='view_all'])[1]");
	
	private By notificationicon = By.xpath("//i[@class='fa fa-bell-o']");
	private By notificationlist = By.xpath("//p[@class='mx-3']");

	public homepage_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void user_on_login_page_login()  {
		basedriver.initializedDriver("chrome");
		basedriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		basedriver.driver.get("https://pharmaclick.co.in/auth/login");
		 
		loginpage.username("sachin@varahitechnologies.com");
		loginpage.passname("1234566@");
		loginpage.term_condition();
		loginpage.button();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		basedriver.driver.get("https://pharmaclick.co.in/web/homepage");
	}

	public void user_on_homepage() {
		String URlhomepage = Base_driver.driver.getCurrentUrl();
		System.out.println(URlhomepage.concat(URlhomepage));
	}

	public void logo_is_displayed() {
		WebElement logoicon = Base_driver.driver.findElement(logo);
		logoicon.isDisplayed();
	}

	public void click_on_jobs() {
		Base_driver.driver.findElement(job).click();
	}

	public void click_on_marketplace() {
		Base_driver.driver.findElement(marketplace).click();
	}

	public void click_on_event() {
		Base_driver.driver.findElement(event).click();
	}

	public void click_on_news() {
		Base_driver.driver.findElement(news).click();
	}

	public void click_on_all() {		
		Base_driver.driver.findElement(All).click();
	}

	public void verify_all_feature_is_open() {
		WebElement Allmsg = Base_driver.driver.findElement(ViewAlltext);
		String msg = Allmsg.getText();
		dev.failsafe.internal.util.Assert.isTrue(true, msg, "View all");
	}

	public void verify_jobs_feature_is_open() {
		WebElement jobsmsg = Base_driver.driver.findElement(jobtext);
		String msg = jobsmsg.getText();
		dev.failsafe.internal.util.Assert.isTrue(true, msg, "JOBS");
	}

	public void verify_blogs_feature_is_open() {
		WebElement blogsmsg = Base_driver.driver.findElement(blogstext);
		String msg = blogsmsg.getText();
		dev.failsafe.internal.util.Assert.isTrue(true, msg, "BLOGS");
	}

	public void click_on_blogs() throws InterruptedException {
		Thread.sleep(2000);
		Base_driver.driver.findElement(blogs).click();
	}

	public void verify_news_feature_is_open() {
		WebElement newsmsg = Base_driver.driver.findElement(newstext);
		String msg = newsmsg.getText();
		dev.failsafe.internal.util.Assert.isTrue(true, msg, "NEWS");
	}

	public void verify_event_feature_is_open() {
		WebElement eventmsg = Base_driver.driver.findElement(eventtext);
		String msg = eventmsg.getText();
		dev.failsafe.internal.util.Assert.isTrue(true, msg, "EVENTS");
	}

	public void verify_feature_is_open() {
		WebElement marketlogo = Base_driver.driver.findElement(marketplacetext);
		String msg = marketlogo.getText();
		dev.failsafe.internal.util.Assert.isTrue(true, msg, "MARKETPLACE");

	}
	public void click_on_notification_icon() {
	     Base_driver.driver.findElement(notificationicon).click();
	}
	public void verify_notification_is_visible() {
		System.out.println( Base_driver.driver.findElement(notificationlist));
	}
}
