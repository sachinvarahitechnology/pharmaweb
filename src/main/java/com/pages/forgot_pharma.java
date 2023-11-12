package com.pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;

public class forgot_pharma {
	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	
	private By mail_idelement = By.xpath("(//input[@class='emailText'])[2]");
	private By forgotpass_link = By.xpath("//a[@class='forgotLink']");
	private By button = By.xpath("//input[@class='btn float-right btn-info forgot_button']");
	
	 
	public forgot_pharma(WebDriver driver) {
		this.driver = driver;
	}
	
	public void forgot_password_link()  {
        Base_driver.driver.findElement(forgotpass_link).click();
    }
	
	public void enter_register_mail_id(String id)   {
         Base_driver.driver.findElement(mail_idelement).sendKeys(id);
   }
	
	public void click_on_submit_button()   {
        WebElement submit_button=Base_driver.driver.findElement(button); 
       System.out.println( submit_button.isEnabled());
       // Assert.isTrue(false, "send OTP ", submit_button);
          
    }
	
	
	
	
	
	
}
