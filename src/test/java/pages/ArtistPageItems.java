package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtistPageItems {

	private static final String url = "http://localhost:8080/artistpage";
	
	// Methods
	public void showArtists() {
		showArtistButton.click();
	}
	
	public void createAnArtist() {
		artistInput.sendKeys("test artist");
		createArtistButton.click();
	}
	
	public void updateAnArtist() {
		updateIDArtistInput.sendKeys("1");
		updateNameArtistInput.sendKeys("test artist2");
		updateArtistButton.click();
	}
	
	public void addASong() {
		idInput.sendKeys("1");
		artistInput2.sendKeys("test artist2");
		titleInput.sendKeys("test title");
		genreInput.sendKeys("test genre");
		lengthInput.sendKeys("1.0");
		addSongButton.click();
	}
		
	public void updateASong() {
		updateSongArtistIDInput.sendKeys("1");
		updateSongArtistNameInput.sendKeys("test artist");
		updateIDSongInput.sendKeys("1");
		updateTitleInput.sendKeys("test title2");
		updateGenreInput.sendKeys("test genre2");
		updateLengthInput.sendKeys("2.0");
		updateSongButton.click();
	}
	
	public void deleteASong() {
		deleteSongInput.sendKeys("1");
		deleteSongButton.click();
	}
	
	public void deleteAnArtist() {
		deleteArtistInput.sendKeys("1");
		deleteArtistButton.click();
	}
		
	// Elements
	
	//Create Artist 
	@FindBy(id = "artistInput")
	private WebElement artistInput;

	@FindBy(id = "createArtistButton")
	private WebElement createArtistButton;
	
	//Delete Artist
	@FindBy(id = "deleteArtistInput")
	private WebElement deleteArtistInput;
	
	@FindBy(id = "deleteArtistButton")
	private WebElement deleteArtistButton;
	
	//Update Artist
	@FindBy(id = "updateIDArtistInput")
	private WebElement updateIDArtistInput;
	
	@FindBy(id = "updateNameArtistInput")
	private WebElement updateNameArtistInput;
	
	@FindBy(id = "updateArtistButton")
	private WebElement updateArtistButton;
	
	// Add a song to the Artist
	@FindBy(id = "idInput")
	private WebElement idInput;
	
	@FindBy(id = "artistInput2")
	private WebElement artistInput2;
	
	@FindBy(id = "titleInput")
	private WebElement titleInput;
	
	@FindBy(id = "genreInput")
	private WebElement genreInput;
	
	@FindBy(id = "lengthInput")
	private WebElement lengthInput;
	
	@FindBy(id = "addSongButton")
	private WebElement addSongButton;
	
	// Delete Song
	@FindBy(id = "deleteSongInput")
	private WebElement deleteSongInput;
	
	@FindBy(id = "deleteSongButton")
	private WebElement deleteSongButton;

	// Update a Song
	@FindBy(id = "updateSongArtistIDInput")
	private WebElement updateSongArtistIDInput;
     
	@FindBy(id = "updateSongArtistNameInput")
	private WebElement updateSongArtistNameInput;
	
	@FindBy(id = "updateIDSongInput")
	private WebElement updateIDSongInput;
	
	@FindBy(id = "updateTitleInput")
	private WebElement updateTitleInput;
	
	@FindBy(id = "updateGenreInput")
	private WebElement updateGenreInput;
	
	@FindBy(id = "updateLengthInput")
	private WebElement updateLengthInput;
	
	@FindBy(id = "updateSongButton")
	private WebElement updateSongButton;
	
	// Show Artists
	@FindBy(id = "showArtistButton")
	private WebElement showArtistButton;
	
	@FindBy(id = "artistList")
	private WebElement artists;
	
	@FindBy(id = "artistList")
	private WebElement artistList;

	
	// Getters
	
	public WebElement getArtistList() {
		return artistList;
	}

	public String getArtists() {
		return artists.getText();
	}

	public static String getUrl() {
		return url;
	}

	public WebElement getArtistInput() {
		return artistInput;
	}

	public WebElement getCreateArtistButton() {
		return createArtistButton;
	}

	public WebElement getDeleteArtistInput() {
		return deleteArtistInput;
	}

	public WebElement getDeleteArtistButton() {
		return deleteArtistButton;
	}

	public WebElement getUpdateIDArtistInput() {
		return updateIDArtistInput;
	}

	public WebElement getUpdateNameArtistInput() {
		return updateNameArtistInput;
	}

	public WebElement getUpdateArtistButton() {
		return updateArtistButton;
	}
	
	public WebElement getIdInput() {
		return idInput;
	}

	public WebElement getArtistInput2() {
		return artistInput2;
	}

	public WebElement getTitleInput() {
		return titleInput;
	}

	public WebElement getGenreInput() {
		return genreInput;
	}

	public WebElement getLengthInput() {
		return lengthInput;
	}

	public WebElement getAddSongButton() {
		return addSongButton;
	}

	public WebElement getDeleteSongInput() {
		return deleteSongInput;
	}

	public WebElement getDeleteSongButton() {
		return deleteSongButton;
	}

	public WebElement getUpdateSongArtistIDInput() {
		return updateSongArtistIDInput;
	}

	public WebElement getUpdateSongArtistNameInput() {
		return updateSongArtistNameInput;
	}

	public WebElement getUpdateIDSongInput() {
		return updateIDSongInput;
	}

	public WebElement getUpdateTitleInput() {
		return updateTitleInput;
	}

	public WebElement getUpdateGenreInput() {
		return updateGenreInput;
	}

	public WebElement getUpdateLengthInput() {
		return updateLengthInput;
	}

	public WebElement getUpdateSongButton() {
		return updateSongButton;
	}

	public WebElement getShowArtistButton() {
		return showArtistButton;
	}
		
}
