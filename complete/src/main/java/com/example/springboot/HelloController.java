package com.example.springboot;
import java.util.Random;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

	@RequestMapping(value="/api/QuoteoftheDay",method=RequestMethod.GET, produces = "application/json")
	public String getQuoteoftheDay() {
		Random rand = new Random();

		return Quote.QUOTES[rand.nextInt(Quote.QUOTES.length)];

	}

	public static class Quote {
		public final static String  QUOTES[] = {
				"Be yourself; everyone else is already taken.― Oscar Wilde",
				"A room without books is like a body without a soul. ― Marcus Tullius Cicero",
				"Be the change that you wish to see in the world. ― Mahatma Gandhi",
				"If you tell the truth, you don't have to remember anything. ― Mark Twain",
				"If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.― J.K. Rowling",
				"To live is the rarest thing in the world. Most people exist, that is all.― Oscar Wilde",
				"Without music, life would be a mistake. ― Friedrich Nietzsche",
				"Always forgive your enemies, nothing annoys them so much. ― Oscar Wilde",
				"Life isn't about getting and having, it's about giving and being. –Kevin Kruse",
				"Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill",
				"Strive not to be a success, but rather to be of value. –Albert Einstein",                          
				};    
	}

}
