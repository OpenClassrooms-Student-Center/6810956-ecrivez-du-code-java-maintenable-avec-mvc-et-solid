package com.openclassrooms.cardgame.model;

public class PlayingCard implements PlayableCard {
	private Rank rank;
	private Suit suit;
	private boolean faceUp;
	
	public PlayingCard(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public Rank getRank() {
		return rank;
	}

	@Override
	public Suit getSuit() {
		return suit;
	}
	
	@Override
	public boolean isFaceUp() {
		return faceUp;
	}
	
	@Override
	public boolean flip() {
		faceUp = !faceUp;
		return faceUp;
	}
	
}
