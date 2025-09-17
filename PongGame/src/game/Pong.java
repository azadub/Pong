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
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong();
			}
		});
	}
}
