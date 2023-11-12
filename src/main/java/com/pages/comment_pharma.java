package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

public class comment_pharma {
	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	news_pharma news = new news_pharma(Base_driver.getDriver());
	share_pharma share = new share_pharma(Base_driver.getDriver());
	homepage_pharma homepage = new homepage_pharma(Base_driver.getDriver());
	blogs_pharma blog = new blogs_pharma(Base_driver.getDriver());

	private By tagname = By.tagName("div");
	// private By centre_wrapper = By.xpath("//div[@class='row']/div[2]");
	private By centre_wrapper = By.xpath("//div[@class='row justify-content-center']");
	private By commentinnews = By.xpath("(//form[@class='ng-untouched ng-pristine ng-invalid'])[1]/textarea");
	private By commentboxinblog = By.xpath("(//form[@class='ng-untouched ng-pristine ng-invalid']/textarea)[1]");

	private By postbuttoninnews = By.xpath("//button[@class='btn btnpost']");
	private By postedcommentinnews = By.xpath("//div[@class='col-9']");
	private By postedcommentinblogs = By.xpath("(//div[@class='col-12'])[2]");

	private By commentcount = By.xpath("//h5[@class='mx-3 news_heading']");
	private By center = By.xpath("//div[@class='main scroll_slider']");
	private By optionalcommenticon = By.xpath("//i[@class='fa fa-comment-o mx-2']");

	String comm = "";

	public comment_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void select_any_news_and_comment_it() throws InterruptedException {

		homepage.click_on_news();
		Thread.sleep(3000);
		share.click_on_any_news();
		String comm = "impressive";
		Base_driver.driver.findElement(commentinnews).sendKeys(comm);
		Base_driver.driver.findElement(postbuttoninnews).click();
	}

	public void verify_comment_count_is_increses() {
		System.out.println("comment count" + Base_driver.driver.findElement(commentcount).getText());
	}

	public void select_any_blog_and_comment_it() throws InterruptedException {

		homepage.click_on_blogs();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		blog.click_on_any_blog();
		String comment = "more impressive";
		Base_driver.driver.findElement(commentboxinblog).sendKeys(comment);
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Base_driver.driver.findElement(postbuttoninnews).sendKeys(Keys.ENTER);
	}

	public void verify_comment_is_successfully_uploaded() {

		WebElement newscomment = Base_driver.driver.findElement(postedcommentinnews);
		System.out.println("posted Comment in news :" + newscomment);	
	}
	public void verify_comment_is_successfully_uploaded_in_blogs() {
		WebElement blogcomment = Base_driver.driver.findElement(postedcommentinblogs);
		System.out.println("posted Comment in blog :" + blogcomment);
	}

	public void click_on_optinal_comment_icon() {
       WebElement ss= Base_driver.driver.findElement(optionalcommenticon);
         System.out.println(ss.isEnabled());
	}
}
