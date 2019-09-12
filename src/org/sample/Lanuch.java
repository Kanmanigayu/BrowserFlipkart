package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanuch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayukuttypapa\\eclipse-project\\Browerlanuch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	}
	
}
