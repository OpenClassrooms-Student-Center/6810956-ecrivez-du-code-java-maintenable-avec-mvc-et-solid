package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.model.NormalDeck;
import com.openclassrooms.cardgame.model.SmallDeck;
import com.openclassrooms.cardgame.model.TestDeck;

public class DeckFactory {
	public enum DeckType {
		Normal,
		Small,
		Test
	};
	public static Deck makeDeck(DeckType type) {
        switch (type) {
            case Normal: return new NormalDeck();
            case Small: return new SmallDeck();
            case Test: return new TestDeck();
        }
        
        return new NormalDeck();
	}
}
