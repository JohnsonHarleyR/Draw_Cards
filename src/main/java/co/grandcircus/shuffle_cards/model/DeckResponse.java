package co.grandcircus.shuffle_cards.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeckResponse {
	
	private boolean success;
	@JsonProperty("deck_id")
	private String deckId;
	private int remaining;
	private boolean shuffled;
	
	//@return GET success
	public boolean isSuccess() {
		return success;
	}
	
	//@param SET success
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	//@return GET deckId
	public String getDeckId() {
		return deckId;
	}
	
	//@param SET deckId
	public void setDeckId(String deckId) {
		this.deckId = deckId;
	}
	
	//@return GET remaining
	public int getRemaining() {
		return remaining;
	}
	
	//@param SET remaining
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	
	//@return GET shuffled
	public boolean isShuffled() {
		return shuffled;
	}
	
	//@param SET shuffled
	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}

	@Override
	public String toString() {
		return "DeckResponse [success=" + success + ", deckId=" + deckId + ", remaining=" + remaining + ", shuffled="
				+ shuffled + "]";
	}
	
	
	

}
