package taskstepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.factory.Base_driver;
import com.pages.login_Pharma;

import dev.failsafe.internal.util.Assert;
import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.junit.runner.RunWith;

public class loginstepdef {

	Base_driver basedriver = new Base_driver();

	login_Pharma loginpharma = new login_Pharma(Base_driver.getDriver());

	@Given("^user on login page$")
	public void user_on_login_page() {

		basedriver.initializedDriver("chrome");
		basedriver.driver.get("https://pharmaclick.co.in/web/auth/login");
		// basedriver.driver.manage().window().maximize();
	}

	@When("user provide {string}and {string}")
	public void put_valid_credential(String username, String password) {
		loginpharma.username(username);
		loginpharma.passname(password);

	}

	@When("click on button")
	public void click_on_button() {
		loginpharma.term_condition();
		loginpharma.button();
	}

	@Then("click on remember button")
	public void click_on_remember_button() {
		loginpharma.click_on_remember_button();
	}

	@Then("click on term & condition link")
	public void click_on_term_condition_link() {
		loginpharma.click_on_term_condition_link();
	}

	@Then("click on eyes icon")
	public void click_on_eyes_icon() {
		loginpharma.click_on_eyes_icon();
	}

	@Then("password is displayed")
	public void password_is_displayed() {
		loginpharma.password_is_displayed();
	}

	@Then("get message")
	public void get_message() {
		 loginpharma.get_message();
	}

	@Then("open all term & condition policy")
	public void open_all_term_condition_policy() {
		loginpharma.open_all_term_condition_policy();
	}

	@Then("get error")
	public void get_error() {
		loginpharma.get_error();
	}

	@Then("login successfully")
	public void login_successfully() {
		loginpharma.successfully_login();

	}

	@After
	public void close() {
		basedriver.driver.quit();
	}

}
