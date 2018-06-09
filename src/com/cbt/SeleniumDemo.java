package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/Mehmet/Documents/Selenium dependencies/drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://cybertekschool.com");
	//System.setProperty("webdriver.gecko.driver","/Users/Mehmet/Documents/Selenium dependencies/drivers/geckodriver");
	//WebDriver driver = new FirefoxDriver();
	//driver.get("http://cybertekschool.com");
	
	//location of project  /Users/Mehmet/eclipse-workspace/FirstSeleniumProject
}
}
