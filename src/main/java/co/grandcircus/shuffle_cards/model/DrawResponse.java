package co.grandcircus.shuffle_cards.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DrawResponse {
	
	private boolean success;
	@JsonProperty("deck_id")
	private String deckId;
	private List<Card> cards;
	private int remaining;
	
	//@return the success
	public boolean isSuccess() {
		return success;
	}
	
	//@param success the success to set
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
	
	//@return the cards
	public List<Card> getCards() {
		return cards;
	}
	
	//@param cards the cards to set
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//@return the remaining
	public int getRemaining() {
		return remaining;
	}
	
	//@param remaining the remaining to set
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	@Override
	public String toString() {
		return "CardService [success=" + success + ", deckId=" + deckId + ", cards=" + cards + ", remaining="
				+ remaining + "]";
	}
	

}
