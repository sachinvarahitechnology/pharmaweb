package com.factory;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_driver {
	

	public  static WebDriver driver ;
	
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver initializedDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")){		
			
			//WebDriverManager.chromedriver().browserVersion("117").setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*" );
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pappya\\Downloads\\chromedriver\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
			   driver = new ChromeDriver(options);
			 
			//driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\-selenium-firefox\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			  driver=new FirefoxDriver();
					
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Pappya\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			  driver=new EdgeDriver();
					
		}
		
		else {
			System.out.println(browser+"not supported");
		}
		
		return getDriver();
	}
	
	public  static synchronized WebDriver getDriver() {
		return  tdriver.get();
	}
	
	public static void main(String[] args) {
 
	}

	 
}
