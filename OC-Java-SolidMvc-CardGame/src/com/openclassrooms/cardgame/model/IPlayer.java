package com.openclassrooms.cardgame.model;

public interface IPlayer {
	
	public void addCardToHand(PlayingCard pc);
	
	public PlayingCard getCard(int index);
	
	public PlayingCard removeCard();
	
	public String getName();
	
}
