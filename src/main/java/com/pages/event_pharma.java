package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

public class event_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	login_Pharma loginpage = new login_Pharma(Base_driver.getDriver());

	private By monthlist = By.xpath("//a[@class='newClassItem']");
 

	private By date_time_event = By.xpath("(//div[@class='event_date_bg'])[1]");
	private By Allevent = By.xpath("//h2[@class='event_name']");
	
	private By map = By.xpath("//div[@class='gm-style']");

	private By eventlocation = By.xpath("(//span[@class='Venue_location icon'])[1]");
	private By eventfirst = By.xpath("(//h2[@class='event_name'])[1]");
	private By eventwebsite = By.xpath("(//span[@class='space'])[1]");
	private By event_advertisement = By.xpath("//li[@class='slick-active']/button");

	public event_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void verify_all_event_is_display_with_date() {
		WebElement time = Base_driver.driver.findElement(date_time_event);
		time.isDisplayed();
	}

	public void verify_all_event_is_clickable() throws InterruptedException {

         
		List<WebElement> Alleventlist = Base_driver.driver.findElements(Allevent);
		System.out.println("All event size :" + Alleventlist.size());

		for(int i = 0; i < Alleventlist.size(); i++) {
			Thread.sleep(2000);
			System.out.println("All event list :"+Base_driver.driver.findElements(Allevent).get(i).getText());
			Base_driver.driver.findElements(Allevent).get(i).click();
			Base_driver.driver.navigate().back();
			Thread.sleep(2000);
		}
	}

	public void verify_location_is_clickable() {
		Base_driver.driver.findElement(eventlocation).click();
	}
	
	public void verify_advertisement() {
		Base_driver.driver.findElement(event_advertisement).isDisplayed();
		Base_driver.driver.findElement(event_advertisement).click();
		 
	}
	
	public void click_on_any_event() {
		  List<WebElement> event_list= Base_driver.driver.findElements(Allevent);
		  
		  for(int i=0; i<event_list.size(); i++) {
			  event_list.get(1).click();
		  }
		  
		 
	}
	
	public void verify_map_in_eventdetails() {
		Base_driver.driver.findElement(map).isDisplayed();
	}


	public void verify_event_with_its_website() {

		Base_driver.driver.findElement(eventfirst).click();

		String name = Base_driver.driver.findElement(eventwebsite).getText();
		System.out.println(name.contains("www."));
		Base_driver.driver.findElement(eventwebsite).isEnabled();
	}

	public void verify_all_category_is_clickable() throws InterruptedException {

		List<WebElement> Monthlist = Base_driver.driver.findElements(monthlist);

		System.out.println("Month list :" + Monthlist);
		for (int i = 12; i < Base_driver.driver.findElements(monthlist).size(); i++) {

			System.out.println("All month list :" + Base_driver.driver.findElements(monthlist).get(i).getText());
			Base_driver.driver.findElements(monthlist).get(i).click();
			Thread.sleep(2000);
		}
	}
}
