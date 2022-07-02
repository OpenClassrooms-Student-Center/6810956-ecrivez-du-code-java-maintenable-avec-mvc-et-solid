package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.games.GameEvaluator;
import com.openclassrooms.cardgame.games.HighCardGameEvaluator;
import com.openclassrooms.cardgame.games.LowCardGameEvaluator;

public class GameEvaluatorFactory {
	public static GameEvaluator getGame(String game) {
		if (game == null) {
			return new HighCardGameEvaluator();
		}

		if (game.equalsIgnoreCase("highGame")) {
			return new HighCardGameEvaluator();
		}
		
		if (game.equalsIgnoreCase("lowGame")) {
			return new LowCardGameEvaluator();
		}
				
		return  new HighCardGameEvaluator();
	}
}
