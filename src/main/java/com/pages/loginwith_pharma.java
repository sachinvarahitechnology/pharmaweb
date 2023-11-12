package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;

public class loginwith_pharma {
	private static final org.openqa.selenium.support.ui.WebDriverWait WebDriverWait = null;
	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	private By loginwithgoogle = By.xpath("//div[@class='socialLogin']");
	private By titlenew = By.xpath("//div[@class='Bw8v1']");
	private By email = By.xpath("//*[@id=\"identifierId\"]");
	private By password = By.xpath("(//div[@class='Xb9hP']/input)[1]");
	private By marketplace = By
			.xpath("/html/body/app-root/div/app-homepage/div/div/div/div/div/div[2]/div/div[1]/a/h1/div");
	private By next = By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]");
	private By text = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/c-wiz/div/div/div[2]");
	private By mail_text = By.xpath("//img[@class='TrZEUc']");
	private By put_text = By.xpath("(//input[@class='whsOnd zHQkBf'])[2]");

	String email_id = "sachin@gmail.com";
	String password_id = "1234566@";

	public loginwith_pharma(WebDriver driver) {
		this.driver = driver;
	}
	
	 
	 
	public void click_on_loginwithgoogle_link() throws InterruptedException {
		WebElement icon = Base_driver.driver.findElement(loginwithgoogle);
		icon.click();
		Thread.sleep(7000);
		
		 
        for (String windowHandle : Base_driver.driver.getWindowHandles()) {
        	Base_driver. driver.switchTo().window(windowHandle);
        }
		
 
		WebElement id = Base_driver.driver.findElement(email);
		id.sendKeys(email_id);
		Thread.sleep(5000);	 
		Base_driver.driver.findElement(next).click();
		Thread.sleep(10000);
////		
//		WebElement pass= Base_driver.driver.findElement(password);
//		pass.sendKeys(password_id);
//		Base_driver.driver.findElement(next).click();
//		Thread.sleep(3000);
//		String text= Base_driver.driver.findElement(marketplace).getText();
//		  junit.framework.Assert.assertEquals(text, "Marketplace");
//		  Thread.sleep(12000);
	}
	

	public void display_login_icon() {
		WebElement icon = Base_driver.driver.findElement(loginwithgoogle);
		icon.isDisplayed();
	}
}
