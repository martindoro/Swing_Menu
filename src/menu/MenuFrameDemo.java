package menu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrameDemo {

	static Color frameBackground;

	public static Color getFrameBackground() {
		return frameBackground;
	}

	public static void setFrameBackground(Color frameBackground) {
		MenuFrameDemo.frameBackground = frameBackground;
	}

	private class BackGroundPanel extends JPanel {

		private static final long serialVersionUID = -7448339677098092671L;

		public static Color color = new Color(0, 0, 0);

		public BackGroundPanel() {
			repaint();
		}

		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(color);
			// MenuFrameDemo.setFrameBackground(color);
		}
	}

	public static void main(String[] args) {

		frameBackground = MenuFrameDemo.BackGroundPanel.color;
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
