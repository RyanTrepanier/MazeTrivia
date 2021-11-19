package com.company;

public class Questions implements Prompt{


	@Override
	public void promptForMultipleChoice() {
		System.out.println("-1) " + quitGame);
		System.out.println("1) " + saveGame);
		System.out.println("2) " + loadGame);
		//  optional answer
		//  optional answer
		//  optional answer
		//  optional answer
	}

	@Override
	public void promptForTrueFalse() {
		System.out.println("-1) " + quitGame);
		System.out.println("1) " + saveGame);
		System.out.println("2) " + loadGame);
		System.out.println("3) True");
		System.out.println("4) False");
	}

	@Override
	public void promptForShortAnswer() {
		System.out.println("-1) " + quitGame);
		System.out.println("1) " + saveGame);
		System.out.println("2) " + loadGame);
		//  short answer (one word response)
	}
	 
}
