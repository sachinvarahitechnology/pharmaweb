package com.pages;

import java.net.MulticastSocket;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;

public class saved_pharma {
	Base_driver basedriver = new Base_driver();
	private WebDriver driver;

	private By savedfeature = By.xpath("//ul[@class='feat-show show']");
	private By saved_item = By.xpath("//a[@class='feat-btn']");
	private By saved_news = By.xpath("//ul[@class='feat-show show']/li[2]/a");
	private By message = By.xpath("//div[@class='col-12']");
	

	private By clickanycompany = By.xpath("(//h5[@class='text-start category_heading'])[1]");
	private By savedicon = By.xpath("//i[@class='fa fa-bookmark-o mt-5 pt-2 mx-4']");

	private By clickanynews = By.xpath("(//div[@class='row p-0'])[3]");
	private By savediconinternal = By.xpath("//i[@class='fa fa-bookmark-o mt-5 pt-2 mx-4']");
	private By savediconExternalnews = By.xpath("(//i[@class='fa fa-bookmark-o'])[2]");

	private By clickanyevent = By.xpath("(//h2[@class='event_name'])[2]");
	private By savediconExternalevent = By.xpath("(//i[@class='fa-regular fa-bookmark'])[3]");

	private By clickanyblogs = By.xpath("(//div[@class='desc'])[1]");
	private By savediconExternalblog = By.xpath("(//i[@class='fa-regular fa-bookmark mx-2'])[2]");

	private By savedcompnaylist = By.xpath("//h5[@class='text-start d-inline-block mx-2']");
	private By savednewslist = By.xpath("//div[@class='row mx-3 py-2 Parent_Div my-4']");
	private By savedeventlist = By.xpath("//h2[@class='event_name']");

	private By authorname = By.xpath("//h5[@class='name mt-0']");
	private By authorsaveicon = By.xpath("//i[@class='fa fa-bookmark-o mt-4 mx-4']");
	
	private By clickanyjob = By.xpath("//div[@class='col-6 text-start']/h2");
	private By saveiconjobexternal = By.xpath("(//i[@class='fa fa-bookmark px-2'])[1]");
	

	homepage_pharma home = new homepage_pharma(Base_driver.getDriver());
	marketplace_pharma market = new marketplace_pharma(Base_driver.getDriver());
	myaccount_pharma myaccount = new myaccount_pharma(Base_driver.getDriver());
	news_pharma news = new news_pharma(Base_driver.getDriver());

	String companyname = "";
	String newstitle = "";
	String eventtitle = "";
	String blogname = "";

	public saved_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void verify_all_feature_are_available_in_saved_itom() {

		List<WebElement> feature = Base_driver.driver.findElements(savedfeature);

		for (int i = 0; i < Base_driver.driver.findElements(savedfeature).size(); i++) {
			System.out.println(feature.get(i).getText());
		}
	}

	public void select_any_company_and_save_it() throws InterruptedException {

		home.click_on_marketplace();
		market.click_on_any_category_search_by_product();

		WebElement company = Base_driver.driver.findElement(clickanycompany);
		companyname = company.getText();

		System.out.println(" saved company name :" + companyname);
		company.click();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Base_driver.driver.findElement(savedicon).click();
	}

	public void select_any_event_and_save_it() {
		home.click_on_event();
		WebElement anyevent = Base_driver.driver.findElement(clickanyevent);
		eventtitle = anyevent.getText();

		System.out.println(" saved event name :" + eventtitle);
		anyevent.click();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		Base_driver.driver.findElement(savedicon).click();
	}

	public void select_any_news_and_save_it() {
		home.click_on_news();
		WebElement news = Base_driver.driver.findElement(clickanynews);
		newstitle = news.getText();

		System.out.println(" saved news title :" + newstitle);
		news.click();
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Base_driver.driver.findElement(savediconinternal).click();
		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();
	}

	public void select_any_news_and_click_on_external_savedicon() {

		home.click_on_news();
		Base_driver.driver.findElement(savediconExternalnews).click();

	}

	public void select_any_blogs_and_click_on_external_saved_icon() throws InterruptedException {
		home.click_on_blogs();
		WebElement blogsave = Base_driver.driver.findElement(savediconExternalblog);
		blogsave.click();
		System.out.println(blogsave.isEnabled());
	}
	
	public void verify_message_is_disaplyed_or_not() {
		Base_driver.driver.findElement(saved_item).click();
		Base_driver.driver.findElement(saved_news).click();
		System.out.println(Base_driver.driver.findElement(message).getText());
		
	}

	public void select_any_event_and_click_on_external_savedicon() {

		home.click_on_event();
		Base_driver.driver.findElement(savediconExternalevent).click();

	}

	public void verify_it_is_coming_in_saved_itom_or_not() throws InterruptedException {

		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();

		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(By.xpath("(//ul[@class='mx-auto']/li)[3]//a")).click();
		Base_driver.driver.findElement(By.xpath("//ul[@class='feat-show show']/li[1]")).click();
		Thread.sleep(3000);
		System.out.println("total saved list size :" + Base_driver.driver.findElements(savedcompnaylist).size());

		List<WebElement> companylist = Base_driver.driver.findElements(savedcompnaylist);

		for (int i = 0; i < Base_driver.driver.findElements(savedcompnaylist).size(); i++) {
			Base_driver.driver.findElements(savedcompnaylist).get(i);

			System.out.println(Base_driver.driver.findElements(savedcompnaylist).get(i).getText());

			String name = Base_driver.driver.findElements(savedcompnaylist).get(i).getText();

			System.out.println(name.toUpperCase().contains(companyname.toUpperCase()));
		}
	}

	public void verify_news_is_coming_in_saved_itom_or_not() throws InterruptedException {

		Base_driver.driver.navigate().back();

		myaccount.click_on_menu_bar();
		Thread.sleep(2000);
		Base_driver.driver.findElement(By.xpath("(//ul[@class='mx-auto']/li)[3]//a")).click();
		Base_driver.driver.findElement(By.xpath("//ul[@class='feat-show show']/li[2]/a")).click();
		Thread.sleep(3000);

		System.out.println("total saved list size :" + Base_driver.driver.findElements(savednewslist).size());

		List<WebElement> newslist = Base_driver.driver.findElements(savednewslist);

		for (int i = 0; i < Base_driver.driver.findElements(savednewslist).size(); i++) {
			Base_driver.driver.findElements(savednewslist).get(i);

			System.out.println(
					"saved news list title :" + Base_driver.driver.findElements(savednewslist).get(i).getText());

			String news = Base_driver.driver.findElements(savednewslist).get(i).getText();
			System.out.println( news.contains(newstitle));
//			System.out.println(news.toUpperCase().contains(newstitle.toUpperCase()));
//			Assert.isTrue(true, news, newstitle);
		}

	}

	public void verify_event_is_coming_in_saved_itom_or_not() throws InterruptedException {
		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();

		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(By.xpath("(//ul[@class='mx-auto']/li)[3]//a")).click();
		Base_driver.driver.findElement(By.xpath("//ul[@class='feat-show show']/li[3]/a")).click();
		Thread.sleep(3000);

		System.out.println("All event list size :" + Base_driver.driver.findElements(savedeventlist).size());

		List<WebElement> eventlist = Base_driver.driver.findElements(savedeventlist);

		for (int i = 0; i < Base_driver.driver.findElements(savedeventlist).size(); i++) {
			Base_driver.driver.findElements(savedeventlist).get(i);
			System.out.println(
					"All present event list :" + Base_driver.driver.findElements(savedeventlist).get(i).getText());

			String name = Base_driver.driver.findElements(savedeventlist).get(i).getText();
			System.out.println(name.toUpperCase().contains(eventtitle.toUpperCase()));
		}
	}
	
	public void verify_that_event_is_coming_in_saved_itom_or_not() throws InterruptedException {
		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();
		
		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(By.xpath("(//ul[@class='mx-auto']/li)[3]//a")).click();
		Base_driver.driver.findElement(By.xpath("//ul[@class='feat-show show']/li[3]/a")).click();
		Thread.sleep(3000);
		
		System.out.println("All event list size :" + Base_driver.driver.findElements(savedeventlist).size());

		List<WebElement> eventlist = Base_driver.driver.findElements(savedeventlist);

		for (int i = 0; i < Base_driver.driver.findElements(savedeventlist).size(); i++) {
			Base_driver.driver.findElements(savedeventlist).get(i);
			System.out.println(
					"All present event list :" + Base_driver.driver.findElements(savedeventlist).get(i).getText());

			String name = Base_driver.driver.findElements(savedeventlist).get(i).getText();
			System.out.println(name .contains(eventtitle ));
		}		
	}

	public void select_any_blogs_and_save_it() throws InterruptedException {
		home.click_on_blogs();
		WebElement anyblog = Base_driver.driver.findElement(clickanyblogs);
		blogname = anyblog.getText();
		anyblog.click();
		System.out.println("saved blogs name :" + blogname);
		Thread.sleep(2000);
//		anyblog.click();
//		Thread.sleep(2000);
	}

	public void verify_blogs_is_coming_in_saved_itom_or_not() throws InterruptedException {

		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();

		myaccount.click_on_menu_bar();
		Thread.sleep(2000);
		Base_driver.driver.findElement(By.xpath("(//ul[@class='mx-auto']/li)[3]//a")).click();
		WebElement blog = Base_driver.driver.findElement(By.xpath("//ul[@class='feat-show show']/li[4]/a"));
		blog.click();
		Thread.sleep(3000);
		  System.out.println("All save blog list size  :"+ Base_driver.driver.findElements(By.xpath( "//div[@class='col-8 relat']")).size());
		  List<WebElement> bloglist = Base_driver.driver.findElements(By.xpath( "//div[@class='col-8 relat']"));
		  
		  for (int i = 0; i < Base_driver.driver.findElements(By.xpath( "//div[@class='col-8 relat']")).size(); i++) {
				Base_driver.driver.findElements(By.xpath( "//div[@class='col-8 relat']")).get(i);
				System.out.println(
						"All present blog list :" + Base_driver.driver.findElements(By.xpath( "//div[@class='col-8 relat']")).get(i).getText());

				String name = Base_driver.driver.findElements(By.xpath( "//div[@class='col-8 relat']")).get(i).getText();
		 System.out.println(name.contains(blogname));
		  }
		 
	}

	public void user_on_author_page() throws InterruptedException {
		home.click_on_blogs();
		Base_driver.driver.findElement(clickanyblogs).click();
		 Thread.sleep(3000);
		Base_driver.driver.findElement(authorname).click();
	}

	public void click_on_save_icon_verify_it_is_saved() {
		WebElement ss = Base_driver.driver.findElement(authorsaveicon);
		ss.click();
		System.out.println(ss.isEnabled());
	}
	
	public void select_any_job_save_it() {
	     home.click_on_jobs();
	     Base_driver.driver.findElement(clickanyjob).click();
	      WebElement saveicon= Base_driver.driver.findElement(authorsaveicon);
	      saveicon.click();
	      System.out.println(saveicon.isEnabled());
	}
	
	public void verify_it_is_saved_or_not() {
		Base_driver.driver.navigate().back();
		Base_driver.driver.navigate().back();

		myaccount.click_on_menu_bar();
		Base_driver.driver.findElement(By.xpath("(//ul[@class='mx-auto']/li)[3]//a")).click();
		WebElement jobs = Base_driver.driver.findElement(By.xpath("//ul[@class='feat-show show']/li[5]/a"));
		jobs.click();
		System.out.println(jobs.isEnabled());
	}
	
	public void select_any_job_click_on_external_save_icon() {
		home.click_on_jobs();
		  WebElement jobicon= Base_driver.driver.findElement(saveiconjobexternal);
		  jobicon.click();
		  System.out.println(jobicon.isEnabled());
		
	}

}
