package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuFrameDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame("Swing Menu");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setJMenuBar((new MenuComponent()).createMenuBar());
			frame.setSize(500, 500);
			frame.setVisible(true);
		});
	}

}
