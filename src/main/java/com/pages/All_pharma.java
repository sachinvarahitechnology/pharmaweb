package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factory.Base_driver;

import junit.framework.Assert;

public class All_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	private By Allfeature = By.xpath("//h5[@class='content_medium_heading']");
	private By viewall = By.xpath("//h5[@class='view_all']");
	private By imageinrecentblog = By.xpath("(//img[@class='img-fluid img-center image-center'])[1]");
	private By authornamerecentblog = By.xpath("(//span[@class='mx-1 user_details d-flex'])[1]");
	private By authornameinternal = By.xpath("//h5[@class='name mt-2']");
	
	String Author1name="";
	 

	public All_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void verify_all_icon_is_clickable() {
		List<WebElement> viewallicon = Base_driver.driver.findElements(viewall);

		for (int i = 0; i < viewallicon.size(); i++) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Allfeature));
			viewallicon.get(1).click();
		}
	}
	
	public void verify_is_go_their_redirect_page() {
		String ss= Base_driver.driver.findElement(By.xpath("//h2[@class='content_heading mb-3']")).getText();
		Assert.assertEquals("MARKETPLACE", ss);
	}

	public void verify_all_features_show_shortly() {
		List<WebElement> feature = Base_driver.driver.findElements(Allfeature);

		for (int i = 0; i < feature.size(); i++) {
			System.out.println(feature.get(i).getText());
			System.out.println("class :-------" + feature.getClass());
		}
	}

	public void validate_image_is_same_or_not() {

		String image = Base_driver.driver.findElement(imageinrecentblog).getAttribute("src");
		System.out.println("image1" + image);

		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		String image2 = Base_driver.driver.findElement(imageinrecentblog).getAttribute("src");
		System.out.println("image2" + image2);
	}

	public void author_name_in_blogs() throws InterruptedException {
		 
		WebElement author1= Base_driver.driver.findElement(authornamerecentblog);        
		String Author1name=author1.getText();
		System.out.println("author name before click :"+ Author1name);
		Thread.sleep(4000);
		author1.click();
		
	}
	
	
	public void when_you_click_on_blog_author_name_is_same_or_not() {
        
		
		String internalauthor= Base_driver.driver.findElement(authornameinternal).getText();
		 Assert.assertEquals(internalauthor, Author1name);
	}
}
