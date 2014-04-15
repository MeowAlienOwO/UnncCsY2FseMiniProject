package game;

import java.awt.Container;

import javax.swing.JFrame;

public class GameFrame extends JFrame{


	
	/**
	 * this is the frame of the game
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	//constructor
	public GameFrame(){
		setTitle("Game");
		
		GamePanel defaultPanel = new GamePanel();

		Container contentPane = getContentPane();
		
		contentPane.add(defaultPanel);

		pack();
	}
	
	
	public GameFrame(String title){
		
		setTitle(title);
		
		GamePanel defaultPanel = new GamePanel();

		Container contentPane = getContentPane();
		
		contentPane.add(defaultPanel);

		pack();
		
	}
	
	
	
}
