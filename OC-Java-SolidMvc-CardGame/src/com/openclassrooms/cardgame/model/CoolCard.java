package com.openclassrooms.cardgame.model;

public class CoolCard implements CoolableCard {
	
	@Override
	public boolean turnOver(boolean faceUp) {
		faceUp = !faceUp;
		System.out.println("Cool");
		return faceUp;
	}
}
