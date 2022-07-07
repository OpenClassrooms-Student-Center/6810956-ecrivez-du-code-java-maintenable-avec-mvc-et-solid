package com.openclassrooms.cardgame.model;

public interface PlayableCard {
	public Rank getRank();
	
	public Suit getSuit();
	
	public boolean isFaceUp();
	
	public boolean flip();

}
