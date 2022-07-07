package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.model.NormalDeck;
import com.openclassrooms.cardgame.model.SmallDeck;
import com.openclassrooms.cardgame.model.TestDeck;

public class DeckFactory {
	public static Deck getDeck(String deck) {
        if(deck == null) {
        	return new NormalDeck();
        }

        if(deck.equalsIgnoreCase("normalDeck")) {
        	return new NormalDeck();
        }
        
        if(deck.equalsIgnoreCase("smallDeck")) {
        	return new SmallDeck();
        }

        if(deck.equalsIgnoreCase("testDeck")) {
        	return new TestDeck();
        }
        
        return new NormalDeck();
	}
}
