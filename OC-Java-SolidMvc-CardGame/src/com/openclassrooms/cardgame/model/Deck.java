package com.openclassrooms.cardgame.model;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Deck {
	List<PlayableCard> cards;
	
	public void shuffle() {
		Random random = new Random();
		for (int i = 0; i < cards.size(); ++i) {
			Collections.swap(cards, i, random.nextInt (cards.size()));
		}
	}
	
	public PlayableCard removeTopCard() {
		return cards.remove(0);
	}
	
	public void returnCardToDeck(PlayableCard pc) {
		cards.add(pc);
	}

	public List<PlayableCard> getCards() {
		return cards;
	}
	
}
