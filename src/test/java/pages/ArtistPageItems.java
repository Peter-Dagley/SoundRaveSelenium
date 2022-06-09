package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtistPageItems {

	private static final String url = "http://localhost:8080/artistpage";
	
	// Methods
	public void createAn
	
	
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
	
	
	
	
	
	
	
	
}
