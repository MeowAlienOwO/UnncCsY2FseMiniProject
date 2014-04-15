package game;

import javax.swing.JFrame;

//import java.awt.Color;

//import jgame.*;

//import jgame.impl.*;
//
//import jgame.platform.*;

public class Game{
	/**
	 * Here is the main part of the game, including:
	 * the main loop 
	 * several method to set the related attributes
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private String title;
	
	private Boolean gameRun = true;
	//constructor
	public Game(String title){
		setTitle(title);
	}
	
	
	//setter
	public void setTitle(String title){
		this.title = title;
	}
	
	
	//getter
	public String getTitle(){
		return title;
	}
	
	
	public void run(){
		/**
		 * Run is the main loop of the game
		 */
		outputGraph();
		
		outputAudio();
		

		
	}
	
	private void updateAudio() {
		// TODO Auto-generated method stub
		
	}


	private void updateGraph() {
		// TODO Auto-generated method stub
		
	}


	public void endGame(){
		this.gameRun = false;
	}
	

	private void getKeyBoardInput() {
		// TODO Auto-generated method stub
		
	}

	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	private void outputGraph() {
		// TODO Auto-generated method stub
		GameFrame frame = new GameFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

	private void outputAudio() {
		// TODO Auto-generated method stub
		
	}

}
