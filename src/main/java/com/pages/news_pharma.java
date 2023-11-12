package com.pages;

import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.factory.Base_driver;

import junit.framework.Assert;

public class news_pharma {
	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	login_Pharma loginpage = new login_Pharma(Base_driver.getDriver());

	private By newscategory = By.xpath("//ul[@class='category_listing']/li");
	private By newsimage1 = By.xpath("(//div[@class='news-img-center'])[1]/img");
	private By newsimage2 = By.xpath("(//div[@class='news-img-center'])[2]/img");
	private By newswithtime = By.xpath("(//div[@class='col-6'])[1]");
	private By yestedaynews = By.xpath("(//h5[@class='content_medium_heading'])[2]");
	private By research = By.xpath("(//h5[@class='title anch mobile-nav-tab content_medium_heading mt-5 mb-2'])[3]");
	
	private By drag = By.xpath("//div[@class='mobile-nav-content column_bg_border']");
	private By drop = By.xpath("//div[@class='mobile-nav-content column_bg_border']");
	
	private By categoryexternal = By.xpath("//section[@class='newCat']/h5");
	private By newsbycategoryexternal = By.xpath("//div[@class='biobg']");
	
	 String category="";
	 int newscount= 0;
	
	public news_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void verify_all_images_are_different() {

		WebElement newsImage1 = Base_driver.driver.findElement(newsimage1);
	    System.out.println("Attribut name1 :"+ newsImage1.getAttribute("src"));
	    
	    WebElement newsImage2 = Base_driver.driver.findElement(newsimage2);
	    System.out.println("Attribut name2 :"+ newsImage2.getAttribute("src"));
	    
	    boolean imageresult=newsImage1==newsImage2;
	    if(imageresult ==false) {
	    	System.out.println("both images are different ");
	    }else {
	    	System.out.println("both images are same");
	    }

	}

	public void news_select_by_category() {

		WebElement policy = Base_driver.driver.findElement(newscategory);
		policy.click();
	}

	public void visible_with_time() {
		WebElement newsTime = Base_driver.driver.findElement(newscategory);
		String newstext = newsTime.getText();
		System.out.println(newstext.contains("ago"));
	}

	public void visible_yesterday_news() {
		WebElement yesticon = Base_driver.driver.findElement(yestedaynews);
		System.out.println(  yesticon.isDisplayed()); 
	}

	public void scroll_all_category_count_news() throws InterruptedException {
		Thread.sleep(3000);
	        List<WebElement> listcategory=	Base_driver.driver.findElements(categoryexternal);
	        
	        for(int i=0; i<Base_driver.driver.findElements(categoryexternal).size(); i++) {
	        	 String category= Base_driver.driver.findElements(categoryexternal).get(i).getText();
	        	 System.out.println(category);
	        }
 
	        List<WebElement> listcategoryforcount=  Base_driver.driver.findElements(newsbycategoryexternal);
	     
	        	 int newscount= Base_driver.driver.findElements(newsbycategoryexternal).size();
	        	 System.out.println(newscount);
	        	        
	        System.out.println("news category :"+ category +"In category total number of news are present :"+ newscount );
	}

	public void same_count_for_diff_category_section() {

	}

	public void verify_all_category_is_clickable() throws InterruptedException {

		List<WebElement> AllCategory = Base_driver.driver.findElements(newscategory);
		
		System.out.println("present category size : "+AllCategory.size());
		for (int i = 1; i < Base_driver.driver.findElements(newscategory).size(); i++) {
						
			System.out.println("All category name : " + AllCategory.get(i).getText());
			
			Base_driver.driver.findElements(newscategory).get(i).click();
			Thread.sleep(2000);
		}
	}
}
