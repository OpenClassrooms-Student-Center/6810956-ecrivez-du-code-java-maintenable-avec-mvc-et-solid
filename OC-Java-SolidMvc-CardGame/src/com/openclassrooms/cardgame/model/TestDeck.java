package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

public class TestDeck extends Deck{
	public TestDeck() {
		cards = new ArrayList<PlayingCard> ();
		for (int i = 0; i < 20; ++i) {
			cards.add(new PlayingCard (Rank.ACE, Suit.CLUBS));
		}
	}
}
