package com.pages;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class share_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	marketplace_pharma market = new marketplace_pharma(Base_driver.getDriver());

	private By activecategories = By.xpath("(//h5[@class='category_title'])[1]");
	private By firstcompany = By.xpath("(//div[@class='row mt-5 compny_Div company_listing_wrapper'])[1]");
	private By shareicon = By.xpath("//i[@class='fa fa-share-alt']");
	private By externalshareicon = By.xpath("(//i[@class='fa fa-share mx-3'])[1]");
	private By externalshareiconblogs = By.xpath("(//i[@class='fa fa-share mx-4'])[1]");

	private By mediatag = By.xpath("//div[@class='social-icons']");
	private By anynews = By.xpath("(//div[@class='row parent_bg'])[1]");
	private By anyevent = By.xpath("//div[@class='container-fluid stepThree eventlist']/div/div");
	private By firstblog = By.xpath("(//div[@class='d-flex authordetails_wrapper'])[1]");
	private By authorname = By.xpath("//h5[@class='name mt-0']");

	
	 Set< String> abc=new HashSet();
	 
	public share_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void select_any_company_go_company_profile() throws InterruptedException {
		Base_driver.driver.findElement(activecategories).click();
		Thread.sleep(3000);
		Base_driver.driver.findElement(firstcompany).click();

	}

	public void click_on_any_event() {
		Base_driver.driver.findElement(anyevent).click();
	}

	public void click_on_any_news() {
		Base_driver.driver.findElement(anynews).click();

	}

	public void click_on_share_icon() {
		Base_driver.driver.findElement(shareicon).click();
	}

	public void click_on_share_icon_first_news() {
		Base_driver.driver.findElement(externalshareicon).click();
	}

	public void click_on_share_icon_first_event() {
		Base_driver.driver.findElement(externalshareicon).click();
	}

	public void click_on_author_name() {
		Base_driver.driver.findElement(authorname).click();
	}

	public void click_on_share_icon_first_blogs() {
		Base_driver.driver.findElement(externalshareiconblogs).click();
	}

	public void click_on_any_blogs() {
		Base_driver.driver.findElement(firstblog).click();
	}

	public void share_diff_media_get_title() throws InterruptedException {

		System.out.println(Base_driver.driver.findElements(By.tagName("a")).size());
		WebElement media2 = Base_driver.driver.findElement(mediatag);

		System.out.println("media size : " + media2.findElements(By.tagName("a")).size());

		for (int i = 0; i < media2.findElements(By.tagName("a")).size(); i++) {

			String clickonmedia = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(4000);
			media2.findElements(By.tagName("a")).get(i).sendKeys(clickonmedia);
			Thread.sleep(4000);
			Set<String> abc = Base_driver.driver.getWindowHandles();
		}
		Set<String> abc = Base_driver.driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			Base_driver.driver.switchTo().window(it.next());
		 
			System.out.println("windows title : " + Base_driver.driver.getTitle());
		}
	}
}
