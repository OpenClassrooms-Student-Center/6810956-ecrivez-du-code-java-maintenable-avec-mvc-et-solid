package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.GameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.view.View;

public class Games {
	
	public static void main(String args[]) {
		GameController gc = new GameController(new Deck(), new View(), new GameEvaluator());
		gc.run();
	}
}
