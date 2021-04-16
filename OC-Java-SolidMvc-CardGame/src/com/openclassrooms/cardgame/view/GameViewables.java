package com.openclassrooms.cardgame.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.openclassrooms.cardgame.controller.GameController;

public class GameViewables implements GameViewable {
	List<GameViewable> views;
	
	public GameViewables () {
		views = new ArrayList<GameViewable> ();
	}
	
    public void addViewable (GameViewable view) {
        views.add(view);
    }
	
	@Override
	public void setController(GameController gc) {
		for (GameViewable view : views) {
			view.setController(gc);
		}
	}

	@Override
	public void promptForPlayerName() {
		for (GameViewable view : views) {
			view.promptForPlayerName();
		}
	}

	@Override
	public void promptForFlip() {
		for (GameViewable view : views) {
			view.promptForFlip();
		}
	}

	@Override
	public void promptForNewGame() {
		for (GameViewable view : views) {
			view.promptForNewGame();
		}
	}

	@Override
	public void showWinner(String playerName) {
		for (GameViewable view : views) {
			view.showWinner(playerName);
		}
	}

	@Override
	public void showPlayerName(int playerIndex, String playerName) {
		for (GameViewable view : views) {
			view.showPlayerName(playerIndex, playerName);
		}
	}

	@Override
	public void showFaceDownCardForPlayer(int i, String playerName) {
		for (GameViewable view : views) {
			view.showFaceDownCardForPlayer(i, playerName);
		}
	}

	@Override
	public void showCardForPlayer(int i, String playerName, String rank, String suit) {
		for (GameViewable view : views) {
			view.showCardForPlayer(i, playerName, rank, suit);
		}
	}
}
