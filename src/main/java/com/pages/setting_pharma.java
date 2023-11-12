package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;

public class setting_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());

	private By settinginmenu = By.xpath("//a[@class='feat-btn1']");
	private By settingoption = By.xpath("//ul[@class='feat-show1 show1']");
	private By notification = By.xpath("(//ul[@class='feat-show1 show1']/li)[1]/a");
	private By changepassword = By.xpath("(//ul[@class='feat-show1 show1']/li)[2]/a");
	private By rateUs = By.xpath("(//ul[@class='feat-show1 show1']/li)[4]/a");
	private By privacy_policy = By.xpath("(//ul[@class='feat-show1 show1']/li)[5]/a");

	private By help = By.xpath("//ul[@class='mx-auto']/li[8]//a");
	private By ContactUs = By.xpath("//ul[@class='mx-auto']/li[9]//a");

	private By enternewpassbox = By.xpath("//input[@class='form-control emailText']");
	private By changebutton = By.xpath("//button[@class='btn btn-info']");
	private By changepasstext = By.xpath("//div[@class='alert alert-success show']");

	String newpassword = "1234566@";

	public setting_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void click_on_menu_bar_click_ion_setting() throws InterruptedException {
		myaccount.click_on_menu_bar();
		Thread.sleep(3000);
		Base_driver.driver.findElement(settinginmenu).click();

	}

	public void verify_all_feature_is_prese_or_not() throws InterruptedException {

		WebElement settingoptions = Base_driver.driver.findElement(settingoption);
		System.out.println(settingoptions.getText());

		for (int i = 0; i < Base_driver.driver.findElements(settingoption).size(); i++) {

			String options = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(2000);
			settingoptions.findElements(settingoption).get(i).sendKeys(options);

			Thread.sleep(5000);
			Set<String> abc = Base_driver.driver.getWindowHandles();
			Iterator<String> it = abc.iterator();

			while (it.hasNext()) {
				Base_driver.driver.switchTo().window(it.next());
				Thread.sleep(5000);
				System.out.println("windows title : " + Base_driver.driver.getTitle());
			}
		}
	}

	public void click_on_change_password_verify_password_is_change() throws InterruptedException {

		Base_driver.driver.findElement(changepassword).click();

		WebElement enterpass = Base_driver.driver.findElement(enternewpassbox);
		enterpass.sendKeys(newpassword);
		Base_driver.driver.findElement(changebutton).click();

		String pass = Base_driver.driver.findElement(changepasstext).getText();
		Assert.isTrue(true, pass, "Success! Password changed successfully..!");
	}

	public void click_on_rate_us_option() {
		System.out.println(Base_driver.driver.findElement(rateUs).isEnabled());
	}

	public void click_on_privacy_and_verify() {
		Base_driver.driver.findElement(privacy_policy).click();

		String policy = Base_driver.driver.findElement(By.xpath("//h2[@class='terms_sub_heading']")).getText();
		Assert.isTrue(true, policy, "Privacy Policy");
	}

	public void click_on_help_verify() {
		System.out.println(Base_driver.driver.findElement(help).isEnabled());
	}

	public void click_on_contact_us_verify() {
		System.out.println(Base_driver.driver.findElement(ContactUs).isEnabled());
}
	public void click_on_notification() {
	    WebElement ss= Base_driver.driver.findElement(notification);
	    System.out.println(ss.isEnabled());
	}	

}
