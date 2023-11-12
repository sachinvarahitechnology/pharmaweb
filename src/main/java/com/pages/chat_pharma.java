package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.Base_driver;

public class chat_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	private By chaticon = By.xpath("(//a[@class='px-2'])[1]");
	private By chatpage = By.xpath("//div[@class='col-9']");

	public chat_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void click_on_chat_verify_it_is_openor_not() {
		Base_driver.driver.findElement(chaticon).click();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("user name is :"+ Base_driver.driver.findElement(chatpage).getText());
	}

}
