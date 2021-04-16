package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.HighCardGameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.view.CommandLineView;

public class Games {
	
	public static void main(String args[]) {
		GameController gc = new GameController(new Deck(), new CommandLineView(), new HighCardGameEvaluator());
		//GameController gc = new GameController(new Deck(), new View(), new LowCardGameEvaluator());
		gc.run();
	}
}
