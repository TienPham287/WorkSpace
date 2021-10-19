package Ex;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


public class Menus extends JFrame{
public Menus() {
	JMenuBar jmb =new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu helpMenu = new JMenu("Help");
	jmb.add(fileMenu);
	jmb.add(helpMenu);
	fileMenu.add(new JMenuItem("New"));
	fileMenu.add(new JMenuItem("Open"));
	fileMenu.addSeparator();
	fileMenu.add(new JMenuItem("Print"));
	fileMenu.addSeparator();
	fileMenu.add(new JMenuItem("Exit"));
	JMenu softwareHelpSuMenu = new JMenu("Software");
	JMenu hardwareHelpSuMenu = new JMenu("Hardware");
	helpMenu.add(softwareHelpSuMenu);
	helpMenu.add(hardwareHelpSuMenu);
	softwareHelpSuMenu.add(new JMenuItem("Unix"));
	softwareHelpSuMenu.add(new JMenuItem("NT"));
	softwareHelpSuMenu.add(new JMenuItem("Win95"));
	helpMenu.add(new JCheckBoxMenuItem("Check it"));
	JMenu colorButtonMenu = new JMenu("Color");
	helpMenu.add(colorButtonMenu);
	
	JRadioButtonMenuItem jrmiBlue, jrmiYellow, jrmiRed;
	colorButtonMenu.add(jrmiBlue = new JRadioButtonMenuItem("Blue"));
	colorButtonMenu.add(jrmiYellow = new JRadioButtonMenuItem("Yellow"));
	colorButtonMenu.add(jrmiRed = new JRadioButtonMenuItem("Red"));
	
	ButtonGroup btg = new ButtonGroup();
	btg.add(jrmiBlue);
	btg.add(jrmiYellow);
	btg.add(jrmiRed);
	JMenuItem jmiNew, jmiOpen;
	fileMenu.add(jmiNew =new JMenuItem("New"));
	fileMenu.add(jmiOpen = new JMenuItem("Open"));
	
	helpMenu.setMnemonic(KeyEvent.VK_H);
	helpMenu.setMnemonic('F');
	fileMenu.setMnemonic('N');
	jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
	
	
	setSize(300,400);
	setVisible(true);
	setJMenuBar(jmb);
}
public static void main(String[] args) {
	new Menus();
}
}
