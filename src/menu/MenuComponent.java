package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuComponent {

	public JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Settings");
		menuBar.add(menu);

		JMenu rgb = new JMenu("RGB Chooser");
		menu.add(rgb);
		JMenuItem rgb1 = new JMenuItem("Red");
		rgb.add(rgb1);
		JMenuItem rgb2 = new JMenuItem("Green");
		rgb.add(rgb2);
		JMenuItem rgb3 = new JMenuItem("Blue");
		rgb.add(rgb3);
		menu.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(exit);
		return menuBar;
	}
}
