package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;

public class Jobprofile_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());

	private By jobprofile = By.xpath("//ul[@class='mx-auto']/li[2]//a");
	private By editicon = By.xpath("//i[@class='fa-solid fa-pen-to-square penIcon']");
	private By Updatebutton = By.xpath("//button[@class='btn btn-sm updateButtons']");
	private By email_id = By.xpath("(//input[@class='form-control ng-pristine ng-valid ng-touched'])[1]");
	private By Address = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[9]");
	private By website = By.xpath("//body/app-root[1]/div[1]/app-profile[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/div[1]/div[2]/div[1]/input[1]");
	

	public Jobprofile_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void click_on_job_profile() {
		
		Base_driver.driver.findElement(jobprofile).click();
	}

	public void click_on_edit_button_fill_mendatory_data() throws InterruptedException {
		myaccount.click_on_menu_bar();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		Base_driver.driver.findElement(jobprofile).click();
		String phonenumber = "101010";
		myaccount.edit_phonenumber(phonenumber);

	}

	public void click_on_edit_button_enter_valied_mailid() {

		myaccount.click_on_menu_bar();

		Base_driver.driver.findElement(jobprofile).click();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Base_driver.driver.findElement(editicon).click();
		WebElement mailbox = Base_driver.driver.findElement(email_id);
		mailbox.click();
		mailbox.clear();
		mailbox.sendKeys("sachin@gmailc.om");
	}

	public void click_on_edit_button_enter_valied_phonenumber() throws InterruptedException {
		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(jobprofile).click();
		String number = "985632147";
		myaccount.edit_phonenumber(number);
	}

	public void click_on_edit_button_enter_invalied_phonenumber() throws InterruptedException {
		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(jobprofile).click();
		String number = "schin";
		myaccount.edit_phonenumber(number);
	}

	public void click_on_edit_button_enter_valied_position() {
		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(jobprofile).click();
		myaccount.edit_currentposition();
	}

	public void click_on_edit_button_enter_valied_education() throws InterruptedException {
		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(jobprofile).click();
		String education = "BBA";
		myaccount.edit_education(education);
	}

	public void click_on_edit_button_enter_valied_location() throws InterruptedException {
		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(jobprofile).click();
		String location = "Pune";
		myaccount.edit_location(location);
	}

	public void click_on_edit_button_enter_same_phonenumber() {
		
		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(jobprofile).click();
		Base_driver.driver.findElement(editicon).click();
		myaccount.get_number_contact_information();
	}

	public void click_on_edit_button_enter_valied_address() {
		
		Base_driver.driver.findElement(editicon).click();
		WebElement Addressnamebox = Base_driver.driver.findElement(Address);
		Addressnamebox.clear();
		Addressnamebox.sendKeys("Wagholi");
	}

	public void click_on_edit_button_enter_valied_website() {
		
	    WebElement site= Base_driver.driver.findElement(website);
	    String sitename="https://pharmaclick.co.in/web/home/product/category";
	    site.clear();
	    site.sendKeys(sitename);
	}
	
	public void click_on_update() throws InterruptedException {
		myaccount.profile_updated_succesfully();
	}

}
