package com.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;

public class myaccount_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	login_Pharma loginpage = new login_Pharma(Base_driver.getDriver());
 
	private By profileimage = By.xpath(" //span[@class='profileImgBack']/img");

	private By profileimageInput = By.xpath("//input[@class='profilepic ng-untouched ng-pristine ng-valid']");
	private By menuicon = By.xpath("//i[@class='fa fa-bars menuIcon']");
	private By myaccounticon = By.xpath("//a[contains(text(),'My Account')]");

	private By changeimageicon = By.xpath("//i[@class='fa-solid fa-pencil icon']");
	private By editicon = By.xpath("//i[@class='fa-solid fa-pen-to-square penIcon']");
	private By currentposition = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[3]");

	private By companyName = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[4]");
	private By Education = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[5]");

	private By Location = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[6]");
	private By Address = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[9]");
	private By Website = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[11]");
	 
	private By updatebutton = By.xpath("//div[@class='profile_button']/button[2]");
	private By cancelbutton = By.xpath("//button[@class='btn btn-sm updateButtons outline']");
	private By PhoneNUmber = By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[2]");

	private By error = By.xpath("//h5[@class='phone']");
	private By imageview = By.xpath("//img[@class='profilepic']");

	public myaccount_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void user_on_loginpage() {
		basedriver.initializedDriver("chrome");
		basedriver.driver.get("https://pharmaclick.co.in/web/auth/login");
		// basedriver.driver.manage().window().maximize();
		loginpage.username("sachin@varahitechnologies.com");
		loginpage.passname("1234566@");
		loginpage.term_condition();
		loginpage.button();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public void click_on_menu_bar() {
		Base_driver.driver.findElement(menuicon).click();
	}

	public void edit_phonenumber(String phonenumber) throws InterruptedException {

		Base_driver.driver.findElement(editicon).click();

		WebElement PhoneNUmber1box = Base_driver.driver.findElement(PhoneNUmber);
		PhoneNUmber1box.clear();
		PhoneNUmber1box.sendKeys(phonenumber);

	}

	public void click_on_myaccount() {
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Base_driver.driver.findElement(myaccounticon).click();
	}

	public void click_on_myaccount_fillup_all_field() throws InterruptedException {

		Base_driver.driver.findElement(editicon).click();
		WebElement PhoneNUmber1box = Base_driver.driver.findElement(PhoneNUmber);
		Thread.sleep(2000);
		PhoneNUmber1box.clear();
		String number="963258710";
		PhoneNUmber1box.sendKeys(number);
		Thread.sleep(5000);

	}

	public void edit_currentposition() {

		Base_driver.driver.findElement(editicon).click();
		WebElement currentpositionbox = Base_driver.driver.findElement(currentposition);
		currentpositionbox.clear();
		currentpositionbox.sendKeys("QA");
	}

	public void edit_currentposition123654() {
		Base_driver.driver.findElement(editicon).click();
		WebElement currentpositionbox = Base_driver.driver.findElement(currentposition);
		currentpositionbox.clear();
		currentpositionbox.sendKeys("123654");
	}

	public void edit_location(String location) throws InterruptedException {

		Base_driver.driver.findElement(editicon).click();
		Thread.sleep(3000);
		WebElement locationbox = Base_driver.driver.findElement(Location);
		locationbox.clear();
		locationbox.sendKeys(location);
	}

	public void get_error() {

		WebElement msgerror = Base_driver.driver.findElement(error);
		String msg = msgerror.getText();
		Assert.isTrue(true, msg, "invalied data");
	}

	public void profile_updated_succesfully() throws InterruptedException {
		Thread.sleep(2000);
		WebElement update = Base_driver.driver.findElement(updatebutton);
		update.sendKeys(Keys.ENTER);
	}

	public void open_profilepage() {
		String profileURL = Base_driver.driver.getCurrentUrl();
		System.out.println(profileURL.contains("profile"));
	}

	public void verify_image_successfully_uploaded() {
		Base_driver.driver.findElement(imageview).isDisplayed();
	}

	public void edit_education(String education) throws InterruptedException {
		Base_driver.driver.findElement(editicon).click();
		Thread.sleep(3000);
		WebElement educationbox = Base_driver.driver.findElement(Education);
		educationbox.clear();
		educationbox.sendKeys(education);

	}

	public void get_number_contact_information() {

		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement phonenumber = Base_driver.driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-profile[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));
		String num1 = phonenumber.getText();

		WebElement contact = Base_driver.driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-profile[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]"));
		String num2 = contact.getText();

		System.out.println(num1.equals(num2));

	}

	public void click_on_pencil_icon_attach_image() throws InterruptedException {

		Thread.sleep(5000);
		WebElement imageiconn = Base_driver.driver.findElement(changeimageicon);
		WebElement profileImage = Base_driver.driver.findElement(profileimageInput);
		Thread.sleep(2000);

		
		String imagepath = "C:\\Users\\Pappya\\Pictures\\sign122.jpg";
		profileImage.sendKeys(imagepath);
		Thread.sleep(5000);
	}

}
