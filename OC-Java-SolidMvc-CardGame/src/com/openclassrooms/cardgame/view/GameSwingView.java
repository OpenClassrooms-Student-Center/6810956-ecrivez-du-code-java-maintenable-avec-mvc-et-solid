package com.openclassrooms.cardgame.view;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.openclassrooms.cardgame.controller.GameController;

public class GameSwingView implements GameViewable {

	GameController controller;
	JTextArea textArea;
	JFrame frame;

	public void createAndShowGUI() {

		// create main frame
		frame = new JFrame("MVC-SOLID-Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

		// display vertically
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
        addControllerCommandTracker(contentPane);

		frame.setVisible(true);
	}
	
    // a simple place to display what the controller is telling us
    // very similar to our command line version    
    private void addControllerCommandTracker(Container contentPane) {
	    textArea = new JTextArea("Game Status\n", 100, 1);
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    addCenteredComponent(scrollPane, contentPane);
	    textArea.setSize(500, 500);
    }

    // all controls are added so they are centered horizontally in the area
    private void addCenteredComponent(JComponent component, Container contentPane) {
        component.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPane.add(component);
    }

    
	private void appendText(String text) {
		textArea.append(text + "\n");
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	

	@Override
	public void setController(GameController controller) {

		this.controller = controller;

	}

	@Override
	public void showPlayerName(int playerIndex, String playerName) {
		appendText("[" + playerIndex + "][" + playerName + "]");
	}

	@Override
	public void showCardForPlayer(int playerIndex, String playerName, String cardRank, String cardSuit) {
		appendText("[" + playerName + "][" + cardRank + ":" + cardSuit + "]");
	}

	@Override
	public void showWinner(String winnerName) {
		appendText("Winner!\n" + winnerName);
	}

	@Override
	public void showFaceDownCardForPlayer(int playerIndex, String name) {
		appendText("[" + name + "][][]");
	}

	@Override
	public void promptForPlayerName() {
		
		String result = (String) JOptionPane.showInputDialog(frame, "Add a player", "Player",
				JOptionPane.PLAIN_MESSAGE, null, null, "");
		
		if(result == null || result.isEmpty()) {
			controller.nextAction("+q");
		}
		
		controller.addPlayer(result);
		
		int addMore = JOptionPane.showConfirmDialog(frame, "Add more players ?", "More players", JOptionPane.YES_NO_OPTION);
		
		if( addMore == JOptionPane.NO_OPTION) {
			controller.startGame();
		}
	}

	@Override
	public void promptForFlip() {
		controller.flipCards();
	}

	@Override
	public void promptForNewGame() {
		int newGame = JOptionPane.showConfirmDialog(frame, "Play again ?", "Play again", JOptionPane.YES_NO_OPTION);
		controller.nextAction(newGame == JOptionPane.NO_OPTION ? "+q" : "");
	}
	
	

}
