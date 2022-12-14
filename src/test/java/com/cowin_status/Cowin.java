package com.cowin_status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cowin {
	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\s.vimalraj\\eclipse-workspace\\Cowin\\Driver\\chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		driver.manage().window().maximize();
	}
	public static void vaccinationCentre() {
 WebElement state = driver.findElement(By.xpath("//span[text()='Select Your State']"));
	state.sendKeys("Tamilnadu");
	
	
	}
	
	
}
