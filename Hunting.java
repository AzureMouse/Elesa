
// Swing Dependencies
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

// Awt Dependencies
import java.awt.Dimension;
import java.awt.GridLayout; // -> Flowlayout for JFrame

// IO Dependencies
import java.io.File;
import java.io.FileWriter;


public class Hunting extends JFrame{
    JButton encounterButton;
    JComboBox pokemon;
    JLabel pokemonIcon;
    JLabel text;

    private final int WIDTH;
	private final int HEIGHT;
    private final int ROW;
    private final int COLUMN;

    public Hunting(){
        WIDTH = 500;
        HEIGHT = 500;
        ROW = 4;
        COLUMN = 1;

        // Frame properties
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // -> Exit the frame when exit is hit
        this.setVisible(true);
        this.setTitle("Elesa: Shiny Hunter");
        this.setLayout(new GridLayout(ROW, COLUMN));
        this.pack();
    }

    
}
