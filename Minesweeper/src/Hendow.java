import javax.swing.*;
import java.awt.*;


public class Hendow extends JPanel{
	
	public static final Dimension SCREEN_SIZE = new Dimension(700, 700);
	
	private static Hendow instance;
	
	public static Hendow getInstance() {
		if(instance == null) {
			instance = new Hendow();
		}
		return instance;
	}
	
	
	
	private JFrame window;
	
	private Hendow() {
		window = new JFrame("Minesweeper");
		
		this.setPreferredSize(SCREEN_SIZE);
		this.setMinimumSize(SCREEN_SIZE);
		this.setMaximumSize(SCREEN_SIZE);
		window.setContentPane(this);
		
		window.pack();
		
		this.addMouseListener(MouseInteractions.getInstance());
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Board.drawBoard(g);
	}
}
