package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;

public class Games {
	
	public static void main(String args[]) {
		
		if(args.length >= 3) {
			GameController gc = new GameController(DeckFactory.getDeck(args[0]), GameViewableFactory.getView(args[1]), GameEvaluatorFactory.getGame(args[2]));
			gc.run();
		}
		
		System.out.println("args = <normaldeck | smalldeck | testdeck> <cmdLineview | swingview> <highgame | lowgame");
	}
}
