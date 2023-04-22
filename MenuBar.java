/*
 * Matthew Homan
 * April 6, 2023
 * Week 4 Discussion Task
 * CMIS 242 7382
 */

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuBar {

	public static void main(String[] args) {

		//Create new JFrame object
		JFrame frame = new JFrame();

		//Create menuBar and menu objects
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("A Menu for UMGC");

		//Create 3 items for the menu - the last is RadioButton 
		JMenuItem item_1 = new JMenuItem("CMIS 242");
		menu.add(item_1);

		//Add line separators 
		menu.addSeparator();

		JMenuItem item_2 = new JMenuItem("Spring 2023");
		menu.add(item_2);

		menu.addSeparator();

		JRadioButtonMenuItem item_3 = new JRadioButtonMenuItem("GUI Task");
		menu.add(item_3);

		//Add menu to menu bar
		menuBar.add(menu);          
		frame.setJMenuBar(menuBar);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);  
		frame.setVisible(true);

	}

}
