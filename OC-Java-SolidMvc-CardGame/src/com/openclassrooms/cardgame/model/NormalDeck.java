package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

public class NormalDeck extends Deck {
	public NormalDeck() {
		cards = new ArrayList<PlayableCard>();
		for(Rank rank : Rank.values()) {
			for(Suit suit: Suit.values()) {
				System.out.println("Creating card ["+rank+"]["+suit+"]");
				cards.add(PlayableCardFactory.getPlayableCard(rank, suit));
			}
		}
		
		shuffle();
	}
}
