package menu;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuFrameDemo {

	static Color frameBackground;

	public static Color getFrameBackground() {
		return frameBackground;
	}

	public static void setFrameBackground(Color frameBackground) {
		MenuFrameDemo.frameBackground = frameBackground;
	}

	public static void main(String[] args) {

		frameBackground = BackGroundPanel.color;
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame("Swing Menu");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setJMenuBar((new MenuComponent()).createMenuBar());
			frame.add(new BackGroundPanel());
			frame.setSize(500, 500);
			frame.setBackground(frameBackground);
			frame.setVisible(true);
		});
	}

}
