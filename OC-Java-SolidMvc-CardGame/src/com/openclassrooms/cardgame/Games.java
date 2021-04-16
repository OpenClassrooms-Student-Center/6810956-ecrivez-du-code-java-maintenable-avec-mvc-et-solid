package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.HighCardGameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.view.GameSwingView;

public class Games {
	
	public static void main(String args[]) {
		GameSwingView gsv = new GameSwingView();
		gsv.createAndShowGUI();
		
		GameController gc = new GameController(new Deck(), gsv, new HighCardGameEvaluator());
		
		gc.run();
	}
}
