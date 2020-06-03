package co.grandcircus.shuffle_cards.model;

public class Card {

	private String code;
	private String image;
	private Images images;
	private String value;
	private String suit;
	
	//@return the code
	public String getCode() {
		return code;
	}
	
	//@param code the code to set
	public void setCode(String code) {
		this.code = code;
	}
	
	//@return the image
	public String getImage() {
		return image;
	}
	
	//@param image the image to set
	public void setImage(String image) {
		this.image = image;
	}
	
	//@return the images
	public Images getImages() {
		return images;
	}
	
	//@param images the images to set
	public void setImages(Images images) {
		this.images = images;
	}
	
	//@return the value
	public String getValue() {
		return value;
	}
	
	//@param value the value to set
	public void setValue(String value) {
		this.value = value;
	}
	
	//@return the suit
	public String getSuit() {
		return suit;
	}
	
	//@param suit the suit to set
	public void setSuit(String suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [code=" + code + ", image=" + image + ", images=" + images + ", value=" + value + ", suit=" + suit
				+ "]";
	}
	
	
}
