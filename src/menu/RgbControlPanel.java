package menu;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RgbControlPanel extends JPanel {

	private static final long serialVersionUID = 4085205957470135744L;

	protected static final int MIN = 0;
	protected static final int MAX = 255;
	private int redValue = MenuFrameDemo.getFrameBackground().getRed();
	private int greenValue = MenuFrameDemo.getFrameBackground().getGreen();
	private int blueValue = MenuFrameDemo.getFrameBackground().getBlue();
	private int newRed;
	private int newGreen;
	private int newBlue;
	private Color newColor = new Color(newRed, newGreen, newBlue);

	public RgbControlPanel() {
		setLayout(new GridBagLayout());

		JSlider red = new JSlider(MIN, MAX, redValue);
		red.setBorder(new TitledBorder("Red channel"));
		red.setMinorTickSpacing(51);
		red.setMajorTickSpacing(255);
		red.setPaintTicks(true);
		red.setPaintLabels(true);
		red.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				newRed = source.getValue();
			}
		});
		add(red);

		JSlider green = new JSlider(MIN, MAX, greenValue);
		green.setBorder(new TitledBorder("Green channel"));
		green.setMinorTickSpacing(51);
		green.setMajorTickSpacing(255);
		green.setPaintTicks(true);
		green.setPaintLabels(true);
		green.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				newGreen = source.getValue();
			}
		});
		add(green);

		JSlider blue = new JSlider(MIN, MAX, blueValue);
		blue.setBorder(new TitledBorder("Blue channel"));
		blue.setMinorTickSpacing(51);
		blue.setMajorTickSpacing(255);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);
		blue.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				newBlue = source.getValue();
				MenuFrameDemo.setFrameBackground(newColor);
			}
		});
		add(blue);

		JButton setBackground = new JButton("Set");
		setBackground.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BackGroundPanel.color = newColor;
			}
		});
		add(setBackground);
	}
}
