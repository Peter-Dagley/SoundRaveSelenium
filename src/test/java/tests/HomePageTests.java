package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTests {

	private final String homePageUrl = "http://localhost:8080/home";
	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	@Test
	public void testTitle() {
		driver.get(homePageUrl);
		assertEquals("SoundRave - Home", driver.getTitle());
	}
	
	@Test
	public void testArtistsLink() {
		driver.get(homePageUrl);
		
		WebElement artistsLink = driver.findElement(By.xpath("//*[@id=\"1\"]/a"));
		artistsLink.click();
		
		WebElement heading = driver.findElement(By.xpath("/html/body/center/h1"));
		assertEquals("SoundRave", heading.getText());
	}
	
	
//	@Test
//	public void testCatSearch() {
//		driver.get(wikipediaUrl);
//		
//		WebElement wikiSearch = driver.findElement(By.id("searchInput"));
//		wikiSearch.sendKeys("Cats");
//		wikiSearch.submit();
//		
//		WebElement firstHeading = driver.findElement(By.id("firstHeading"));	
//		assertEquals("Cat", firstHeading.getText());
//	}
//	
//	@Test
//	public void testCatImageSearch() {
//		driver.get(googleImagesUrl);
//		
//		WebElement accept = driver.findElement(By.id("L2AGLb"));
//		accept.click();
//		
//		WebElement imageSearch = driver.findElement(By.name("q"));
//		imageSearch.sendKeys("Cool Cat");
//		imageSearch.submit();
//		
//		WebElement clickImage = driver.findElement(By.xpath("/html/body/div[2]/c-wiz/div[3]/div[1]/div/div/div/div[1]/div[1]/span/div[1]/div[1]/div[5]/a[1]/div[1]/img"));
//		clickImage.click();
//		
//		WebElement h1Class = driver.findElement(By.xpath("/html/body/div[2]/c-wiz/div[3]/div[2]/div[3]/div/div/div[3]/div[2]/c-wiz/div/div[1]/div[3]/div[1]/a[1]/h1"));
//		assertEquals("1920x1080] Cool Cat : r/wallpaper", h1Class.getText());
//	}
	

	@After
	public void end() {
		driver.close();
		driver.quit();
	}
	
// 	In case you can't find chromedriver.exe in Task Manager
// 	Command Shell = taskkill /F /IM chromedriver.exe

}
