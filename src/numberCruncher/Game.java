package numberCruncher;

import java.util.*;                                                                    		//Contains the collections framework, legacy collection classes, event model, date and time facilities, internationalization, and miscellaneous utility classes.																							
import javax.swing.JOptionPane;                                                             //JOptionPane makes it easy to pop up a standard dialog box that prompts users for a value or informs them of something.
																							
class Game {                                                                                
	private ArrayList<Integer> numberList;                                                  //Declare dynamic array for the list number
	private Random random;		                                                            //Declare object random class to randomize the numbers																							
	private int modeNumber;                                                                 //Declare a modeNumber for users try to guess
	private int guessNumber;                                                                //Declare a guess number from the users 
																							
	public Game() {                                                                         
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Game()
		//
		// Method parameters	:	none
		//
		// Method return		:	none
		//
		// Synopsis				:   This constructor method instantiates the dynamic arrays for the number list and sets 				
		//							random number sequence. 
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-08		Tiago   				Constructor Method
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		super();                                                                            
		random = new Random();                                                              //Instantiates an object from random class
		numberList = new ArrayList<>();                                                     //Instantiates an dynamic list
	}                                                                                       
																							
	public void populateArrayList(int range) {                                              
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void populateArrayList()
		//
		// Method parameters	:	int range
		//
		// Method return		:	none
		//
		// Synopsis				:   This method populates the dynamic list with a range of random numbers.							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		numberList.clear();                                                                 //Clears the dynamic array
		for(int index = 0; index < 1000; index++) {                                         //Loop to run the entire dynamic array
			numberList.add(random.nextInt(range) + 1);                                      //Add a new random number from a range
		}		                                                                            
	}                                                                                       
																							
	public void quickSort(int lower, int higher) {                                           
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void quickSort()
		//
		// Method parameters	:	int lower, int higher
		//
		// Method return		:	none
		//
		// Synopsis				:   This method sorts the dynamic list calling the the arrayListPartition() method and using a recursive approach to						
		//							to redistribute the numbers.
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=                                                                                     //
		if (lower < higher)                                                                 //Verify if the lower number is less then the higher
		{                                                                                   
			int pivot = arrayListPartition(lower, higher);                                  //Stores the offSet (in this case the pivot) generated by the partition method.
			quickSort(lower, pivot - 1);                                                    //Calls recursive the method to get an offSet to the left side from pivot.
			quickSort(pivot + 1, higher);                                                   //Calls recursive the method to get an offSet to the right side from pivot.
		}                                                                                   
	}                                                                                       
																							
	private int arrayListPartition(int lower, int higher) {                                  
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	// Method				:	int arrayListPartition()
	//
	// Method parameters	:	int lower, int higher
	//
	// Method return		:	none
	//
	// Synopsis				:   This method makes partitions into dynamic list to sort with quickSort() method.					
	//							
	// Modifications		:
	//							Date			Developer				Notes
	//							----			---------				-----
	//							2022-05-31		Tiago   				none
	//
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		int pivot = numberList.get(higher);                                                 //Stores the pivot (in this case the highest number).
		int i = (lower - 1);                                                                //Stores the offSet to the left side.
		for (int j = lower; j < higher; j++) {                                              //Loop to run from the lowest to the highest number.
			if (numberList.get(j) <= pivot) {                                               //Tests if the number is less then pivot number.
				i++;                                                                        //Increments the offSet position from the left to the right side.
				int temp = numberList.get(i);                                               //Stores the number in a temporary variable.
				numberList.set(i, numberList.get(j));                                       //Rearranges the lower number into the dynamic array. 
				numberList.set(j, temp);                                                    //Rearranges the lower number into the dynamic array.
			}                                                                               
		}                                                                                   
		int temp = numberList.get(i + 1);                                                   //Stores the next numbers to the right side in a temporary variable.
		numberList.set((i + 1), numberList.get(higher));                                    //Rearranges the higher number into the dynamic array.
		numberList.set(higher, temp);                                                       //Rearranges the higher number into the dynamic array.
		return i + 1;                                                                       //Return the offSet (in this case next the pivot)
	}                                                                                       
																							
	public int statisticalMode(int range) {                                                
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	int estatisticalMode()
		//
		// Method parameters	:	int range
		//
		// Method return		:	none
		//
		// Synopsis				:   This method saves a number using statistical mode from a dynamic array and returns the number of occurrences.						
		//							
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		modeNumber = 0;                                                                     //Define a initial value to mode number.
		int maxCountNumber = 0;                                                             //Define a initial value to max value. 
		int index = 0;                                                                      //Define a initial value to index. 
		int countModes = 0;                                                                 //Define a initial value to mode counter.
		ArrayList<Integer> totals = new ArrayList<>();                                      //Declare and instantiates an array to save the occurrences.
		for (int i = 1; i <= range; ++i) {                                                  //Loop a dynamic range.
			int count = 0;                                                                  //Reset the counter.
			for (int j = index; j < numberList.size() && numberList.get(j) == i; j++) {		//Loop to run the array until the last position with the same number.
					count++;                                                                //Increments the counter.
					index++;                                                                //Increments the index (start point).
			}                                                                               
			totals.add(count);                                                              //Add the amount of the same number.
			if (count > maxCountNumber) {                                                   //Compares the new amount is greater then the last one.
				maxCountNumber = count;                                                     //If yes. Replaces the value.
				modeNumber = i;                                                             //Defines a new mode number.
			}                                                                               
		}                                                                                   
		for(int x = 0; x < totals.size(); x++) {                                            //Loop to run the entire array to check if there is more the one mode.
			if(maxCountNumber == totals.get(x)) {                                           //Compares the totals.
				countModes++;                                                               //Increments the number of modes.
			}                                                                               
		}                                                                                   
		return countModes;                                                                  //Return the number of modes (it can be one or more).
	}                                                  

	public boolean guessNumberValidation(String guessNumber) {                              
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	boolean guessNumberValidation()
		//
		// Method parameters	:	String guessNumber
		//
		// Method return		:	none
		//
		// Synopsis				:   This method validates if the guess is a number.						
		//							
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		boolean valid = true;                                                               //Defines and sets a value for a boolean
		try {                                                                               //try
			this.guessNumber = Integer.parseInt(guessNumber);	                            //Input the number using parse (the parameter comes from a JField as a string).
		} catch (Exception e) {			                                                    //catch
			valid = false;                                                                  //Turn into false if can not parse the String
		}                                                                                   
		return valid;                                                                       //Return the boolean (if is true, is valid)
	}                                                                                      
	
	//GETTER METHOD FOR DYNAMIC ARRAY POSITION																							
	public ArrayList<Integer> getNumberList() {                                             //Return the dynamic array.
		return numberList;                                                                  
	}                                                                                       
	//GETTER METHOD FOR DYNAMIC ARRAY POSITION																						
	public Integer getNumberList(int index) {                                               
		return numberList.get(index);                                                       //Return the number in a specific position.
	}                                                                                       
																							
	//GETTER METHOD FOR MODE NUMBER
	public int getModeNumber() {                                                            
		return modeNumber;                                                                  //Return the mode number.
	}       

	
	//SETTER METHOD TO MODE NUMBER 
	public void setModeNumber(int modeNumber) {                                             
		this.modeNumber = modeNumber;                                                       //Inputs the mode number.
	} 
	
	//GETTER METHOD TO GUESS NUMBER
	public int getGuessNumber() {                                                           
		return guessNumber;                                                                 //Return the guess number from user.
	}                                                                                       
	
	//SETTER METHOD TO GUESS NUMBER
	public void setGuessNumber(String guessNumber) {		                                
		try {			                                                                    //try
			this.guessNumber = Integer.parseInt(guessNumber);                               //Input the number using parse (the parameter comes from a JField as a string).
		} catch (Exception e) {                                                             //catch
			JOptionPane.showMessageDialog(null, e);                                         //Shows a message if fails.
		}                                                                                   
	}                                                                                       
																							
	@Override                                                                               
	public String toString() {                                                              //Using for debug purposes to print the dynamic array on console (NOT USED AT THIS MOMENT).
		return "Search [numberList = " + getNumberList() + "]";                             
	}                                                                                       
}                                                                                           
