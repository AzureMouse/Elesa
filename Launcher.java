/**
 * File:	Launcher.java
 * Project	Elesa
 * Date:	11/21/22
 * Author:	AzureMouse
 * Description
 *
 *
 * Pokemon Hunting tool that is used for keeping track of ones 
 * progress with shiny pokemon hunting.
 *
 **/

// Swing Dependencies
import javax.swing.JFrame;
import javax.swing.JPanel;


// Awt Dependencies
import java.awt.Dimension;
import java.awt.FlowLayout; // -> Flowlayout for JFrame


public class Launcher{
	public static void main(String[] args){
		JFrame frame = new JFrame(); // -> Our frame object
		JPanel contentPanel = new JPanel(); // -> Where our content will go 



		// Frame properties
		final int WIDTH = 400;
		final int HEIGHT = 200;

		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT)); // -> Set width and height of our frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // -> Exit the frame when the user hits exit
		frame.setLayout(new FlowLayout());

		// Content panel properties
		
		// Add components to the frame
		frame.add(contentPanel);

		// Frame
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setTitle("Elesa");
		frame.pack();



	}
}


