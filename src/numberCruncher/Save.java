package numberCruncher;                                                                         
                                                                                                
import java.io.*;                                                                               //Provides for system input and output through data streams, serialization and the file system.
import java.util.*;                                                                             //Contains the collections framework, legacy collection classes, event model, date and time facilities. etc.
import javax.swing.JOptionPane;                                                                 //Provides a set of "lightweight" components that, to the maximum degree possible, work the same on all platforms.
                                                                                                
public class Save {	                                                                            
	                                                                                            
	private File file;																			//Declares a file object to store the file. 
	private Scanner input;                                                                      //Declares a scanner object to store the file's content. 
	private int points;                                                                         //Declares and sets a data member for points.
	private int subLevel;                                                                       //Declares and sets a data member for sub levels.
	private int gameState;                                                                      //Declares and sets a data member for game state (0 = Easy, 1 = Moderate and 2 = Difficult).
                                                                                                
	public void createFile(String initials) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void createFile()
		//
		// Method parameters	:	String initials
		//
		// Method return		:	none
		//
		// Synopsis				:   This method creates a new file.   				
		//							
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-06		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		try {                                                                                   //try
			file = new File(initials + ".txt");                                            		//Instantiates a file with initials (3 chars) and text type.
			if (file.createNewFile()) {				                                            //Creates a new, empty file if and only if a file with this name does not yet exist. 
				JOptionPane.showMessageDialog(null, "New saving: " + file.getName());			//Displays a message to confirm the file creation.
			}                                                                                   
		} catch (IOException e) {                                                               //catch
			JOptionPane.showMessageDialog(null, "ERROR!");                                      //Displays a message if something went wrong.
			e.printStackTrace();                                                                //Helps to understand where the actual problem occurred.
		}                                                                                       
	}                                                                                           
                                                                                                
	public void inputFile(String initials) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void inputFile()
		//
		// Method parameters	:	String initials
		//
		// Method return		:	none
		//
		// Synopsis				:   This method add content into a file that already exists.   				
		//							
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-06		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		try {                                                                                   //try
			FileWriter file = new FileWriter(initials + ".txt");			                    //Instantiates the file in a object to handle with the content.
			file.write(points + "\n" + subLevel + "\n" + gameState);                            //Writes the points, sub level and the game state.  
			file.close();                                                                       //Closes the file.
			JOptionPane.showMessageDialog(null, "File saved successfully.");			        //Displays a message to confirm the file inputs.
		} catch (IOException e) {                                                               //catch
			JOptionPane.showMessageDialog(null, "An error occurred.");			                //Displays a message if something went wrong.
			e.printStackTrace();                                                                //Helps to understand where the actual problem occurred.
		}                                                                                       
	}                                                                                           
                                                                                                
	public String loadFile(String initials) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void loadFile()
		//
		// Method parameters	:	String initials
		//
		// Method return		:	none
		//
		// Synopsis				:   This method loads the content into an object from a file that already exists.   				
		//							
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-06		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		String returnMessage = "";                                                              //Declares and sets a local file to return the content.
		int line = 0;                                                                           //Declares and sets a local file to zero to count the lines.
		try {                                                                                   //try
			file = new File(initials +".txt");													//Instantiates a file with initials (3 chars) and text type.
			if (file.canRead()) {																//Tests if the file is readable.
				input = new Scanner(file);														//Gets the string into the file.
				while (input.hasNextLine()) {													//Loops all the lines into it.
					line++;																		//Counts the number of lines.
					String message = input.nextLine();											//Sets the line into the string.
					returnMessage += message;													//Sets to returning message (all the file's content).
					if(line == 1) {                                                             //Tests if line is 1 to store the points.
						this.points = Integer.parseInt(message);						        //Stores the points.
					}else if(line == 2){                                                        //Tests if line is 2 to store the sub level.
						this.subLevel = Integer.parseInt(message);                              //Stores the sub level.
					}else {                                                                     //If line is not 1 or 2 stores the game state.
						this.gameState = Integer.parseInt(message);                             //Stores the game state.
					}                                                                           
				}                                                                               
				input.close();                                                                  //Closes the file.
			}                                                                                   
		} catch (FileNotFoundException e) {                                                     //catch
			JOptionPane.showMessageDialog(null, "ERROR!");                                      //Displays a message if something went wrong.
			e.printStackTrace();                                                                //Helps to understand where the actual problem occurred.
		}	                                                                                    
		return returnMessage;                                                                   //Returns the file's content.
	}                                                                                           
                                                                                                
	//GETTERS AND SETTERS
	public int getPoints() {                                                                    
		return points;                                                                          //Return the points.
	}                                                                                           
                                                                                                
	public void setPoints(int points) {                                                         
		this.points = points;                                                                   //Set the points.
	}                                                                                           
                                                                                                
	public int getSubLevel() {                                                                  
		return subLevel;                                                                        //Return the sub level.
	}                                                                                           
                                                                                                
	public void setSubLevel(int level) {                                                        
		this.subLevel = level;                                                                  //Set the sub level.
	}                                                                                           
                                                                                                
	public int getGameState() {                                                                 
		return gameState;                                                                       //Return the game state.
	}                                                                                           
                                                                                                
	public void setGameState(int gameState) {                                                   
		this.gameState = gameState;                                                             //Set the game state.
	}
}
