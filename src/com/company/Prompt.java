package com.company;

public interface Prompt {

	final String saveGame = "Save";
	final String loadGame = "Load";
	final String quitGame = "Quit";
	
	void promptForMultipleChoice();
	
	void promptForTrueFalse();
	
	void promptForShortAnswer();
	
}
