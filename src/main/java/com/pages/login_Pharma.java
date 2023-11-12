package com.pages;

import java.time.Duration;

import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.handler.resumable.PropertiesBasedResumableProcessor;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;

public class login_Pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	private By email = By.id("username");
	private By password = By.id("pass");
	private By button = By.xpath("/html/body/app-root/div/app-login/div/div/div[1]/div/div[2]/form/div[6]/div/button");
	private By terms = By.xpath("//*[@id=\"accepted1\"]");
	private By logo = By.xpath("/html/body/app-root/div/app-homepage/app-header1/div/div[1]/div/div[2]/div/img");
	private By geterror = By.xpath("//*[@id=\"warning\"]/h4");
	private By remember = By.xpath("//*[@id=\"remember_me\"]");
	private By termandcondition = By.xpath("/html/body/app-root/div/app-login/div/div/div[1]/div/div[2]/form/div[5]/div/label/a");
	private By term_policy = By.xpath("/html/body/app-root/div/app-termscondition/div[2]/div[1]/div/h2");
	private By eyes=By.xpath("/html/body/app-root/div/app-login/div/div/div[1]/div/div[2]/form/div[2]/div/span");
	private By plz_register=By.xpath("//div[@class='invalid-feedback mx-2']");
	
	public login_Pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void username(String username) {
		Base_driver.driver.findElement(email).sendKeys(username);
	}

	public void passname(String passname) {
		Base_driver.driver.findElement(this.password).sendKeys(passname);

	}

	 
	public void click_on_remember_button() {
		Base_driver.driver.findElement(remember).click();
	}

	public void term_condition() {
		//Base_driver.driver.findElement(terms).click();
	}
	
	public void click_on_eyes_icon() {
		Base_driver.driver.findElement(eyes).click();
	}
	
	public void password_is_displayed() {
		   WebElement passwordvisible= Base_driver.driver.findElement(password);
		   passwordvisible.isDisplayed();
	}
	
	public void button() {
		Base_driver.driver.findElement(button).click();
	}

	public void click_on_term_condition_link()   {
		Base_driver.driver.findElement(termandcondition).click();
    }
	
	public void get_message() {
		System.out.println( Base_driver.driver.findElement(plz_register).getText());
	}
	
	public void open_all_term_condition_policy(){
		 WebElement policy= Base_driver.driver.findElement(term_policy);
		 String policy_info= policy.getText();
		 Assert.isTrue(true, policy_info, "Terms & Conditions");
    }
	
  	public void get_error() {
		WebElement msg = basedriver.driver.findElement(geterror);
		String error_msg = msg.getText();
		Assert.isTrue(true, error_msg, "Invalid UserId And Password");

	}

	public void successfully_login() {
		 Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement logoo = basedriver.driver.findElement(logo);
		logoo.isDisplayed();
	}

}
