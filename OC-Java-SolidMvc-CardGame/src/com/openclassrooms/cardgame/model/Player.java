package com.openclassrooms.cardgame.model;

import java.util.List;

public class Player {
	private String name;
	private Hand hand;
	
	
	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}
	
	public void addCardToHand(PlayableCard pc) {
		hand.addCard(pc);
	}
	
	public PlayableCard getCard(int index) {
		return hand.getCard(index);
	}
	
	public PlayableCard removeCard() {
		return hand.removeCard();
	}
	
	public String getName() {
		return name;
	}
	
}
