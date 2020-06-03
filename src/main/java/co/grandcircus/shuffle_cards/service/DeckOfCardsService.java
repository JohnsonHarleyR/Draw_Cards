package co.grandcircus.shuffle_cards.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.shuffle_cards.model.Card;
import co.grandcircus.shuffle_cards.model.DrawResponse;
import co.grandcircus.shuffle_cards.model.ShuffleResponse;

@Service
public class DeckOfCardsService {
	
	private final String deckId = "30flonxhzmrq";
	private RestTemplate rest = new RestTemplate();
	
	//Draw some cards
	public List<Card> drawCards(int count) {
		
		//Specify url
		String url = "https://deckofcardsapi.com/api/deck/{deckId}/draw/?count={count}";
		
		//Call API, specify return type to match JSON
		DrawResponse response = rest.getForObject(url, DrawResponse.class, deckId, count);
		
		//Return result
		return response.getCards();
		
	}
	
	//Shuffle the deck
	public void shuffleDeck() {
		
		//Specify url
		String url = "https://deckofcardsapi.com/api/deck/30flonxhzmrq/shuffle/";
		
		//Call API, specify return type to match JSON
		ShuffleResponse resonse = rest.getForObject(url, ShuffleResponse.class);
		
		//Nothing to return
		
	}
	

}
