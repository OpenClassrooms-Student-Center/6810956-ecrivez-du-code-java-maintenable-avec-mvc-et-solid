package com.openclassrooms.cardgame.model;

public class PlayableCardFactory {
	public static PlayableCard getPlayableCard(Rank rank, Suit suit) {
		return new PlayingCardAdaptateur(rank, suit);
	}
}
