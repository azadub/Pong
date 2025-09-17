package game;
import javax.swing.JFrame;

public class Pong extends JFrame{
	public Pong() { 
		final int SCREEN_WIDTH = 800;
		final int SCREEN_HEIGHT = 600;
		final String TITLE = "Pong";
		setTitle(TITLE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Pong();

	}

}
