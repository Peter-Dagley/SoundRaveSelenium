package tests;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePageItems;

public class HomePageTests {

	private static WebDriver driver;
	private HomePageItems homepage;
	
	@BeforeClass
	public static void startUp() {
		System.out.println("Initializing tests...");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Before
	public void init() {
		driver.get(HomePageItems.getUrl());
		this.homepage = PageFactory.initElements(driver, HomePageItems.class);
	}

	// Test to get onto the next page
	@Test
	public void testUrl() {
		homepage.nextPageLink();
				
		String newUrl = driver.getCurrentUrl();
		
		assertEquals("http://localhost:8080/artistpage", newUrl);
	}

	@AfterClass
	public static void shutDown() {
		driver.close();
		driver.quit();
		System.out.println("Shutting down...");
	}
	
}
