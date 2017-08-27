package menu;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BackGroundPanel extends JPanel {

	private static final long serialVersionUID = -7448339677098092671L;

	public static Color color = new Color(0, 0, 0);

	public BackGroundPanel() {
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(color);
		MenuFrameDemo.setFrameBackground(color);
	}
}
