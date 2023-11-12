package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.Base_driver;

public class ratecompany_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	homepage_pharma home = new homepage_pharma(Base_driver.getDriver());
	marketplace_pharma market = new marketplace_pharma(Base_driver.getDriver());

	private By ratecompany = By.xpath("//ul[@class='mx-auto']/li[5]//a");
	private By clickanycompany = By.xpath("(//div[@class='row mt-5 compny_Div company_listing_wrapper'])[1]");
	private By rateus = By.xpath("//span[@class='p-1']");
	private By ratingstar = By.xpath("(//i[@class='fa-solid fa-star mt-2 mx-1 starIcons'])[2]");
	private By submitbutton = By.xpath("(//div[@class='modal-footer'])[2]//button[2]");

	public ratecompany_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void click_on_rated_companies() {
		System.out.println(Base_driver.driver.findElement(ratecompany).isEnabled());
	}

	public void click_on_marketplace_select_company() throws InterruptedException {
		home.click_on_marketplace();
		market.click_on_any_category_search_by_product();
		market.click_on_any_company();
		
		Base_driver.driver.findElement(clickanycompany).click();
	}

	public void click_on_ratnign_and_verify() {
		Base_driver.driver.findElement(rateus).click();
		Base_driver.driver.findElement(ratingstar).click();
		Base_driver.driver.findElement(submitbutton).click();
	}

}
