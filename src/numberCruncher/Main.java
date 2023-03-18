package numberCruncher;																					

import javax.swing.*;																						//Provides a set of "lightweight" components that, to the maximum degree possible, work the same on all platforms.                                                                                   
import javax.swing.border.BevelBorder;                                                                  	//Provides a set of "lightweight" components that, to the maximum degree possible, work the same on all platforms.
import javax.swing.border.EmptyBorder;                                                                      //Provides a set of "lightweight" components that, to the maximum degree possible, work the same on all platforms.
import java.awt.Font;                                                                                       //Contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.BorderLayout;                                                                               //Contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.event.ActionListener;                                                                       //Contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.event.ActionEvent;                                                                          //Contains all of the classes for creating user interfaces and for painting graphics and images.
																											
public class Main extends JFrame {                                                                          
																											
	private static final long serialVersionUID = 1L;                                                        //Declares and sets a serialization for JFrame.
																											
	private static JPanel contentPane;	                                                                    //Declares a content pane object.
	private static JLayeredPane ldpMenuPane;                                                                //Declares a layer pane object for menu.
	private static JLayeredPane ldpGamePane;                                                                //Declares a layer pane object for game play.
																											
	private static JButton btnEasy;                                                                         //Declares a JButton for Easy game play.
	private static JButton btnModerate;                                                                     //Declares a JButton for Moderate game play.
	private static JButton btnDifficult;                                                                    //Declares a JButton for Difficult game play.
	private static JButton btnExit;                                                                         //Declares a JButton to exit from menu.
	private static JButton btnIcon01;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnIcon01_1;                                                                     //Declares a JButton for icons (right or wrong).
	private static JButton btnIcon02;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnIcon02_1;                                                                     //Declares a JButton for icons (right or wrong).
	private static JButton btnIcon03;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnIcon03_1;                                                                     //Declares a JButton for icons (right or wrong).
	private static JButton btnIcon04;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnIcon04_1;                                                                     //Declares a JButton for icons (right or wrong).
	private static JButton btnIcon05;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnIcon05_1;                                                                     //Declares a JButton for icons (right or wrong).
	private static JButton btnIcon06;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnIcon06_1;                                                                     //Declares a JButton for icons (right or wrong).
	private static JButton btnIcon07;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnIcon07_1;                                                                     //Declares a JButton for icons (right or wrong).
	private static JButton btnSubmit;                                                                       //Declares a JButton for icons (up or down).
	private static JButton btnQuitGame;                                                                     //Declares a JButton to quit the game play.
																											
	private static JLabel lblUp;                                                                            //Declares a JLabel to show the instructions.
	private static JLabel lblDown;                                                                          //Declares a JLabel to show the instructions.
	private static JLabel lblCorrect;                                                                       //Declares a JLabel to show the instructions.
	private static JLabel lblWrong;                                                                         //Declares a JLabel to show the instructions.
	private static JLabel lblInstructions;                                                                  //Declares a JLabel to show the instructions.
	private static JLabel lblScoreTitle;                                                                    //Declares a JLabel to show the score title.
	private static JLabel lblScore;                                                                         //Declares a JLabel to show the score.
	private static JLabel lblLevelTitle;                                                                    //Declares a JLabel to show the level title.
	private static JLabel lblLevel;                                                                         //Declares a JLabel to show the level.
	private static JLabel lblRange;                                                                         //Declares a JLabel to show the range.
	private static JLabel lblDifficulty;                                                                    //Declares a JLabel to show the difficulty.
																											
	private static JLabel lblGuessesTrack01;                                                                //Declares a JLabel to show the guesses track title.
	private static JLabel lblGuessesTrack02;                                                                //Declares a JLabel to show the guesses track title.
	private static JLabel lblGuessesTrack03;                                                                //Declares a JLabel to show the guesses track title.
	private static JLabel lblGuessesTrack04;                                                                //Declares a JLabel to show the guesses track title.
	private static JLabel lblGuessesTrack05;                                                                //Declares a JLabel to show the guesses track title.
	private static JLabel lblGuessesTrack06;                                                                //Declares a JLabel to show the guesses track title.
	private static JLabel lblGuessesTrack07;                                                                //Declares a JLabel to show the guesses track title.
																											
	private static JTextField txtGuessNumber01;                                                             //Declares a JLabel to input the guess number.
	private static JTextField txtGuessNumber02;                                                             //Declares a JLabel to input the guess number.
	private static JTextField txtGuessNumber03;                                                             //Declares a JLabel to input the guess number.
	private static JTextField txtGuessNumber04;                                                             //Declares a JLabel to input the guess number.
	private static JTextField txtGuessNumber05;                                                             //Declares a JLabel to input the guess number.
	private static JTextField txtGuessNumber06;                                                             //Declares a JLabel to input the guess number.
	private static JTextField txtGuessNumber07;                                                             //Declares a JLabel to input the guess number.
																											
	private static JLabel lblGuessesLeft01;                                                                 //Declares a JLabel to input the guesses left.
	private static JLabel lblGuessesLeft02;                                                                 //Declares a JLabel to input the guesses left.
	private static JLabel lblGuessesLeft03;                                                                 //Declares a JLabel to input the guesses left.
	private static JLabel lblGuessesLeft04;                                                                 //Declares a JLabel to input the guesses left.
	private static JLabel lblGuessesLeft05;                                                                 //Declares a JLabel to input the guesses left.
	private static JLabel lblGuessesLeft06;                                                                 //Declares a JLabel to input the guesses left.
	private static JLabel lblGuessesLeft07;                                                                 //Declares a JLabel to input the guesses left.
																											
	public static ImageIcon up = new ImageIcon("Images/up.png");                                            //Declares and instantiates an image icon object.
	public static ImageIcon down = new ImageIcon("Images/down.png");                                        //Declares and instantiates an image icon object.
	public static ImageIcon correct = new ImageIcon("Images/correct.png");                                  //Declares and instantiates an image icon object.
	public static ImageIcon wrong = new ImageIcon("Images/wrong.png");                                      //Declares and instantiates an image icon object.
																											
	private static DefaultListModel<String> guessList01 = new DefaultListModel<>();                         //Declares and instantiates list model object.
	private static DefaultListModel<String> guessList02 = new DefaultListModel<>();                         //Declares and instantiates list model object.
	private static DefaultListModel<String> guessList03 = new DefaultListModel<>();                         //Declares and instantiates list model object.
	private static DefaultListModel<String> guessList04 = new DefaultListModel<>();                         //Declares and instantiates list model object.
	private static DefaultListModel<String> guessList05 = new DefaultListModel<>();                         //Declares and instantiates list model object.
	private static DefaultListModel<String> guessList06 = new DefaultListModel<>();                         //Declares and instantiates list model object.
	private static DefaultListModel<String> guessList07 = new DefaultListModel<>();                         //Declares and instantiates list model object.
																											
	private static JList<String> lHistory01;                                                                //Declares a list to store the wrong guesses.
	private static JList<String> lHistory02;                                                                //Declares a list to store the wrong guesses.
	private static JList<String> lHistory03;                                                                //Declares a list to store the wrong guesses.
	private static JList<String> lHistory04;                                                                //Declares a list to store the wrong guesses.
	private static JList<String> lHistory05;                                                                //Declares a list to store the wrong guesses.
	private static JList<String> lHistory06;                                                                //Declares a list to store the wrong guesses.
	private static JList<String> lHistory07;                                                                //Declares a list to store the wrong guesses.
																											
	private static Game track01;                                                                            //Declares a game object.
	private static Game track02;                                                                            //Declares a game object.
	private static Game track03;	                                                                        //Declares a game object.
	private static Game track04;                                                                            //Declares a game object.
	private static Game track05;                                                                            //Declares a game object.
	private static Game track06;                                                                            //Declares a game object.
	private static Game track07;	                                                                        //Declares a game object.
	private static Save save;                                                                               //Declares a game object.
																											
	private static int guessesLeft01;                                                                       //Declares a data member to store the guesses left.
	private static int guessesLeft02;                                                                       //Declares a data member to store the guesses left.
	private static int guessesLeft03;                                                                       //Declares a data member to store the guesses left.
	private static int guessesLeft04;                                                                       //Declares a data member to store the guesses left.
	private static int guessesLeft05;                                                                       //Declares a data member to store the guesses left.
	private static int guessesLeft06;                                                                       //Declares a data member to store the guesses left.
	private static int guessesLeft07;                                                                       //Declares a data member to store the guesses left.
																											
	private static String initials = "";                                                                    //Declares and initiates a data member to store the initials.
	private static int counterBonus = 0;                                                                    //Declares and initiates a data member to store the bonus counter.
	private static int subLevel = 1;                                                                        //Declares and initiates a data member to store the sub level.
	private static int range = 0;                                                                           //Declares and initiates a data member to store the range.
	private static int BONUS = 50;                                                                          //Declares and initiates a static data member to store the bonus
	private static int loose = 0;                                                                           //Declares and initiates a data member to store the number of lost tracks.
	private static enum GameState {EASY, MODERATE, DIFFICULT};                                              //Declares and initiates a data member to store the static game state.
	private static GameState level;                                                                         //Declares a data member to store the dynamic game state.
	
	public static void main(String[] args) {                                                            
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void main()
		//
		// Method parameters	:	String[] args - the method permits String command line parameters to be entered
		//
		// Method return		:	void
		//
		// Synopsis				:   This is the main method loads the splash screen, generates the main frame for the content pane layer and 							
		//							checks the initials.
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		int x;                                                                                          	//Declares an local variable for loop and verification.
		SplashScreen splash = new SplashScreen();                                                           //Declares and instantiates an splash object.
		splash.setVisible(true);                                                                            //Sets the splash to visible.
		Main main = new Main();                                                                             //Declares and instantiates an main object (call constructor).
		main.setUndecorated(true);                                                                          //Sets main to no borders.
		save = new Save();                                                                         		    //Declares and instantiates a save object.
		try {                                                                                               //try
			for(x = 0; x <= 100; x++) {                                                                     //Loop for progress bar percentage.
				splash.setProgressBar(x);				                                                    //Uses X for progress bar value.
				Thread.sleep(50);                                                                           //Puts to sleep for 50ms.
				splash.setLblProgress(Integer.toString(x) + " %");				                            //Updates the progress bar.
				if(x == 100) {					                                                            //Verifies if the bar got 100%.
					splash.setVisible(false);					                                            //Sets splash to invisible.																											
					boolean validChar = true;				                                                //Declares and sets a boolean to true to test the initials.
					int countLetters = 0;                                                                   //Declares and sets the letter counter.
																											
					do {                                                                                    
						validChar = true;                                                                   //Sets the boolean to true.
						main.setInitials(JOptionPane.showInputDialog("Please enter your 3 initials."));     //Displays a message to input initials.
						countLetters = main.getInitials().length();                                         //Stores the length of the initials.
						if(!main.getInitials().matches("^[a-zA-Z]+$") || countLetters != 3) {               //Verifies if the initials are not alphabet or different then 3 chars.
							validChar = false;	                                                            //Sets to false.
						}                                                                                   																											
					}while(validChar == false);                                                             //Go back to input initial if the boolean is false.
																											
					if(save.loadFile(main.getInitials()).equalsIgnoreCase("")) {                            //Verifies if the loadFile method returns empty file.
						save.createFile(main.getInitials());                                                //Creates the file,
						save.setSubLevel(1);                                                                //Sets sub level 1.
						save.inputFile(main.getInitials());                                             	//Save score 0, sub level 1 and level 0.			
					}else {                                                                             	//else (initials exists)	
						subLevel = save.getSubLevel();                                                      //Stores sub level.
						if(save.getGameState() == 2) {                                                      //Verifies the level.
							level = GameState.DIFFICULT;                                                    //Sores the level.
							range = subLevel * 1000;                                                        //Stores the range.
							gameState(level);                                                               //Loads the level.
							save.setGameState(2);                                                           //Save the game state (level).
						}else if(save.getGameState() == 1) {                                                //else verifies the level.         
							level = GameState.MODERATE;                                                     //Sores the level.            
							range = subLevel * 100;                                                         //Stores the range.           
							gameState(level);                                                               //Loads the level.            
							save.setGameState(1);                                                           //Save the game state (level).
						}else {                                                                             //else
							level = GameState.EASY;                                                         //Sores the level.        
							range =  subLevel * 10;                                                         //Stores the range.            
							gameState(level);                                                               //Loads the level.           
							save.setGameState(0);                                                           //Save the game state (level).            
						}                                                                                   
					}					                                                                    
					main.setVisible(true);                                                                  //Sets the main visible.
				}                                                                                           
			}                                                                                               
		} catch (InterruptedException e) {                                                                  //catch
			e.printStackTrace();                                                                            //Helps to understand where the actual problem occurred.
		}		                                                                                            
	}                                                                                                       
																											
	public Main() {			                                                                                
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Main()
		//
		// Method parameters	:	none
		//
		// Method return		:	none
		//
		// Synopsis				:   This is the constructor method.							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-06		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		initialize();                                                                                       //Call the initialize method that loads all the interface.
	}                                                                                                       

	//GETTERS AND SETTERS
	public String getInitials() {                                                                           
		return initials;                                                                                    //Returns the initials.
	}                                                                                                       
																											
	public void setInitials(String init) {	                                                                
		initials = init;                                                                       		        //Sets the initials.
	}                                                                                                       
	
	public int deductGuesses(int txtGuessNumber) {                                                      
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	int deductGuesses()
		//
		// Method parameters	:	none
		//
		// Method return		:	none
		//
		// Synopsis				:   This method verifies the JField and deducts the guesses left.							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		int guesses = 0;                                                                                	//Declares and instantiates a local variable for guesses.
		switch (txtGuessNumber) {                                                                           //Switch to check the track. 
		case 1: {				                                                                            
			guesses = guessesLeft01 -= 1;                                                                   //Sets the deduction from guesses left.
			if(guesses < 1) {                                                                               //Verifies if there are no more guesses.
				txtGuessNumber01.setVisible(false);                                                     	//Disables the input field.	
				loose++;                                                                                    //Add looses counter.
			}                                                                                               
			break;                                                                                          
		}                                                                                                   
		case 2: {				                                                                            
			guesses = guessesLeft02 -= 1;                                                                   //Sets the deduction from guesses left.  
			if(guesses < 1) {                                                                               //Verifies if there are no more guesses. 
				txtGuessNumber02.setVisible(false);                                                         //Disables the input field.	             
				loose++;                                                                                    //Add looses counter.                    
			}                                                                                               
			break;                                                                                          
		}                                                                                                   
		case 3: {				                                                                            
			guesses = guessesLeft03 -= 1;                                                                   //Sets the deduction from guesses left.  
			if(guesses < 1) {                                                                               //Verifies if there are no more guesses. 
				txtGuessNumber03.setVisible(false);                                                         //Disables the input field.	             
				loose++;                                                                                    //Add looses counter.                    
			}                                                                                               
			break;                                                                                          
		}                                                                                                   
		case 4: {				                                                                            
			guesses = guessesLeft04 -= 1;                                                                   //Sets the deduction from guesses left.  
			if(guesses < 1) {                                                                               //Verifies if there are no more guesses. 
				txtGuessNumber04.setVisible(false);                                                         //Disables the input field.	             
				loose++;                                                                                    //Add looses counter.                    
			}                                                                                               
			break;                                                                                          
		}                                                                                                   
		case 5: {				                                                                            
			guesses = guessesLeft05 -= 1;                                                                   //Sets the deduction from guesses left.  
			if(guesses < 1) {                                                                               //Verifies if there are no more guesses. 
				txtGuessNumber05.setVisible(false);                                                         //Disables the input field.	             
				loose++;                                                                                    //Add looses counter.                    
			}                                                                                               
			break;                                                                                          
		}                                                                                                   
		case 6: {				                                                                            
			guesses = guessesLeft06 -= 1;                                                                   //Sets the deduction from guesses left.  
			if(guesses < 1) {                                                                               //Verifies if there are no more guesses. 
				txtGuessNumber06.setVisible(false);                                                         //Disables the input field.	             
				loose++;                                                                                    //Add looses counter.                    
			}                                                                                               
			break;                                                                                          
		}                                                                                                   
		case 7: {				                                                                            //Sets the deduction from guesses left.  
			guesses = guessesLeft07 -= 1;                                                                   //Verifies if there are no more guesses. 
			if(guesses < 1) {                                                                               //Disables the input field.	             
				txtGuessNumber07.setVisible(false);                                                     	//Add looses counter.                    
			}                                                                                               
			break;                                                                                          
		}                                                                                                   
		default:                                                                                            
			throw new IllegalArgumentException("Unexpected value: " + txtGuessNumber);                      //Displays a message if the track number is out of range.
		}		                                                                                            
		if(loose == 1) {                                                                                    //Verifies if one track failed (no guesses left).
			JOptionPane.showMessageDialog(null, "You loose!");                                              //Displays a message to the player.
			btnSubmit.setEnabled(false);                                                                    //Disable the Submit button.
		}                                                                                                   
		return guesses;                                                                                     //Returns the guesses left for the deducted track.
	}                                                                                                       
																											
	public static void gameState(GameState level) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void gameState()
		//
		// Method parameters	:	none
		//
		// Method return		:	none
		//
		// Synopsis				:   This method verifies the game state and sets all the components properly.							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-06		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		switch (level) {                                                                                    //Switch to verify the level. 
		case EASY: {			                                                                            
			lblScore.setText("" + save.getPoints());                                                        //Sets the points on a label.
			lblLevel.setText("" + save.getSubLevel());                                             	    	//Sets the sub level on a label. 
			lblRange.setText("Range: 1 - " + range);                                                        //Sets the range on a label.
			lblDifficulty.setText("EASY");                                                                  //Sets the level on a label.
			guessList01.clear();                                                                            //Clears the track list.
			lHistory01.setVisible(true);                                                                    //Sets track history list to visible.
			btnIcon01.setIcon(null);                                                                        //Clears the track icon (up or down).
			btnIcon01_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).
			txtGuessNumber01.setText(null);                                                                 //Clears the track guess number input.
			txtGuessNumber01.setVisible(true);                                                              //Sets the track guess number input to visible.
			guessList02.clear();                                                                            //Clears the track list.                       
			lHistory02.setVisible(true);                                                                    //Sets track history list to visible.          
			btnIcon02.setIcon(null);                                                                        //Clears the track icon (up or down).          
			btnIcon02_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).      
			txtGuessNumber02.setText(null);                                                                 //Clears the track guess number input.         
			txtGuessNumber02.setVisible(true);                                                              //Sets the track guess number input to visible.
			guessList03.clear();                                                                            //Clears the track list.                       
			lHistory03.setVisible(true);                                                                    //Sets track history list to visible.          
			btnIcon03.setIcon(null);                                                                        //Clears the track icon (up or down).          
			btnIcon03_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).      
			txtGuessNumber03.setText(null);                                                                 //Clears the track guess number input.         
			txtGuessNumber03.setVisible(true);                                                              //Sets the track guess number input to visible.
																											
			ldpMenuPane.setVisible(false);                                                          	    //Sets the menu to invisible.
			contentPane.add(ldpGamePane, BorderLayout.CENTER);                                              //Add game pane into content pane.
			ldpGamePane.setVisible(true);                                                                   //Sets the game pane to visible.
			lblGuessesTrack04.setVisible(false);                                                            //Sets the track title to invisible.
			lHistory04.setVisible(false);                                                                   //Sets track history list to invisible.
			txtGuessNumber04.setVisible(false);                                                             //Sets the track guess number input to invisible.
			lblGuessesTrack05.setVisible(false);                                                            //Sets the track title to invisible.
			lHistory05.setVisible(false);                                                                   //Sets track history list to invisible.
			txtGuessNumber05.setVisible(false);                                                             //Sets the track guess number input to invisible.
			lblGuessesTrack06.setVisible(false);                                                            //Sets the track title to invisible.
			lHistory06.setVisible(false);                                                                   //Sets track history list to invisible.
			txtGuessNumber06.setVisible(false);                                                             //Sets the track guess number input to invisible.
			lblGuessesTrack07.setVisible(false);                                                            //Sets the track title to invisible.
			lHistory07.setVisible(false);                                                                   //Sets track history list to invisible.
			txtGuessNumber07.setVisible(false);                                                             //Sets the track title to invisible.
			btnSubmit.setVisible(true);                                                                     //Sets the button submit to visible.
																											
			int countModes = 0;                                                                             //Declares and sets a mode numbers counter.
			guessesLeft01 += 5;                                                                             //Stores the track guesses left.
			lblGuessesLeft01.setText("" + guessesLeft01);                                                   //Sets the track guesses left on a label.
			do {					                                                                        
				track01.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.
				track01.quickSort(0, track01.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.
				countModes = track01.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.
//				System.out.println("Mode: " + track01.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.
																											
			guessesLeft02 += 5;		                                                                        //Stores the track guesses left.                                                     
			lblGuessesLeft02.setText("" + guessesLeft02);                                                   //Sets the track guesses left on a label.                                            
			do {					                                                                                                                                                             
				track02.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                  
				track02.quickSort(0, track02.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                    
				countModes = track02.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.  
//				System.out.println("Mode: " + track02.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                        
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                              
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.         
																											
			guessesLeft03 += 5;                                                                             //Stores the track guesses left.                                                     
			lblGuessesLeft03.setText("" + guessesLeft03);                                                   //Sets the track guesses left on a label.                                            
			do {					                                                                                                                                                             
				track03.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                  
				track03.quickSort(0, track03.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                    
				countModes = track03.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.  
//				System.out.println("Mode: " + track03.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                        
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                              
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.         
//			System.out.println("***************************");                                              
		}                                                                                                   
		break;                                                                                              
		case MODERATE: {			                                                                                                                        
			lblScore.setText("" + save.getPoints());                                                        //Sets the points on a label.                   
			lblLevel.setText("" + save.getSubLevel());                                                      //Sets the sub level on a label.                
			lblRange.setText("Range: 1 - " + range);                                                        //Sets the range on a label.                    
			lblDifficulty.setText("MODERATE");                                                              //Sets the level on a label.                    
			guessList01.clear();                                                                            //Clears the track list.                        
			lHistory01.setVisible(true);                                                                    //Sets track history list to visible.           
			btnIcon01.setIcon(null);                                                                        //Clears the track icon (up or down).           
			btnIcon01_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).       
			txtGuessNumber01.setText(null);                                                                 //Clears the track guess number input.          
			txtGuessNumber01.setVisible(true);                                                              //Sets the track guess number input to visible. 
			lblGuessesTrack01.setVisible(true);                                                             //Sets the guess track to visible.
			guessList02.clear();                                                                            //Clears the track list.                       
			lHistory02.setVisible(true);                                                                    //Sets track history list to visible.          
			btnIcon02.setIcon(null);                                                                        //Clears the track icon (up or down).          
			btnIcon02_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).      
			txtGuessNumber02.setText(null);                                                                 //Clears the track guess number input.         
			txtGuessNumber02.setVisible(true);                                                              //Sets the track guess number input to visible.
			lblGuessesTrack02.setVisible(true);                                                             //Sets the guess track to visible.             
			guessList03.clear();                                                                            //Clears the track list.                       
			lHistory03.setVisible(true);                                                                    //Sets track history list to visible.          
			btnIcon03.setIcon(null);                                                                        //Clears the track icon (up or down).          
			btnIcon03_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).      
			txtGuessNumber03.setText(null);                                                                 //Clears the track guess number input.         
			txtGuessNumber03.setVisible(true);                                                              //Sets the track guess number input to visible.
			lblGuessesTrack03.setVisible(true);                                                             //Sets the guess track to visible.             
			guessList04.clear();                                                                            //Clears the track list.                       
			lHistory04.setVisible(true);                                                                    //Sets track history list to visible.          
			btnIcon04.setIcon(null);                                                                        //Clears the track icon (up or down).          
			btnIcon04_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).      
			txtGuessNumber04.setText(null);                                                                 //Clears the track guess number input.         
			txtGuessNumber04.setVisible(true);                                                              //Sets the track guess number input to visible.
			lblGuessesTrack04.setVisible(true);                                                             //Sets the guess track to visible.             
			guessList05.clear();			                                                                //Clears the track list.                       
			lHistory05.setVisible(true);                                                                    //Sets track history list to visible.          
			btnIcon05.setIcon(null);                                                                        //Clears the track icon (up or down).          
			btnIcon05_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).      
			txtGuessNumber05.setText(null);                                                                 //Clears the track guess number input.         
			txtGuessNumber05.setVisible(true);                                                              //Sets the track guess number input to visible.
			lblGuessesTrack05.setVisible(true);                                                             //Sets the guess track to visible.             
																											
			ldpMenuPane.setVisible(false);                                                                  //Sets the menu to invisible.      
			contentPane.add(ldpGamePane, BorderLayout.CENTER);                                              //Add game pane into content pane. 
			ldpGamePane.setVisible(true);		                                                            //Sets the game pane to visible.   
			lblGuessesTrack06.setVisible(false);                                                            //Sets the track title to invisible.               
			lHistory06.setVisible(false);                                                                   //Sets track history list to invisible.            
			txtGuessNumber06.setVisible(false);                                                             //Sets the track guess number input to invisible.  
			lblGuessesTrack07.setVisible(false);                                                            //Sets the track title to invisible.               
			lHistory07.setVisible(false);                                                                   //Sets track history list to invisible.            
			txtGuessNumber07.setVisible(false);                                                             //Sets the track guess number input to invisible.  
			btnSubmit.setVisible(true);                                                                     //Sets the button submit to visible. 
																											
			int countModes = 0;                                                                             //Declares and sets a mode numbers counter.                                        
			guessesLeft01 += 7;                                                                             //Stores the track guesses left.                                                   
			lblGuessesLeft01.setText("" + guessesLeft01);                                                   //Sets the track guesses left on a label.                                          
			do {					                                                                                                                                                           
				track01.populateArrayList(range);				                                    	    //Populates the dynamic array with a dynamic range.                                
				track01.quickSort(0, track01.getNumberList().size() - 1);                           	    //Sorts the dynamic array starting from 0 to 999.                                  
				countModes = track01.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.
//				System.out.println("Mode: " + track01.getModeNumber()); 	                                //Displays the modes on console (DEBUG ONLY).                                      
			}while (countModes > 1);	                                                                    //Loops if there is more than one mode.                                            
//			System.out.println("Number above is correct."); 								                //Displays a line on console (DEBUG ONLY) that indicates the correct number.       
																											
			guessesLeft02 += 7;                                                                             //Stores the track guesses left.                                                      
			lblGuessesLeft02.setText("" + guessesLeft02);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track02.populateArrayList(range);				                                    		//Populates the dynamic array with a dynamic range.                                   
				track02.quickSort(0, track02.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track02.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track02.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft03 += 7;                                                                             //Stores the track guesses left.                                                      
			lblGuessesLeft03.setText("" + guessesLeft03);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track03.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track03.quickSort(0, track03.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track03.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track03.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft04 += 7;                                                                             //Stores the track guesses left.                                                      
			lblGuessesLeft04.setText("" + guessesLeft04);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track04.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track04.quickSort(0, track04.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track04.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track04.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft05 += 7;                                                                             //Stores the track guesses left.                                                      
			lblGuessesLeft05.setText("" + guessesLeft05);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track05.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track05.quickSort(0, track05.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track05.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track05.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
//			System.out.println("***************************");                                              
		}                                                                                                   
		break;                                                                                              
		case DIFFICULT: {			                                                                        //
			lblScore.setText("" + save.getPoints());                                                        //Sets the points on a label.                     
			lblLevel.setText("" + save.getSubLevel());                                                      //Sets the sub level on a label.                  
			lblRange.setText("Range: 1 - " + range);                                                        //Sets the range on a label.                      
			lblDifficulty.setText("DIFFICULT");                                                             //Sets the level on a label.                      
			guessList01.clear();                                                                            //Clears the track list.                          
			lHistory01.setVisible(true);                                                                    //Sets track history list to visible.             
			btnIcon01.setIcon(null);                                                                        //Clears the track icon (up or down).             
			btnIcon01_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).         
			txtGuessNumber01.setText(null);                                                                 //Clears the track guess number input.            
			txtGuessNumber01.setVisible(true);                                                              //Sets the track guess number input to visible.   
			lblGuessesTrack01.setVisible(true);                                                             //Sets the guess track to visible.                
			guessList02.clear();                                                                            //Clears the track list.                          
			lHistory02.setVisible(true);                                                                    //Sets track history list to visible.             
			btnIcon02.setIcon(null);                                                                        //Clears the track icon (up or down).             
			btnIcon02_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).         
			txtGuessNumber02.setText(null);                                                                 //Clears the track guess number input.            
			txtGuessNumber02.setVisible(true);                                                              //Sets the track guess number input to visible.   
			lblGuessesTrack02.setVisible(true);                                                             //Sets the guess track to visible.                
			guessList03.clear();                                                                            //Clears the track list.                          
			lHistory03.setVisible(true);                                                                    //Sets track history list to visible.             
			btnIcon03.setIcon(null);                                                                        //Clears the track icon (up or down).             
			btnIcon03_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).         
			txtGuessNumber03.setText(null);                                                                 //Clears the track guess number input.            
			txtGuessNumber03.setVisible(true);                                                              //Sets the track guess number input to visible.   
			lblGuessesTrack03.setVisible(true);                                                             //Sets the guess track to visible.                
			guessList04.clear();                                                                            //Clears the track list.                          
			lHistory04.setVisible(true);                                                                    //Sets track history list to visible.             
			btnIcon04.setIcon(null);                                                                        //Clears the track icon (up or down).             
			btnIcon04_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).         
			txtGuessNumber04.setText(null);                                                                 //Clears the track guess number input.            
			txtGuessNumber04.setVisible(true);                                                              //Sets the track guess number input to visible.   
			lblGuessesTrack04.setVisible(true);                                                             //Sets the guess track to visible.                
			guessList05.clear();                                                                            //Clears the track list.                          
			lHistory05.setVisible(true);                                                                    //Sets track history list to visible.             
			btnIcon05.setIcon(null);                                                                        //Clears the track icon (up or down).             
			btnIcon05_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).         
			txtGuessNumber05.setText(null);                                                                 //Clears the track guess number input.            
			txtGuessNumber05.setVisible(true);                                                              //Sets the track guess number input to visible.   
			lblGuessesTrack05.setVisible(true);                                                             //Sets the guess track to visible.                
			guessList06.clear();                                                                            //Clears the track list.                          
			lHistory06.setVisible(true);                                                                    //Sets track history list to visible.             
			btnIcon06.setIcon(null);                                                                        //Clears the track icon (up or down).             
			btnIcon06_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).         
			txtGuessNumber06.setText(null);                                                                 //Clears the track guess number input.            
			txtGuessNumber06.setVisible(true);                                                              //Sets the track guess number input to visible.   
			lblGuessesTrack06.setVisible(true);                                                             //Sets the guess track to visible.                
			guessList07.clear();                                                                            //Clears the track list.                          
			lHistory07.setVisible(true);                                                                    //Sets track history list to visible.             
			btnIcon07.setIcon(null);                                                                        //Clears the track icon (up or down).             
			btnIcon07_1.setIcon(null);                                                                      //Clears the track icon (right or wrong).         
			txtGuessNumber07.setText(null);                                                                 //Clears the track guess number input.            
			txtGuessNumber07.setVisible(true);                                                              //Sets the track guess number input to visible.   
			lblGuessesTrack07.setVisible(true);                                                             //Sets the guess track to visible.                
																											
			ldpMenuPane.setVisible(false);                                                                  //Sets the menu to invisible.      
			contentPane.add(ldpGamePane, BorderLayout.CENTER);                                              //Add game pane into content pane. 
			ldpGamePane.setVisible(true);                                                                   //Sets the game pane to visible.   
			btnSubmit.setVisible(true);                                                                     //Sets the button submit to visible. 
																											
			int countModes = 0;                                                                             //Declares and sets a mode numbers counter.                                        
			guessesLeft01 += 11;                                                                            //Stores the track guesses left.                                                   
			lblGuessesLeft01.setText("" + guessesLeft01);                                                   //Sets the track guesses left on a label.                                          
			do {					                                                                                                                                                           
				track01.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                
				track01.quickSort(0, track01.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                  
				countModes = track01.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.
//				System.out.println("Mode: " + track01.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                      
			}while (countModes > 1);	                                                                    //Loops if there is more than one mode.                                            
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.       
																											
			guessesLeft02 += 11;                                                                            //Stores the track guesses left.                                                      
			lblGuessesLeft02.setText("" + guessesLeft02);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track02.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track02.quickSort(0, track02.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track02.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track02.getModeNumber());	                                    //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft03 += 11;                                                                            //Stores the track guesses left.                                                      
			lblGuessesLeft03.setText("" + guessesLeft03);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track03.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track03.quickSort(0, track03.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track03.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track03.getModeNumber()); 	                                //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft04 += 11;                                                                            //Stores the track guesses left.                                                      
			lblGuessesLeft04.setText("" + guessesLeft04);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track04.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track04.quickSort(0, track04.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track04.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track04.getModeNumber()); 	                                //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft05 += 11;                                                                            //Stores the track guesses left.                                                      
			lblGuessesLeft05.setText("" + guessesLeft05);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track05.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track05.quickSort(0, track05.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track05.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track05.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft06 += 11;                                                                            //Stores the track guesses left.                                                      
			lblGuessesLeft06.setText("" + guessesLeft06);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track06.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track06.quickSort(0, track06.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track06.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track06.getModeNumber()); 	                                //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
																											
			guessesLeft07 += 11;                                                                            //Stores the track guesses left.                                                      
			lblGuessesLeft07.setText("" + guessesLeft07);                                                   //Sets the track guesses left on a label.                                             
			do {					                                                                                                                                                              
				track07.populateArrayList(range);				                                            //Populates the dynamic array with a dynamic range.                                   
				track07.quickSort(0, track07.getNumberList().size() - 1);                                   //Sorts the dynamic array starting from 0 to 999.                                     
				countModes = track07.statisticalMode(range);                                                //Call the statistical mode method with a dynamic range and stores into a variable.   
//				System.out.println("Mode: " + track07.getModeNumber());                                     //Displays the modes on console (DEBUG ONLY).                                         
			}while (countModes > 1);                                                                        //Loops if there is more than one mode.                                               
//			System.out.println("Number above is correct.");                                                 //Displays a line on console (DEBUG ONLY) that indicates the correct number.          
//			System.out.println("***************************");                                              
		}
		}
	}

	private void initialize() {                                                                         
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void initialize()
		//
		// Method parameters	:	none
		//
		// Method return		:	none
		//
		// Synopsis				:   This method initialize all the components.							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=																								//
		setBounds(480, 100, 980, 780);                                                                  	//Sets the bounds and position.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                     //Sets the exit (DEBUG ONLY).
																											
		//INITIAL MENU *******************************************************************************************************************************************		                    
		contentPane = new JPanel();                                                                         //Instantiates content pane.
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));                            					    //Sets borders.
		contentPane.setLayout(new BorderLayout(0, 0));                                                      //Sets layout.
																											
		setContentPane(contentPane);                                                                        //Sets the content pane properly.
																											
		if(subLevel > 1) {                                                                                 	//Verifies if sub level is greater the 1 to load game state properly.
			gameState(level);		                                                                        //Loads the game state saved.
		}else {                                                                                             //else
			ldpMenuPane = new JLayeredPane();                                              				    //Loads the menu layer.
			contentPane.add(ldpMenuPane, BorderLayout.CENTER);                                         	    //Add menu to the content pane.
		}                                                                                                   
																											
		lblInstructions = new JLabel("INSTRUCTIONS:");                                                      //Instantiates a label with instructions.
		lblInstructions.setFont(new Font("Tahoma", Font.BOLD, 18));                                         //Sets the font.
		lblInstructions.setHorizontalAlignment(SwingConstants.LEFT);                                        //Sets the horizontal alignment.
		lblInstructions.setBounds(155, 481, 174, 40);                                                       //Sets the bounds and position.
		ldpMenuPane.add(lblInstructions, JLayeredPane.DEFAULT_LAYER);  									    //Add the label into the menu layer.
																											
		lblUp = new JLabel(" Up arrow means the guess was too high.");                                      //Instantiates a label with instructions.
		lblUp.setBounds(443, 416, 350, 40);                                                                 //Sets the font.                         
		lblUp.setHorizontalAlignment(JButton.LEFT);                                                         //Sets the horizontal alignment.         
		lblUp.setIcon(up);                                                                                  //Sets the bounds and position.          
		ldpMenuPane.add(lblUp);                                                                             //Add the label into the menu layer.     
																											
		lblDown = new JLabel(" Down arrow means the guess was too low.");                                   //Instantiates a label with instructions.
		lblDown.setBounds(443, 484, 350, 40);		                                                        //Sets the font.                         
		lblDown.setHorizontalAlignment(JButton.LEFT);                                                       //Sets the horizontal alignment.         
		lblDown.setIcon(down);                                                                              //Sets the bounds and position.          
		ldpMenuPane.add(lblDown);                                                                           //Add the label into the menu layer.     
																											
		lblCorrect = new JLabel(" Check means the guess was correct.");                                     //Instantiates a label with instructions.
		lblCorrect.setBounds(443, 550, 350, 40);                                                            //Sets the font.                         
		lblCorrect.setHorizontalAlignment(JButton.LEFT);                                                    //Sets the horizontal alignment.         
		lblCorrect.setIcon(correct);                                                                        //Sets the bounds and position.          
		ldpMenuPane.add(lblCorrect);                                                                        //Add the label into the menu layer.     
																											
		lblWrong = new JLabel(" X means no appropriate guess.");                                            //Instantiates a label with instructions.
		lblWrong.setBounds(443, 613, 350, 40);                                                              //Sets the font.                         
		lblWrong.setHorizontalAlignment(JButton.LEFT);                                                      //Sets the horizontal alignment.         
		lblWrong.setIcon(wrong);                                                                            //Sets the bounds and position.          
		ldpMenuPane.add(lblWrong);                                                                          //Add the label into the menu layer.     
																											
		//LOAD ALL GAME COMPONENTS ******************************************************************************************************************************                         
		ldpGamePane = new JLayeredPane();                                                                   //Instantiates the game layer.
																											
		track01 = new Game();                                                                               //Instantiates the game object for one track. 
		track02 = new Game();                                                                               //Instantiates the game object for one track.
		track03 = new Game();                                                                               //Instantiates the game object for one track.
		track04 = new Game();	                                                                            //Instantiates the game object for one track.
		track05 = new Game();                                                                               //Instantiates the game object for one track.
		track06 = new Game();                                                                               //Instantiates the game object for one track.
		track07 = new Game();                                                                               //Instantiates the game object for one track.
																											
		lblGuessesTrack01 = new JLabel("Guesses left");                                                     //Instantiates a label for one track guesses left title.
		lblGuessesTrack01.setFont(new Font("Tahoma", Font.BOLD, 12));                                       //Sets the font.
		lblGuessesTrack01.setBounds(50, 11, 80, 14);                                                        //Sets the bounds and position.
		ldpGamePane.add(lblGuessesTrack01);                                                                 //Add the label into the game layer.
																											
		lblGuessesTrack02 = new JLabel("Guesses left");                                                     //Instantiates a label for one track guesses left title. 
		lblGuessesTrack02.setFont(new Font("Tahoma", Font.BOLD, 12));                                       //Sets the font.                                         
		lblGuessesTrack02.setBounds(183, 12, 80, 14);                                                       //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesTrack02);                                                                 //Add the label into the game layer.                     
																											
		lblGuessesTrack03 = new JLabel("Guesses left");                                                     //Instantiates a label for one track guesses left title. 
		lblGuessesTrack03.setFont(new Font("Tahoma", Font.BOLD, 12));                                       //Sets the font.                                         
		lblGuessesTrack03.setBounds(314, 12, 80, 14);                                                       //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesTrack03);                                                                 //Add the label into the game layer.                     
																											
		lblGuessesTrack04 = new JLabel("Guesses left");                                                     //Instantiates a label for one track guesses left title. 
		lblGuessesTrack04.setFont(new Font("Tahoma", Font.BOLD, 12));                                       //Sets the font.                                         
		lblGuessesTrack04.setBounds(445, 12, 80, 14);                                                       //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesTrack04);                                                                 //Add the label into the game layer.                     
																											
		lblGuessesTrack05 = new JLabel("Guesses left");                                                     //Instantiates a label for one track guesses left title. 
		lblGuessesTrack05.setFont(new Font("Tahoma", Font.BOLD, 12));                                       //Sets the font.                                         
		lblGuessesTrack05.setBounds(575, 12, 80, 14);                                                       //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesTrack05);                                                                 //Add the label into the game layer.                     
																											
		lblGuessesTrack06 = new JLabel("Guesses left");                                                     //Instantiates a label for one track guesses left title. 
		lblGuessesTrack06.setFont(new Font("Tahoma", Font.BOLD, 12));                                       //Sets the font.                                         
		lblGuessesTrack06.setBounds(707, 12, 80, 14);                                                       //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesTrack06);                                                                 //Add the label into the game layer.                     
																											
		lblGuessesTrack07 = new JLabel("Guesses left");                                                     //Instantiates a label for one track guesses left title. 
		lblGuessesTrack07.setFont(new Font("Tahoma", Font.BOLD, 12));                                       //Sets the font.                                         
		lblGuessesTrack07.setBounds(834, 12, 80, 14);                                                       //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesTrack07);                                                                 //Add the label into the game layer.                     
																											
		lblGuessesLeft01 = new JLabel("");                                                                  //Instantiates a label for one track guesses left title. 
		lblGuessesLeft01.setFont(new Font("Tahoma", Font.BOLD, 18));                                        //Sets the font.                                         
		lblGuessesLeft01.setBounds(78, 36, 52, 34);                                                         //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesLeft01);                                                                  //Add the label into the game layer.                     
																											
		lblGuessesLeft02 = new JLabel("");                                                                  //Instantiates a label for one track guesses left title. 
		lblGuessesLeft02.setFont(new Font("Tahoma", Font.BOLD, 18));                                        //Sets the font.                                         
		lblGuessesLeft02.setBounds(211, 37, 52, 34);                                                        //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesLeft02);                                                                  //Add the label into the game layer.                     
																											
		lblGuessesLeft03 = new JLabel("");                                                                  //Instantiates a label for one track guesses left title. 
		lblGuessesLeft03.setFont(new Font("Tahoma", Font.BOLD, 18));                                        //Sets the font.                                         
		lblGuessesLeft03.setBounds(342, 37, 52, 34);                                                        //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesLeft03);                                                                  //Add the label into the game layer.                     
																											
		lblGuessesLeft04 = new JLabel("");                                                                  //Instantiates a label for one track guesses left title. 
		lblGuessesLeft04.setFont(new Font("Tahoma", Font.BOLD, 18));                                        //Sets the font.                                         
		lblGuessesLeft04.setBounds(473, 37, 52, 34);                                                        //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesLeft04);                                                                  //Add the label into the game layer.                     
																											
		lblGuessesLeft05 = new JLabel("");                                                                  //Instantiates a label for one track guesses left title. 
		lblGuessesLeft05.setFont(new Font("Tahoma", Font.BOLD, 18));                                        //Sets the font.                                         
		lblGuessesLeft05.setBounds(603, 37, 52, 34);                                                        //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesLeft05);                                                                  //Add the label into the game layer.                     
																											
		lblGuessesLeft06 = new JLabel("");                                                                  //Instantiates a label for one track guesses left title. 
		lblGuessesLeft06.setFont(new Font("Tahoma", Font.BOLD, 18));                                        //Sets the font.                                         
		lblGuessesLeft06.setBounds(735, 37, 52, 34);                                                        //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesLeft06);                                                                  //Add the label into the game layer.                     
																											
		lblGuessesLeft07 = new JLabel("");                                                                  //Instantiates a label for one track guesses left title. 
		lblGuessesLeft07.setFont(new Font("Tahoma", Font.BOLD, 18));                                        //Sets the font.                                         
		lblGuessesLeft07.setBounds(862, 37, 52, 34);                                                        //Sets the bounds and position.                          
		ldpGamePane.add(lblGuessesLeft07);                                                                  //Add the label into the game layer.                     
																											
		lHistory01 = new JList<String>(guessList01);                                                        //Instantiates a list model for one track.
		lHistory01.setVisibleRowCount(5);                                                                   //Sets the visible rows limit.
		lHistory01.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));                 //Sets the borders.
		lHistory01.setFont(new Font("Tahoma", Font.BOLD, 20));                                              //Sets the font.
		lHistory01.setBounds(50, 92, 80, 220);		                                                        //Sets the bounds and position.
		ldpGamePane.add(lHistory01);                                                                        //
																											
		lHistory02 = new JList<String>(guessList02);                                                        //Instantiates a list model for one track.
		lHistory02.setVisibleRowCount(5);                                                                   //Sets the visible rows limit.
		lHistory02.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));                 //Sets the borders.
		lHistory02.setFont(new Font("Tahoma", Font.BOLD, 20));                                              //Sets the font.
		lHistory02.setBounds(182, 92, 80, 220);		                                                        //Sets the bounds and position.
		ldpGamePane.add(lHistory02);                                                                        //Add the list model into the game layer.
																											
		lHistory03 = new JList<String>(guessList02);                                                        //Instantiates a list model for one track.
		lHistory03.setVisibleRowCount(5);                                                                   //Sets the visible rows limit.
		lHistory03.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));                 //Sets the borders.
		lHistory03.setFont(new Font("Tahoma", Font.BOLD, 20));                                              //Sets the font.
		lHistory03.setBounds(314, 92, 80, 220);		                                                        //Sets the bounds and position.
		ldpGamePane.add(lHistory03);                                                                        //Add the list model into the game layer.
																											
		lHistory04 = new JList<String>(guessList04);                                                        //Instantiates a list model for one track.
		lHistory04.setVisibleRowCount(5);                                                                   //Sets the visible rows limit.
		lHistory04.setFont(new Font("Tahoma", Font.BOLD, 20));                                              //Sets the borders.
		lHistory04.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));                 //Sets the font.
		lHistory04.setBounds(445, 92, 80, 220);                                                             //Sets the bounds and position.
		ldpGamePane.add(lHistory04);                                                                        //Add the list model into the game layer.
																											
		lHistory05 = new JList<String>(guessList05);                                                        //Instantiates a list model for one track.
		lHistory05.setVisibleRowCount(5);                                                                   //Sets the visible rows limit.
		lHistory05.setFont(new Font("Tahoma", Font.BOLD, 20));                                              //Sets the borders.
		lHistory05.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));                 //Sets the font.
		lHistory05.setBounds(575, 92, 80, 220);                                                             //Sets the bounds and position.
		ldpGamePane.add(lHistory05);                                                                        //Add the list model into the game layer.
																											
		lHistory06 = new JList<String>(guessList06);                                                        //Instantiates a list model for one track.
		lHistory06.setVisibleRowCount(5);                                                                   //Sets the visible rows limit.
		lHistory06.setFont(new Font("Tahoma", Font.BOLD, 20));                                              //Sets the borders.
		lHistory06.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));                 //Sets the font.
		lHistory06.setBounds(707, 92, 80, 220);                                                             //Sets the bounds and position.
		ldpGamePane.add(lHistory06);                                                                        //Add the list model into the game layer.
																											
		lHistory07 = new JList<String>(guessList07);                                                        //Instantiates a list model for one track.
		lHistory07.setVisibleRowCount(5);                                                                   //Sets the visible rows limit.
		lHistory07.setFont(new Font("Tahoma", Font.BOLD, 20));                                              //Sets the borders.
		lHistory07.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));                 //Sets the font.
		lHistory07.setBounds(834, 92, 80, 220);                                                             //Sets the bounds and position.
		ldpGamePane.add(lHistory07);                                                                        //Add the list model into the game layer.
																											
		btnIcon01 = new JButton("");		                                                                //Instantiates a button to use a image icon (up or down) for one track.
		btnIcon01.setBounds(50, 324, 40, 40);                                                               //Sets the bounds and position.
		btnIcon01.setOpaque(false);                                                                         //Removes the opaque appearance.
		btnIcon01.setContentAreaFilled(false);                                                              //Removes paint from the inner area of the button.
		btnIcon01.setBorderPainted(false);		                                                            //Removes paint from the border area of the button.
		ldpGamePane.add(btnIcon01);                                                                         //Add the button into the game layer.
																											
		btnIcon01_1 = new JButton("");		                                                                //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon01_1.setBounds(90, 324, 40, 40);                                                             //Sets the bounds and position.                                         
		btnIcon01_1.setOpaque(false);                                                                       //Removes the opaque appearance.                                        
		btnIcon01_1.setContentAreaFilled(false);                                                            //Removes paint from the inner area of the button.                      
		btnIcon01_1.setBorderPainted(false);		                                                        //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon01_1);                                                                       //Add the button into the game layer.                                   
																											
		btnIcon02 = new JButton("");                                                                        //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon02.setBounds(183, 323, 40, 40);                                                              //Sets the bounds and position.                                         
		btnIcon02.setOpaque(false);                                                                         //Removes the opaque appearance.                                        
		btnIcon02.setContentAreaFilled(false);                                                              //Removes paint from the inner area of the button.                      
		btnIcon02.setBorderPainted(false);                                                                  //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon02);                                                                         //Add the button into the game layer.                                   
																											
		btnIcon02_1 = new JButton("");                                                                      //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon02_1.setBounds(223, 323, 40, 40);                                                            //Sets the bounds and position.                                         
		btnIcon02_1.setOpaque(false);                                                                       //Removes the opaque appearance.                                        
		btnIcon02_1.setContentAreaFilled(false);                                                            //Removes paint from the inner area of the button.                      
		btnIcon02_1.setBorderPainted(false);                                                                //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon02_1);                                                                       //Add the button into the game layer.                                   
																											
		btnIcon03 = new JButton("");                                                                        //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon03.setBounds(314, 323, 40, 40);                                                              //Sets the bounds and position.                                         
		btnIcon03.setOpaque(false);                                                                         //Removes the opaque appearance.                                        
		btnIcon03.setContentAreaFilled(false);                                                              //Removes paint from the inner area of the button.                      
		btnIcon03.setBorderPainted(false);                                                                  //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon03);                                                                         //Add the button into the game layer.                                   
																											
		btnIcon03_1 = new JButton("");                                                                      //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon03_1.setBounds(354, 323, 40, 40);                                                            //Sets the bounds and position.                                         
		btnIcon03_1.setOpaque(false);                                                                       //Removes the opaque appearance.                                        
		btnIcon03_1.setContentAreaFilled(false);                                                            //Removes paint from the inner area of the button.                      
		btnIcon03_1.setBorderPainted(false);                                                                //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon03_1);                                                                       //Add the button into the game layer.                                   
																											
		btnIcon04 = new JButton("");                                                                        //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon04.setOpaque(false);                                                                         //Sets the bounds and position.                                         
		btnIcon04.setContentAreaFilled(false);                                                              //Removes the opaque appearance.                                        
		btnIcon04.setBorderPainted(false);                                                                  //Removes paint from the inner area of the button.                      
		btnIcon04.setBounds(445, 324, 40, 40);                                                              //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon04);                                                                         //Add the button into the game layer.                                   
																											
		btnIcon04_1 = new JButton("");                                                                      //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon04_1.setOpaque(false);                                                                       //Sets the bounds and position.                                         
		btnIcon04_1.setContentAreaFilled(false);                                                            //Removes the opaque appearance.                                        
		btnIcon04_1.setBorderPainted(false);                                                                //Removes paint from the inner area of the button.                      
		btnIcon04_1.setBounds(485, 324, 40, 40);                                                            //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon04_1);                                                                       //Add the button into the game layer.                                   
																											
		btnIcon05 = new JButton("");                                                                        //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon05.setOpaque(false);                                                                         //Sets the bounds and position.                                         
		btnIcon05.setContentAreaFilled(false);                                                              //Removes the opaque appearance.                                        
		btnIcon05.setBorderPainted(false);                                                                  //Removes paint from the inner area of the button.                      
		btnIcon05.setBounds(575, 324, 40, 40);                                                              //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon05);                                                                         //Add the button into the game layer.                                   
																											
		btnIcon05_1 = new JButton("");                                                                      //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon05_1.setOpaque(false);                                                                       //Sets the bounds and position.                                         
		btnIcon05_1.setContentAreaFilled(false);                                                            //Removes the opaque appearance.                                        
		btnIcon05_1.setBorderPainted(false);                                                                //Removes paint from the inner area of the button.                      
		btnIcon05_1.setBounds(615, 324, 40, 40);                                                            //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon05_1);                                                                       //Add the button into the game layer.                                   
																											
		btnIcon06 = new JButton("");                                                                        //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon06.setOpaque(false);                                                                         //Sets the bounds and position.                                         
		btnIcon06.setContentAreaFilled(false);                                                              //Removes the opaque appearance.                                        
		btnIcon06.setBorderPainted(false);                                                                  //Removes paint from the inner area of the button.                      
		btnIcon06.setBounds(707, 324, 40, 40);                                                              //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon06);                                                                         //Add the button into the game layer.                                   
																											
		btnIcon06_1 = new JButton("");                                                                      //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon06_1.setOpaque(false);                                                                       //Sets the bounds and position.                                         
		btnIcon06_1.setContentAreaFilled(false);                                                            //Removes the opaque appearance.                                        
		btnIcon06_1.setBorderPainted(false);                                                                //Removes paint from the inner area of the button.                      
		btnIcon06_1.setBounds(747, 324, 40, 40);                                                            //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon06_1);                                                                       //Add the button into the game layer.                                   
																											
		btnIcon07 = new JButton("");                                                                        //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon07.setOpaque(false);                                                                         //Sets the bounds and position.                                         
		btnIcon07.setContentAreaFilled(false);                                                              //Removes the opaque appearance.                                        
		btnIcon07.setBorderPainted(false);                                                                  //Removes paint from the inner area of the button.                      
		btnIcon07.setBounds(834, 324, 40, 40);                                                              //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon07);                                                                         //Add the button into the game layer.                                   
																											
		btnIcon07_1 = new JButton("");                                                                      //Instantiates a button to use a image icon (up or down) for one track. 
		btnIcon07_1.setOpaque(false);                                                                       //Sets the bounds and position.                                         
		btnIcon07_1.setContentAreaFilled(false);                                                            //Removes the opaque appearance.                                        
		btnIcon07_1.setBorderPainted(false);                                                                //Removes paint from the inner area of the button.                      
		btnIcon07_1.setBounds(874, 324, 40, 40);                                                            //Removes paint from the border area of the button.                     
		ldpGamePane.add(btnIcon07_1);                                                                       //Add the button into the game layer.                                   
																											
		txtGuessNumber01 = new JTextField();                                                                //Instantiates a input text field to guess one track.
		txtGuessNumber01.setHorizontalAlignment(SwingConstants.CENTER);                                     //Sets the horizontal alignment to the center.
		txtGuessNumber01.setFont(new Font("Tahoma", Font.BOLD, 20));                                        //Sets the font.
		txtGuessNumber01.setColumns(10);                                                                    //Sets the number of the columns to display.
		txtGuessNumber01.setBounds(50, 375, 80, 40);                                                        //Sets the bounds and position.
		ldpGamePane.add(txtGuessNumber01);                                                                  //Add the text field into the game layer.
																											
		txtGuessNumber02 = new JTextField();                                                                //Instantiates a input text field to guess one track.
		txtGuessNumber02.setHorizontalAlignment(SwingConstants.CENTER);                                     //Sets the horizontal alignment to the center.
		txtGuessNumber02.setFont(new Font("Tahoma", Font.BOLD, 20));                                        //Sets the font.
		txtGuessNumber02.setColumns(10);                                                                    //Sets the number of the columns to display.
		txtGuessNumber02.setBounds(182, 375, 80, 40);                                                       //Sets the bounds and position. 
		ldpGamePane.add(txtGuessNumber02);                                                                  //Add the text field into the game layer.
																											
		txtGuessNumber03 = new JTextField();                                                                //Instantiates a input text field to guess one track.
		txtGuessNumber03.setHorizontalAlignment(SwingConstants.CENTER);                                     //Sets the horizontal alignment to the center.
		txtGuessNumber03.setFont(new Font("Tahoma", Font.BOLD, 20));                                        //Sets the font.
		txtGuessNumber03.setColumns(10);                                                                    //Sets the number of the columns to display.
		txtGuessNumber03.setBounds(314, 375, 80, 40);                                                       //Sets the bounds and position.
		ldpGamePane.add(txtGuessNumber03);                                                                  //Add the text field into the game layer.
																											
		txtGuessNumber04 = new JTextField();                                                                //Instantiates a input text field to guess one track.
		txtGuessNumber04.setHorizontalAlignment(SwingConstants.CENTER);                                     //Sets the horizontal alignment to the center.
		txtGuessNumber04.setFont(new Font("Tahoma", Font.BOLD, 20));                                        //Sets the font.
		txtGuessNumber04.setColumns(10);                                                                    //Sets the number of the columns to display.
		txtGuessNumber04.setBounds(445, 375, 80, 40);                                                       //Sets the bounds and position.
		ldpGamePane.add(txtGuessNumber04);                                                                  //Add the text field into the game layer.
																											
		txtGuessNumber05 = new JTextField();                                                                //Instantiates a input text field to guess one track.
		txtGuessNumber05.setHorizontalAlignment(SwingConstants.CENTER);                                     //Sets the horizontal alignment to the center.
		txtGuessNumber05.setFont(new Font("Tahoma", Font.BOLD, 20));                                        //Sets the font.
		txtGuessNumber05.setColumns(10);                                                                    //Sets the number of the columns to display.
		txtGuessNumber05.setBounds(575, 375, 80, 40);                                                       //Sets the bounds and position.
		ldpGamePane.add(txtGuessNumber05);                                                                  //Add the text field into the game layer.
																											
		txtGuessNumber06 = new JTextField();                                                                //Instantiates a input text field to guess one track.
		txtGuessNumber06.setHorizontalAlignment(SwingConstants.CENTER);                                     //Sets the horizontal alignment to the center.
		txtGuessNumber06.setFont(new Font("Tahoma", Font.BOLD, 20));                                        //Sets the font.
		txtGuessNumber06.setColumns(10);                                                                    //Sets the number of the columns to display.
		txtGuessNumber06.setBounds(707, 375, 80, 40);                                                       //Sets the bounds and position.
		ldpGamePane.add(txtGuessNumber06);                                                                  //Add the text field into the game layer.
																											
		txtGuessNumber07 = new JTextField();                                                                //Instantiates a input text field to guess one track.
		txtGuessNumber07.setHorizontalAlignment(SwingConstants.CENTER);                                     //Sets the horizontal alignment to the center.
		txtGuessNumber07.setFont(new Font("Tahoma", Font.BOLD, 20));                                        //Sets the font.
		txtGuessNumber07.setColumns(10);                                                                    //Sets the number of the columns to display.
		txtGuessNumber07.setBounds(834, 375, 80, 40);                                                       //Sets the bounds and position.
		ldpGamePane.add(txtGuessNumber07);                                                                  //Add the text field into the game layer.
																											
		lblScoreTitle = new JLabel("Score:");                                                               //Instantiates a label for score title. 
		lblScoreTitle.setFont(new Font("Tahoma", Font.BOLD, 16));                                           //Sets the font.                                         
		lblScoreTitle.setBounds(50, 637, 63, 20);                                                           //Sets the bounds and position.                          
		ldpGamePane.add(lblScoreTitle);                                                                     //Add the label into the game layer.                     
																											
		lblLevelTitle = new JLabel("Level:");                                                               //Instantiates a label for score title. 
		lblLevelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));                                           //Sets the font.                        
		lblLevelTitle.setBounds(50, 668, 63, 20);                                                           //Sets the bounds and position.         
		ldpGamePane.add(lblLevelTitle);                                                                     //Add the label into the game layer.    
																											
		lblScore = new JLabel("");                                                                          //Instantiates a label for score. 
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 16));                                                //Sets the font.                        
		lblScore.setBounds(123, 637, 63, 20);                                                               //Sets the bounds and position.         
		ldpGamePane.add(lblScore);                                                                          //Add the label into the game layer.    
																											
		lblLevel = new JLabel("");                                                                          //Instantiates a label for sub level. 
		lblLevel.setFont(new Font("Tahoma", Font.BOLD, 16));                                                //Sets the font.                        
		lblLevel.setBounds(123, 668, 63, 20);                                                               //Sets the bounds and position.         
		ldpGamePane.add(lblLevel);                                                                          //Add the label into the game layer.    
																											
		lblRange = new JLabel("");                                                                          //Instantiates a label for range. 
		lblRange.setFont(new Font("Tahoma", Font.BOLD, 16));                                                //Sets the font.                        
		lblRange.setBounds(410, 637, 148, 20);                                                              //Sets the bounds and position.         
		ldpGamePane.add(lblRange);                                                                          //Add the label into the game layer.    
																											
		lblDifficulty = new JLabel("");                                                        			    //Instantiates a label for level. 
		lblDifficulty.setFont(new Font("Tahoma", Font.BOLD, 16));                                           //Sets the font.                        
		lblDifficulty.setBounds(410, 668, 148, 20);                                                         //Sets the bounds and position.         
		ldpGamePane.add(lblDifficulty);                                                                     //Add the label into the game layer.    
																											
		//LOAD BUTTONS ******************************************************************************************************************************************                                
		btnEasy = new JButton("EASY");                                                                      //Instantiates a button for level.
		btnEasy.setFont(new Font("Tahoma", Font.BOLD, 14));                                                 //Sets the font.
		btnEasy.addActionListener(new ActionListener() {                                                    //Add a listener into the button.
			public void actionPerformed(ActionEvent e) {                                                    //Call action performed method.
				level = GameState.EASY;                                                                     //Sets the game state.
				range = subLevel * 10;                                                                      //Sets the range.
				gameState(level);                                                               		    //Loads the level.
			}                                                                                               
		});                                                                                                 
		btnEasy.setBounds(126, 30, 667, 60);                                                                //Sets the bounds and position.
		ldpMenuPane.add(btnEasy);                                                                           //Add the button into the layer.
																											
		btnModerate = new JButton("MODERATE");                                                              //Instantiates a button for level.   
		btnModerate.setFont(new Font("Tahoma", Font.BOLD, 14));                                             //Sets the font.                     
		btnModerate.addActionListener(new ActionListener() {                                                //Add a listener into the button.    
			public void actionPerformed(ActionEvent e) {                                                    //Call action performed method.      
				level = GameState.MODERATE;                                                                 //Sets the game state.               
				range = subLevel * 100;                                                                     //Sets the range.                    
				gameState(level);                                                                           //Loads the level.                   
			}                                                                                                                                    
		});                                                                                                                                      
		btnModerate.setBounds(126, 123, 667, 60);                                                           //Sets the bounds and position.      
		ldpMenuPane.add(btnModerate);                                                                       //Add the button into the layer.     
																											
		btnDifficult = new JButton("DIFFICULT");                                                            //Instantiates a button for level.   
		btnDifficult.setFont(new Font("Tahoma", Font.BOLD, 14));                                            //Sets the font.                     
		btnDifficult.addActionListener(new ActionListener() {                                               //Add a listener into the button.    
			public void actionPerformed(ActionEvent e) {                                                    //Call action performed method.      
				level = GameState.DIFFICULT;                                                                //Sets the game state.               
				range = subLevel * 1000;                                                                    //Sets the range.                    
				gameState(level);                                                                           //Loads the level.                   
			}                                                                                                                                    
		});                                                                                                                                      
		btnDifficult.setBounds(126, 213, 667, 60);                                                          //Sets the bounds and position.      
		ldpMenuPane.add(btnDifficult);                                                                      //Add the button into the layer.     
																											
		btnExit = new JButton("EXIT");                                                                      //Instantiates a button to exit.
		btnExit.addActionListener(new ActionListener() {                                                    //Add a listener into the button.
			public void actionPerformed(ActionEvent e) {                                                    //Call action performed method.
				save.inputFile(initials);                                                                   //Saves the file.
				System.exit(0);                                                                             //Exits the application.
			}                                                                                               
		});                                                                                                 
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));                                                 //Sets the font.
		btnExit.setBounds(126, 304, 667, 60);                                                               //Sets the bounds and position.
		ldpMenuPane.add(btnExit);                                                                       	//Add the button into the layer.				
																											
		btnSubmit = new JButton("SUBMIT");                                                                  //Instantiates a button to submit guesses.
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));                                               //Sets the font.
		btnSubmit.addActionListener(new ActionListener() {                                                  //Add a listener into the button.
			public void actionPerformed(ActionEvent e) {				                                    //Call action performed method.
				counterBonus = 0;                                                                           //Sets zero to the bonus counter to restart on each round.
				switch (level) {                                                                            //Switch to verify the level.
				case DIFFICULT: {                                                                           
					if(track07.guessNumberValidation(txtGuessNumber07.getText())) {                         //Inputs and verifies if the guess is a number.
						guessList07.add(0, txtGuessNumber07.getText());                                 	//Add the number into the list.
						track07.setGuessNumber(txtGuessNumber07.getText());                                 //Stores the guess into the attribute.
						lHistory07.setModel(guessList07);                                                   //Updates the list into the list model.
						txtGuessNumber07.setText(null);					                                    //Clear the guess text field.
						int mode07 = track07.getModeNumber();			                                    //Declares and sets the mode number.
						                                                                                  
						if(track07.getGuessNumber() > mode07) {                                             //Verifies if the guess is greater than the mode number. 
							btnIcon07.setVisible(true);														//Sets the button visible (up or down).
							btnIcon07_1.setVisible(true);													//Sets the button visible (wrong or right).
							btnIcon07.setIcon(up);                                                          //Sets image icon up.
							btnIcon07_1.setIcon(wrong);                                                     //Sets image icon wrong.
							lblGuessesLeft07.setText("" + deductGuesses(7));                                //Deduct guesses left and sets on text field.
						}else if(track07.getGuessNumber() < mode07){                                        //else verifies if the guess is lesser than the mode number. 
							btnIcon07.setVisible(true);														//Sets the button visible (up or down).         
							btnIcon07_1.setVisible(true);													//Sets the button visible (wrong or right).     
							btnIcon07.setIcon(down);                                                        //Sets image icon down.                           
							btnIcon07_1.setIcon(wrong);                                                     //Sets image icon wrong.                        
							lblGuessesLeft07.setText("" + deductGuesses(7));                                //Deduct guesses left and sets on text field.   
						}else {                                                                             //else
							btnIcon07.setIcon(correct);						                                //Sets image icon right.
							btnIcon07_1.setVisible(false);                                                  //Sets the button to invisible.
							txtGuessNumber07.setVisible(false);							                    //Sets the guess text field to invisible.
							save.setPoints(save.getPoints()                                                 //Stores the points.
									+ (10 * Integer.parseInt(lblGuessesLeft07.getText())));                 
							lblScore.setText("" + save.getPoints());                                        //Sets the points into the label.
							counterBonus++;                                                                 //Add bonus counter.
						}                                                                                   
					}else {                                                                                 //else
						if(txtGuessNumber07.isVisible()) {                                                  //Verifies if guess text field is visible.
							btnIcon07.setIcon(wrong);						                                //Sets image icon wrong.
						}                                                                                   
					}                                                                                       
					if(track06.guessNumberValidation(txtGuessNumber06.getText())) {                         //Inputs and verifies if the guess is a number.              
						guessList06.add(0, txtGuessNumber06.getText());                                 	//Add the number into the list.                              
						track06.setGuessNumber(txtGuessNumber06.getText());                                 //Stores the guess into the attribute.                       
						lHistory06.setModel(guessList06);                                                   //Updates the list into the list model.                      
						txtGuessNumber06.setText(null);					                                    //Clear the guess text field.                                
						int mode06 = track06.getModeNumber();			                                    //Declares and sets the mode number.                         
						                                                                                                                                                 
						if(track06.getGuessNumber() > mode06) {                                             //Verifies if the guess is greater than the mode number.     
							btnIcon06.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon06_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon06.setIcon(up);                                                          //Sets image icon up.                                        
							btnIcon06_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft06.setText("" + deductGuesses(6));                                //Deduct guesses left and sets on text field.                
						}else if(track06.getGuessNumber() < mode06){                                        //else verifies if the guess is lesser than the mode number. 
							btnIcon06.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon06_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon06.setIcon(down);                                                        //Sets image icon down.                                      
							btnIcon06_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft06.setText("" + deductGuesses(6));                                //Deduct guesses left and sets on text field.                
						}else {                                                                             //else                                                       
							btnIcon06.setIcon(correct);						                                //Sets image icon right.                                     
							btnIcon06_1.setVisible(false);                                                  //Sets the button to invisible.                              
							txtGuessNumber06.setVisible(false);							                    //Sets the guess text field to invisible.                    
							save.setPoints(save.getPoints()                                                 //Stores the points.                                         
									+ (10 * Integer.parseInt(lblGuessesLeft06.getText())));                                                                              
							lblScore.setText("" + save.getPoints());                                        //Sets the points into the label.                            
							counterBonus++;                                                                 //Add bonus counter.                                         
						}                                                                                                                                                
					}else {                                                                                 //else                                                       
						if(txtGuessNumber06.isVisible()) {                                                  //Verifies if guess text field is visible.                   
							btnIcon06.setIcon(wrong);						                                //Sets image icon wrong.                                     
						}                                                                                   
					}					                                                                    
				}                                                                                           
				case MODERATE: {                                                                            
					if(track05.guessNumberValidation(txtGuessNumber05.getText())) {                         //Inputs and verifies if the guess is a number.              
						guessList05.add(0, txtGuessNumber05.getText());                                 	//Add the number into the list.                              
						track05.setGuessNumber(txtGuessNumber05.getText());                                 //Stores the guess into the attribute.                       
						lHistory05.setModel(guessList05);                                                   //Updates the list into the list model.                      
						txtGuessNumber05.setText(null);					                                    //Clear the guess text field.                                
						int mode05 = track05.getModeNumber();			                                    //Declares and sets the mode number.                         
						                                                                                                                                                 
						if(track05.getGuessNumber() > mode05) {                                             //Verifies if the guess is greater than the mode number.     
							btnIcon05.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon05_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon05.setIcon(up);                                                          //Sets image icon up.                                        
							btnIcon05_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft05.setText("" + deductGuesses(5));                                //Deduct guesses left and sets on text field.                
						}else if(track05.getGuessNumber() < mode05){                                        //else verifies if the guess is lesser than the mode number. 
							btnIcon05.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon05_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon05.setIcon(down);                                                        //Sets image icon down.                                      
							btnIcon05_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft05.setText("" + deductGuesses(5));                                //Deduct guesses left and sets on text field.                
						}else {                                                                             //else                                                       
							btnIcon05.setIcon(correct);						                                //Sets image icon right.                                     
							btnIcon05_1.setVisible(false);                                                  //Sets the button to invisible.                              
							txtGuessNumber05.setVisible(false);							                    //Sets the guess text field to invisible.                    
							save.setPoints(save.getPoints()                                                 //Stores the points.                                         
									+ (10 * Integer.parseInt(lblGuessesLeft05.getText())));                                                                              
							lblScore.setText("" + save.getPoints());                                        //Sets the points into the label.                            
							counterBonus++;                                                                 //Add bonus counter.                                         
						}                                                                                                                                                
					}else {                                                                                 //else                                                       
						if(txtGuessNumber05.isVisible()) {                                                  //Verifies if guess text field is visible.                   
							btnIcon05.setIcon(wrong);						                                //Sets image icon wrong.                                     
						}                                                                                   
					}                                                                                       
					if(track04.guessNumberValidation(txtGuessNumber04.getText())) {                         //Inputs and verifies if the guess is a number.              
						guessList04.add(0, txtGuessNumber04.getText());                                 	//Add the number into the list.                              
						track04.setGuessNumber(txtGuessNumber04.getText());                                 //Stores the guess into the attribute.                       
						lHistory04.setModel(guessList04);                                                   //Updates the list into the list model.                      
						txtGuessNumber04.setText(null);					                                    //Clear the guess text field.                                
						int mode04 = track04.getModeNumber();			                                    //Declares and sets the mode number.                         
						                                                                                                                                                 
						if(track04.getGuessNumber() > mode04) {                                             //Verifies if the guess is greater than the mode number.     
							btnIcon04.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon04_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon04.setIcon(up);                                                          //Sets image icon up.                                        
							btnIcon04_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft04.setText("" + deductGuesses(4));                                //Deduct guesses left and sets on text field.                
						}else if(track04.getGuessNumber() < mode04){                                        //else verifies if the guess is lesser than the mode number. 
							btnIcon04.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon04_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon04.setIcon(down);                                                        //Sets image icon down.                                      
							btnIcon04_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft04.setText("" + deductGuesses(4));                                //Deduct guesses left and sets on text field.                
						}else {                                                                             //else                                                       
							btnIcon04.setIcon(correct);						                                //Sets image icon right.                                     
							btnIcon04_1.setVisible(false);                                                  //Sets the button to invisible.                              
							txtGuessNumber04.setVisible(false);							                    //Sets the guess text field to invisible.                    
							save.setPoints(save.getPoints()                                                 //Stores the points.                                         
									+ (10 * Integer.parseInt(lblGuessesLeft04.getText())));                                                                              
							lblScore.setText("" + save.getPoints());                                        //Sets the points into the label.                            
							counterBonus++;                                                                 //Add bonus counter.                                         
						}                                                                                                                                                
					}else {                                                                                 //else                                                       
						if(txtGuessNumber04.isVisible()) {                                                  //Verifies if guess text field is visible.                   
							btnIcon04.setIcon(wrong);						                                //Sets image icon wrong.                                     
						}                                                                                   
					}                                                                                       
				}                                                                                           
				default:                                                                                    //default = EASY					
					if(track03.guessNumberValidation(txtGuessNumber03.getText())) {                         //Inputs and verifies if the guess is a number.              
						guessList03.add(0, txtGuessNumber03.getText());                                 	//Add the number into the list.                              
						track03.setGuessNumber(txtGuessNumber03.getText());                                 //Stores the guess into the attribute.                       
						lHistory03.setModel(guessList03);                                                   //Updates the list into the list model.                      
						txtGuessNumber03.setText(null);					                                    //Clear the guess text field.                                
						int mode03 = track03.getModeNumber();				                                //Declares and sets the mode number.                         
						                                                                                                                                                 
						if(track03.getGuessNumber() > mode03) {                                             //Verifies if the guess is greater than the mode number.     
							btnIcon03.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon03_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon03.setIcon(up);                                                          //Sets image icon up.                                        
							btnIcon03_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft03.setText("" + deductGuesses(3));                                //Deduct guesses left and sets on text field.                
						}else if(track03.getGuessNumber() < mode03){                                        //else verifies if the guess is lesser than the mode number. 
							btnIcon03.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon03_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon03.setIcon(down);                                                        //Sets image icon down.                                      
							btnIcon03_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft03.setText("" + deductGuesses(3));                                //Deduct guesses left and sets on text field.                
						}else {                                                                             //else                                                       
							btnIcon03.setIcon(correct);                                                     //Sets image icon right.                                     
							btnIcon03_1.setVisible(false);                                                  //Sets the button to invisible.                              
							txtGuessNumber03.setVisible(false);							                    //Sets the guess text field to invisible.                    
							save.setPoints(save.getPoints()                                                 //Stores the points.                                         
									+ (10 * Integer.parseInt(lblGuessesLeft03.getText())));                                                                              
							lblScore.setText("" + save.getPoints());                                        //Sets the points into the label.                            
							counterBonus++;                                                                 //Add bonus counter.                                         
						}                                                                                                                                                
					}else {                                                                                 //else                                                       
						if(txtGuessNumber03.isVisible()) {                                                  //Verifies if guess text field is visible.                   
							btnIcon03.setIcon(wrong);						                                //Sets image icon wrong.                                     
						}                                                                                   
					}                                                                                       
					if(track02.guessNumberValidation(txtGuessNumber02.getText())) {                         //Inputs and verifies if the guess is a number.              
						guessList02.add(0, txtGuessNumber02.getText());                                 	//Add the number into the list.                              
						track02.setGuessNumber(txtGuessNumber02.getText());                                 //Stores the guess into the attribute.                       
						lHistory02.setModel(guessList02);                                                   //Updates the list into the list model.                      
						txtGuessNumber02.setText(null);					                                    //Clear the guess text field.                                
						int mode02 = track02.getModeNumber();					                            //Declares and sets the mode number.                         
						                                                                                                                                                 
						if(track02.getGuessNumber() > mode02) {                                             //Verifies if the guess is greater than the mode number.     
							btnIcon02.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon02_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon02.setIcon(up);                                                          //Sets image icon up.                                        
							btnIcon02_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft02.setText("" + deductGuesses(2));                                //Deduct guesses left and sets on text field.                
						}else if(track02.getGuessNumber() < mode02){                                        //else verifies if the guess is lesser than the mode number. 
							btnIcon02.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon02_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon02.setIcon(down);                                                        //Sets image icon down.                                      
							btnIcon02_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft02.setText("" + deductGuesses(2));                                //Deduct guesses left and sets on text field.                
						}else {                                                                             //else                                                       
							btnIcon02.setIcon(correct);                                                     //Sets image icon right.                                     
							btnIcon02_1.setVisible(false);                                                  //Sets the button to invisible.                              
							txtGuessNumber02.setVisible(false);							                    //Sets the guess text field to invisible.                    
							save.setPoints(save.getPoints()                                                 //Stores the points.                                         
									+ (10 * Integer.parseInt(lblGuessesLeft02.getText())));                                                                              
							lblScore.setText("" + save.getPoints());                                        //Sets the points into the label.                            
							counterBonus++;                                                                 //Add bonus counter.                                         
						}                                                                                                                                                
					}else {                                                                                 //else                                                       
						if(txtGuessNumber02.isVisible()) {                                                  //Verifies if guess text field is visible.                   
							btnIcon02.setIcon(wrong);						                                //Sets image icon wrong.                                     
						}                                                                                   
					}                                                                                       
					if(track01.guessNumberValidation(txtGuessNumber01.getText())) {                         //Inputs and verifies if the guess is a number.              
						guessList01.add(0, txtGuessNumber01.getText());                                 	//Add the number into the list.                              
						track01.setGuessNumber(txtGuessNumber01.getText());                                 //Stores the guess into the attribute.                       
						lHistory01.setModel(guessList01);                                                   //Updates the list into the list model.                      
						txtGuessNumber01.setText(null);					                                    //Clear the guess text field.                                
						int mode01 = track01.getModeNumber();			                                    //Declares and sets the mode number.                         
						                                                                                                                                                 
						if(track01.getGuessNumber() > mode01) {                                             //Verifies if the guess is greater than the mode number.     
							btnIcon01.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon01_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon01.setIcon(up);                                                          //Sets image icon up.                                        
							btnIcon01_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft01.setText("" + deductGuesses(1));                                //Deduct guesses left and sets on text field.                
						}else if(track01.getGuessNumber() < mode01){                                        //else verifies if the guess is lesser than the mode number. 
							btnIcon01.setVisible(true);														//Sets the button visible (up or down).                      
							btnIcon01_1.setVisible(true);													//Sets the button visible (wrong or right).                  
							btnIcon01.setIcon(down);                                                        //Sets image icon down.                                      
							btnIcon01_1.setIcon(wrong);                                                     //Sets image icon wrong.                                     
							lblGuessesLeft01.setText("" + deductGuesses(1));                                //Deduct guesses left and sets on text field.                
						}else {                                                                             //else                                                       
							btnIcon01.setIcon(correct);						                                //Sets image icon right.                                     
							btnIcon01_1.setVisible(false);                                                  //Sets the button to invisible.                              
							txtGuessNumber01.setVisible(false);							                    //Sets the guess text field to invisible.                    
							save.setPoints(save.getPoints()                                                 //Stores the points.                                         
									+ (10 * Integer.parseInt(lblGuessesLeft01.getText())));                                                                              
							lblScore.setText("" + save.getPoints());                                        //Sets the points into the label.                            
							counterBonus++;                                                                 //Add bonus counter.                                         
						}                                                                                                                                                
					}else {                                                                                 //else                                                       
						if(txtGuessNumber01.isVisible()) {                                                  //Verifies if guess text field is visible.                   
							btnIcon01.setIcon(wrong);						                                //Sets image icon wrong.                                     
						}                                                                                   
					}                                                                                       
				}                                                                                           
				if(counterBonus >= 3) {		                                                                //Verifies if bonus counter is greater or equal to 3.
					save.setPoints(save.getPoints() + BONUS);                                               //Updates the points with the bonus.
					counterBonus = 0;                                                                       //Resets the bonus counter.
				}else {                                                                                     //else
					counterBonus = 0;                                                                       //Resets the bonus counter only.
				}                                                                                           
																											
				switch (level) {                                                                            //Switch for the level.
				case DIFFICULT: {                                                                           
					if(!txtGuessNumber01.isVisible() && guessesLeft01 > 0 &&                                //Verifies all the guess text fields and if the
							!txtGuessNumber02.isVisible() && guessesLeft02 > 0 &&                           //player still have guesses left. 
							!txtGuessNumber03.isVisible() && guessesLeft03 > 0 &&                           
							!txtGuessNumber04.isVisible() && guessesLeft04 > 0 &&                           
							!txtGuessNumber05.isVisible() && guessesLeft05 > 0 &&                           
							!txtGuessNumber06.isVisible() && guessesLeft06 > 0 &&                           
							!txtGuessNumber07.isVisible() && guessesLeft07 > 0) {                           
						subLevel++;                                                                         //Add a sub level.
						range = subLevel * 1000;                                                            //Updates the range.
						save.setSubLevel(subLevel);                                                         //Stores the new sub level.
						save.setGameState(2);																//Stores the level.
						JOptionPane.showMessageDialog(null, "You won! "                                     //Displays a message to player.
								+ "\nPress the OK button to go to the next level.");                        
						gameState(level);						                                            //Loads the level.
					}                                                                                       
				}                                                                                           
				break;                                                                                      
				case MODERATE: {                                                                            
					if(!txtGuessNumber01.isVisible() && guessesLeft01 > 0 &&                                //Verifies all the guess text fields and if the  
							!txtGuessNumber02.isVisible() && guessesLeft02 > 0 &&                           //player still have guesses left.                
							!txtGuessNumber03.isVisible() && guessesLeft03 > 0 &&                           
							!txtGuessNumber04.isVisible() && guessesLeft04 > 0 &&                           
							!txtGuessNumber05.isVisible() && guessesLeft05 > 0) {                           
						subLevel++;					                                                        //Add a sub level.     
						range = subLevel * 100;                                                             //Updates the range.   
						save.setSubLevel(subLevel);                                                         //Stores the new sub level.
						save.setGameState(1);																//Stores the level.
						JOptionPane.showMessageDialog(null, "You won! "                                     //Displays a message to player. 
								+ "\nPress the OK button to go to the next level.");                        
						if(subLevel == 10 && save.getGameState() == 1) {                                    //Verifies if the level is the last one and the game state.
							subLevel = 1;                                                                   //Resets the sub level.
							save.setSubLevel(subLevel);                                                     //Stores the sub level.
							level = GameState.DIFFICULT;                                                    //Sets a new level.
							save.setGameState(2);                                                           //Stores the new level.
							gameState(level);                                                               //Loads the new level.
						}else {                                                                             //else
							gameState(level);                                                               //Loads the same level again.
						}                                                                                   
					}                                                                                       
				}                                                                                           
				break;                                                                                      
				case EASY:{                                                                                 
					if(!txtGuessNumber01.isVisible() && guessesLeft01 > 0 &&                                //Verifies all the guess text fields and if the
							!txtGuessNumber02.isVisible() && guessesLeft02 > 0 &&                           //player still have guesses left.                
							!txtGuessNumber03.isVisible() && guessesLeft03 > 0) {                             
						subLevel++;				                                                            //Add a sub level.                                         
						range = subLevel * 10;                                                              //Updates the range.                                       
						save.setSubLevel(subLevel);                                                         //Stores the new sub level.
						save.setGameState(0);																//Stores the level.
						JOptionPane.showMessageDialog(null, "You won! "                                     //Displays a message to player.                            
								+ "\nPress the OK button to go to the next level.");                                                                                   
						if(subLevel == 10 && save.getGameState() == 0) {                                    //Verifies if the level is the last one and the game state.
							subLevel = 1;                                                                   //Resets the sub level.                                    
							save.setSubLevel(subLevel);                                                     //Stores the sub level.                                    
							level = GameState.MODERATE;                                                     //Sets a new level.                                        
							save.setGameState(1);                                                           //Stores the new level.                                    
							gameState(level);                                                               //Loads the new level.                                     
						}else {                                                                             //else                                                     
							gameState(level);                                                               //Loads the same level again.                              
						}                                                                                   
					}                                                                                       
				}                                                                                           
				}                                                                                           
				lblScore.setText("" + save.getPoints());                                                    //Sets the points into the text field.
				lblLevel.setText("" + save.getSubLevel());                                                  //Sets the sub level into the text field.
				lblRange.setText("Range: 1 - " + range);                                                    //Sets the range into the text field.
				txtGuessNumber01.requestFocus();                                                            //Put the focus on the first guess text field.
			}                                                                                               
		});                                                                                                 
		btnSubmit.setBounds(50, 441, 864, 60);                                                              //Sets the bounds and position.
		ldpGamePane.add(btnSubmit);                                                                         //Add the button into the game layer.
																											
		btnQuitGame = new JButton("QUIT GAME");                                                             //Instantiates a button to quit the game.   
		btnQuitGame.addActionListener(new ActionListener() {                                                //Add a listener into the button.  
			public void actionPerformed(ActionEvent e) {                                                    //Call action performed method.    
				save.inputFile(initials);                                                                   //Saves the file.                  
				System.exit(0);                                                                             //Exits the application.           
			}                                                                                               
		});                                                                                                 //Sets the font.                
		btnQuitGame.setFont(new Font("Tahoma", Font.BOLD, 14));                                             //Sets the bounds and position. 
		btnQuitGame.setBounds(50, 533, 864, 60);                                                            //Add the button into the layer.
		ldpGamePane.add(btnQuitGame);                                                                       
	}
}