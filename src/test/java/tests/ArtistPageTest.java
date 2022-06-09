package tests;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ArtistPageItems;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArtistPageTest {
	
	private static WebDriver driver;
	private ArtistPageItems artistpage;
	
	@BeforeClass
	public static void startUp() {
		System.out.println("Initializing tests...");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Before
	public void init() {
		driver.get(ArtistPageItems.getUrl());
		this.artistpage = PageFactory.initElements(driver, ArtistPageItems.class);
	}

	@Test
	public void test1CreateArtist() {
		artistpage.createAnArtist();
		driver.navigate().refresh();
		artistpage.showArtists();
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(artistpage.getArtistList()));
		
		assertEquals("1 - test artist: []", artistpage.getArtists());
	}
	
	@Test
	public void test2UpdateArtist() {
		artistpage.updateAnArtist();
		driver.navigate().refresh();
		artistpage.showArtists();
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(artistpage.getArtistList()));
		
		assertEquals("1 - test artist2: []", artistpage.getArtists());
	}
	
	@Test
	public void test3AddingSong() {
		artistpage.addASong();
		driver.navigate().refresh();
		artistpage.showArtists();
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(artistpage.getArtistList()));
		
		assertEquals("1 - test artist2: [{\"id\":1,\"title\":\"test title\",\"genre\":\"test genre\",\"length\":1}]", artistpage.getArtists());
	}
	
	@Test
	public void test4UpdatingSong() {
		artistpage.updateASong();
		driver.navigate().refresh();
		artistpage.showArtists();
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(artistpage.getArtistList()));
		
		assertEquals("1 - test artist2: [{\"id\":1,\"title\":\"test title2\",\"genre\":\"test genre2\",\"length\":2}]", artistpage.getArtists());
	}
	
	@Test
	public void test5DeletingSong() {
		artistpage.deleteASong();
		driver.navigate().refresh();
		artistpage.showArtists();
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(artistpage.getArtistList()));
		
		assertEquals("1 - test artist2: []", artistpage.getArtists());
	}
	
	@Test
	public void test6DeletingArtist() {
		artistpage.deleteAnArtist();
		driver.navigate().refresh();
		artistpage.showArtists();
			
		assertEquals("", artistpage.getArtists());
	}
	
	
	@AfterClass
	public static void shutDown() {
		driver.close();
		driver.quit();
		System.out.println("Shutting down...");
	}
	
}
