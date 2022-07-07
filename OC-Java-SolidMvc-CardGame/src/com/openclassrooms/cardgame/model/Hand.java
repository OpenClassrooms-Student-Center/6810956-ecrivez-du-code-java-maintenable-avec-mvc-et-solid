package com.openclassrooms.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<PlayableCard> cards;

	public Hand() {
		cards = new ArrayList<PlayableCard>();
	}
	
	public void addCard(PlayableCard pc) {
		cards.add(pc);
	}
	
	public PlayableCard getCard(int index) {
		return cards.get(index);
	}
	
	public PlayableCard removeCard() {
		return cards.remove(0);
	}
	
}
