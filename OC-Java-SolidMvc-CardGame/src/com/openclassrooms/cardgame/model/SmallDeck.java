package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

public class SmallDeck extends Deck{
	public SmallDeck() {
		cards = new ArrayList<PlayableCard> ();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				if (rank.value() >= 7) {
					System.out.println ("Creating card: [" + rank + "][" + suit + "]");
					cards.add(PlayableCardFactory.getPlayableCard(rank, suit));
				}
			}
		}
		
		shuffle();
	}
}
