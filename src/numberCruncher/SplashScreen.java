package numberCruncher;													
																		
import java.awt.BorderLayout;                                           //Contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.Font;                                                   //Contains all of the classes for creating user interfaces and for painting graphics and images.
import javax.swing.JFrame;                                              //Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms.
import javax.swing.JPanel;                                              //Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms. 
import javax.swing.border.EmptyBorder;                                  //Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms. 
import javax.swing.JLayeredPane;                                        //Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms. 
import javax.swing.JLabel;                                              //Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms. 
import javax.swing.JProgressBar;                                        //Provides a set of "lightweight" (all-Java language) components that, to the maximum degree possible, work the same on all platforms.
																		
public class SplashScreen extends JFrame {                              
																		
	private static final long serialVersionUID = 1L;                    //Declares and sets a serialization for JFrame.
	private JPanel contentPane;                                         //Declares a JPanel.
	private JProgressBar progressBar;                                   //Instantiates a progress bar component.
	private JLabel lblProgress;                                         //Declares a label for the percentage of progress bar.	
																		
	public SplashScreen() {                                             
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	SplashScreen()
		//
		// Method parameters	:	none
		//
		// Method return		:	none
		//
		// Synopsis				:   This constructor method calls all the components.							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		Tiago   				none
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		setUndecorated(true);                                           //Sets no border for splash screen.
		setBounds(700, 300, 450, 300);                                  //Sets the bounds and position.
		contentPane = new JPanel();                                     //Instantiates a JPanel object.
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));             //Sets the borders for contentPane.
		contentPane.setLayout(new BorderLayout(0, 0));                  //Sets the layout for contentPane.
		setContentPane(contentPane);                                    //Sets the contentPane.
																		
		JLayeredPane layeredPane = new JLayeredPane();                  //Declare and instantiates the layer.
		contentPane.add(layeredPane);                                   //Add the layer in the contentPane.
																		
		JLabel lvlTitle = new JLabel("NUMBER CRUNCHER");             	//Declare and instantiates the title label.  
		lvlTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));        	//Sets the font.
		lvlTitle.setBounds(112, 101, 219, 69);                       	//Sets the bounds and position.
		layeredPane.add(lvlTitle);                                   	//Add the label in the layer.
																		
		progressBar = new JProgressBar();                               //Instantiates a progress bar object.
		progressBar.setBounds(10, 254, 420, 14);                        //Sets the bounds and location.
		layeredPane.add(progressBar);                                   //Add the progress bar into the layer.
																		
		lblProgress = new JLabel("");                                   //Instantiates the label for progress bar percent.
		lblProgress.setBounds(196, 229, 46, 14);                        //Sets the bounds and location.
		layeredPane.add(lblProgress);                                   //Add the label into the layer.
		
		JLabel lblAuthor = new JLabel("by Tiago Fontoura da Cruz");		//Instantiates the label for the author.
		lblAuthor.setFont(new Font("Tahoma", Font.ITALIC, 11));			//Sets the font.
		lblAuthor.setBounds(302, 11, 128, 14);							//Sets the bounds and location.
		layeredPane.add(lblAuthor);										//Add the label into the layer.
	}                                                                   
	
	//SETTER METHOD TO PROGRESS BAR
	public void setProgressBar(int progressBar) {                       
		this.progressBar.setValue(progressBar);                         //Defines a value from parameter.
	}                                                                   
																		
	//SETTER METHOD TO PROGRESS BAR LABEL
	public void setLblProgress(String lblProgress) {                    
		this.lblProgress.setText(lblProgress);                          //Defines a value from parameter.
	}                                                                   
}
