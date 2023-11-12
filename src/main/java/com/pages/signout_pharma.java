package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.Base_driver;

public class signout_pharma {
	
	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	login_Pharma loginpage = new login_Pharma(Base_driver.getDriver());
	
	private By logout = By.xpath("//*[@id=\"closN\"]/ul/li[10]/a");
	
	public signout_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void click_on_logout_logout_successfully() {
	     Base_driver.driver.findElement(logout).click();
	}
}
