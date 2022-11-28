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
import javax.swing.JMenu;
import javax.swing.JMenuBar;

// Awt Dependencies
import java.awt.Dimension;
import java.awt.FlowLayout; // -> Flowlayout for JFrame

public class Launcher{

	// GUI Components
	JFrame frame;
	JPanel contentPanel;
	JMenuBar menuBar;
	JMenu huntMenu;

	private final int WIDTH;
	private final int HEIGHT;

	public Launcher(){

		// Initalize default values for launcher
		frame = new JFrame(); // -> Our frame object
		contentPanel = new JPanel(); // -> Where our content will go 
		menuBar = new JMenuBar(); // -> MenuBar that will have menu objects placed on
		huntMenu = new JMenu("Hunt");

		// Frame properties
		WIDTH = 400;
		HEIGHT = 200;

		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT)); // -> Set width and height of our frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // -> Exit the frame when the user hits exit
		frame.setLayout(new FlowLayout());

		// Menu tab configurations
		menuBar.add(huntMenu);
		
		// Add components to the frame
		frame.add(contentPanel);

		// Frame contents
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setTitle("Elesa");
		frame.setJMenuBar(menuBar);
		frame.pack();
	}

}


