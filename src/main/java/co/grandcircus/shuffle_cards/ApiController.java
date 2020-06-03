package co.grandcircus.shuffle_cards;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.shuffle_cards.model.Card;
import co.grandcircus.shuffle_cards.service.DeckOfCardsService;

@Controller
public class ApiController {

	
	@Autowired
	private DeckOfCardsService service;
	
	
	//Home page
	@RequestMapping("/")
	public String home(Model model) {
		
		//just for fun, I'm making it so you can shuffle from the draw page too
		String url = "/";
		model.addAttribute("url", url);
		
		return "index";
	}
	
	//Draw cards
	@RequestMapping("/draw")
	public String draw(
			@RequestParam("count") int count,
			Model model) {
		
		//Get the cards
		List<Card> cards = service.drawCards(count);
		
		//Add them to the model on page
		model.addAttribute("cards", cards);
		
		//just for fun, I'm making it so you can shuffle from the draw page too
		String url = "/draw?count=" + count;
		model.addAttribute("url", url);
		
		
		//Specify jsp
		return "/draw";
	}
	
	//Shuffle
	@RequestMapping("/shuffle")
	public String shuffle(
			@RequestParam("url") String url,
			Model model) {
		
		service.shuffleDeck();
		
		return "redirect:" + url;
	}
	
	
}
