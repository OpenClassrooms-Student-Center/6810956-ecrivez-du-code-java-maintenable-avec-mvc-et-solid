package com.openclassrooms.cardgame;
import com.openclassrooms.cardgame.view.CommandLineView;
import com.openclassrooms.cardgame.view.GameSwingView;
import com.openclassrooms.cardgame.view.GameViewable;

public class GameViewableFactory {
	
	public static GameViewable getView(String gameView) {
		if (gameView == null) {
			return new CommandLineView();
		}

		if (gameView.equalsIgnoreCase("cmdLineView")) {
			return new CommandLineView();
		}

		if (gameView.equalsIgnoreCase("swingView")) {
			GameSwingView gsv = new GameSwingView();
			gsv.createAndShowGUI();			
			return gsv;
		}
				
		return new CommandLineView();
	}
}
