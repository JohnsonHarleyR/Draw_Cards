package co.grandcircus.shuffle_cards.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShuffleResponse {
	
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

	//@return the deckId
	public String getDeckId() {
		return deckId;
	}
	
	//@param deckId the deckId to set
	public void setDeckId(String deckId) {
		this.deckId = deckId;
	}
	
	//@return the remaining
	public int getRemaining() {
		return remaining;
	}
	
	//@param remaining the remaining to set
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	
	//@return the shuffled
	public boolean isShuffled() {
		return shuffled;
	}
	
	//@param shuffled the shuffled to set
	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}

	@Override
	public String toString() {
		return "ShuffleResponse [success=" + success + ", deckId=" + deckId + ", remaining=" + remaining + ", shuffled="
				+ shuffled + "]";
	}
	
	

}
