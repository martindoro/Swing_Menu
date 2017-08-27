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

		JMenuItem rgb = new JMenuItem("Color channels");
		rgb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ColorFrame();
			}

		});
		menu.add(rgb);
		menu.addSeparator();
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(exitMenuItem);
		return menuBar;
	}

}
