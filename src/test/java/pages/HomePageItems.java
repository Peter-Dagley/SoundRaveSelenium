package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageItems {

private static final String url = "http://localhost:8080/home";
	
	// Methods to click on link
	
	public void nextPageLink() {
		artistLink.click();		
	}
	
	@FindBy(xpath = "/html/body/center/div/h3[2]/a")
	private WebElement artistLink;


	// Getters
	public static String getUrl() {
		return url;
	}

	public WebElement getArtistLink() {
		return artistLink;
	}	
}
