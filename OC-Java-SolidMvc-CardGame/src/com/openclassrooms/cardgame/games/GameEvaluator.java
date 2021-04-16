package com.openclassrooms.cardgame.games;

import java.util.List;

import com.openclassrooms.cardgame.model.IPlayer;

public interface GameEvaluator {
	public IPlayer evaluateWinner(List<IPlayer> players);
}
