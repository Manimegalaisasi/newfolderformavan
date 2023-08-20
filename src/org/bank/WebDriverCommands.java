package org.bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32_2" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

	
	}
}
		
		
		
		