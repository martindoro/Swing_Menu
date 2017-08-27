package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ColorFrame {
	public ColorFrame() {
		EventQueue.invokeLater(() -> {
			JFrame rgbFrame = new JFrame("Color channels");
			rgbFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			rgbFrame.add(new RgbControlPanel());
			rgbFrame.pack();
			rgbFrame.setVisible(true);
		});
	}
}
