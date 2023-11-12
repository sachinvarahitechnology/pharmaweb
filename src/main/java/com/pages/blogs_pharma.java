package com.pages;

import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.Base_driver;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.asm.Advice.Enter;

public class blogs_pharma {

	Base_driver basedriver = new Base_driver();
	private WebDriver driver;
	signout_pharma signout=new signout_pharma(Base_driver.getDriver());
	login_Pharma loginpage=new login_Pharma(Base_driver.getDriver());
	
	private By firstblog = By.xpath("(//div[@class='d-flex authordetails_wrapper'])[1]");
	private By firstinternalauthorname = By.xpath("//h5[@class='name mt-2']");
	private By authorlist = By.xpath("//div[@class='left_blog_desc']");
	private By thumblikeicon = By.xpath("//i[@class='fa fa-thumbs-o-up']");
	private By Aboutblogger = By.xpath("//a[@class='nav-link mobile-nav-tab']");
	private By writeblogbox = By.xpath("(//div[@class='btn-group btn-toggle blog_button_wrapper'])/button[2]");
	private By blogtitlebox = By.xpath("(//div[@class='form-group my-2']//input)[1]");
	private By Auhtornamebox = By.xpath("(//div[@class='form-group my-2']//input)[2]");
	private By Tagsbox = By.xpath("(//div[@class='form-group my-2']//input)[3]");
	private By blogsource = By.xpath("(//div[@class='form-group my-2']//input)[4]");
	private By choosefile = By.xpath("//div[@class='form-group']//input");
	private By bloggeragreeicon = By.xpath("//div[@class='form-check mt-3']/input");
	private By submitbutton = By.xpath("//div[@class='text-center w-100']/button");
	
	private By menuicon = By.xpath("//i[@class='fa fa-bars menuIcon']");

	String titleblog = "Testing";
	String Authorname = "Sachin test";
	String Tags = "Testing tags";
	String source = "Testing source";
	String choosefiles = "C:\\Users\\Pappya\\Pictures\\sign122.jpg";
	String writepageURl=" ";
	String Result_url="";

	public blogs_pharma(WebDriver driver) {
		this.driver = driver;
	}

	public void click_on_any_blog() {
		Base_driver.driver.findElement(firstblog).click();

	}

	public void verify_author_name_title() {
		List<WebElement> Authorlist = Base_driver.driver.findElements(authorlist);
		for (int i = 0; i < Authorlist.size(); i++) {
			System.out.println(Authorlist.get(i).getText());
		}
	}

	public void verify_like_icon_in_author_page() {
		Base_driver.driver.findElement(firstblog).click();
		Base_driver.driver.findElement(thumblikeicon).click();

	}

	public void verify_blog_with_time_and_date() {
		List<WebElement> Authorlist = Base_driver.driver.findElements(authorlist);
		String[] month = { "Jan", "Feb", "March", "Apr ", "May", "Jun", "july", "Aug", "Sep", "Oct", "Nov", "Dec" };

		for (int i = 0; i < Authorlist.size(); i++) {
			System.out.println(Authorlist.get(i).getText());

			System.out.println(Authorlist.contains(month));
		}
	}

	public void click_on_write_blogs_and_fillup_all_field_click_on_submit() {
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Base_driver.driver.findElement(writeblogbox).click();
		Base_driver.driver.findElement(blogtitlebox).sendKeys(titleblog);
		Base_driver.driver.findElement(Auhtornamebox).sendKeys(Authorname);
		Base_driver.driver.findElement(Tagsbox).sendKeys(Tags);
		Base_driver.driver.findElement(blogsource).sendKeys(source);
		Base_driver.driver.findElement(choosefile).sendKeys(choosefiles);
		Base_driver.driver.findElement(bloggeragreeicon).click();
		Base_driver.driver.findElement(submitbutton).click();
	}

	public void write_blog_is_posted() {
		System.out.println("blog is posted ");
	}

	public void verify_visible_author_information() {
		
		Base_driver.driver.findElement(firstblog).click();
		Base_driver.driver.findElement(firstinternalauthorname).click();

		WebElement ss = Base_driver.driver.findElement(Aboutblogger);
		String sstext = ss.getText();
		Assert.isTrue(true, sstext, "About Blogger");

	}

	public void verify_blogs_with_how_is_posted() throws InterruptedException {

		WebElement firstblogauthor = Base_driver.driver.findElement(firstblog);
		String authorname = firstblogauthor.getText();
		System.out.println("first author :--" + authorname);

		Base_driver.driver.findElement(firstblog).click();

		Thread.sleep(5000);
		WebElement firstbloginternalauthor = Base_driver.driver.findElement(firstinternalauthorname);

		String authornameinternal = firstbloginternalauthor.getText();
		System.out.println("second author :--" + authornameinternal);

		Assert.isTrue(true, authornameinternal, firstblogauthor);

	}

	public void user_on_write_blog_page() {
		Base_driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Base_driver.driver.findElement(writeblogbox).sendKeys(Keys.ENTER);
		String writepageURl= Base_driver.driver.getCurrentUrl();
		System.out.println("This is write page url :"+writepageURl);
	}
	
	public void user_is_sign_out() throws InterruptedException {
		Base_driver.driver.findElement(menuicon).click();
		Thread.sleep(2000);
		signout.click_on_logout_logout_successfully();
	}
	
	public void again_user_login_with_valied_credential() {
		basedriver.driver.get("https://pharmaclick.co.in/web/auth/login");
		 
		loginpage.username("sachin@varahitechnologies.com");
		loginpage.passname("1234566@");
		loginpage.term_condition();
		loginpage.button();
	}
	public void validate_user_on_write_blog_page() {
         String Result_url=Base_driver.driver.getCurrentUrl();
         System.out.println(Result_url);
         Assert.isTrue(false, Result_url, writepageURl);
	}
}
