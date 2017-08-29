package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuFrameDemo {
	public static Color backGroundColor = new Color(0, 0, 0);

	public static JLabel backGround = new JLabel();
	public static Color getBackGroundColor() {
		return backGroundColor;
	}

	public static void setBackGroundColor(Color backGroundColor) {
		MenuFrameDemo.backGroundColor = backGroundColor;
	}

	private static void createMainFrame() {
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame("Swing Menu");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setJMenuBar(new MenuComponent().createMenuBar());
			backGround.setOpaque(true);
			backGround.setVisible(true);
			backGround.setBackground(backGroundColor);
			backGround.setPreferredSize(new Dimension(500, 500));
			frame.getContentPane().add(backGround);
			frame.pack();
			frame.setVisible(true);
			frame.repaint();
		});
	}

	public static void main(String[] args) {
		createMainFrame();
	}

}
