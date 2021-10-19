package Listener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;



public class SwingMenuDemo extends JFrame{
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
public SwingMenuDemo() {
	initUI();
	
}

private void initUI() {
	setTitle("Ví dụ Java Swing");
	setSize(300, 200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//setLayout(new GridLayout(3,1));
	headerLabel = new JLabel("", JLabel.CENTER);
	statusLabel = new JLabel("", JLabel.CENTER);
	statusLabel.setSize(300,100);
	addWindowListener(new WindowAdapter() {
		public void WindowClosing(WindowEvent windowevent) {
			System.exit(0);
		}
	});
	 controlPanel = new JPanel();
	 controlPanel.setLayout(new FlowLayout());
	 add(controlPanel);
	 add(headerLabel);
	 add(statusLabel);
	 setVisible(true);
	 
}
private void ShowMenuDemo() {
	// Tạo một menuBar
	final JMenuBar menuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu aboutMenu = new JMenu("About");
    JMenu linkMenu = new JMenu("Links");
	 // Tạo các Item
	JMenuItem newMenuItem = new JMenuItem("New");
	newMenuItem.setMnemonic(KeyEvent.VK_N);
	newMenuItem.setActionCommand("New");
	JMenuItem openMenuItem = new JMenuItem("Open");
	openMenuItem.setActionCommand("Open");
	JMenuItem saveMenuItem = new JMenuItem("Save");
	saveMenuItem.setActionCommand("Save");
	JMenuItem ExitMenuItem = new JMenuItem("Exit");
	ExitMenuItem.setActionCommand("Exit");
	JMenuItem CutMenuItem = new JMenuItem("Cut");
	CutMenuItem.setActionCommand("Cut");
	JMenuItem  CopyMenuItem = new JMenuItem("Copy");
	CopyMenuItem.setActionCommand("Copy");
	JMenuItem PasteMenuItem = new JMenuItem("Paste");
	PasteMenuItem.setActionCommand("Paste");
	
	MenuItemlistener menuItemListener = new MenuItemlistener();
	newMenuItem.addActionListener(menuItemListener);
	openMenuItem.addActionListener(menuItemListener);
	saveMenuItem.addActionListener(menuItemListener);
	CutMenuItem.addActionListener(menuItemListener);
	CopyMenuItem.addActionListener(menuItemListener);
	PasteMenuItem.addActionListener(menuItemListener);
	
	JCheckBoxMenuItem showWindowMenu = new JCheckBoxMenuItem("Show About", true);
	showWindowMenu.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
		if (showWindowMenu.getState()) {
			menuBar.add(aboutMenu);
		} else {
			menuBar.remove(aboutMenu);

		}
			
		}
	});
	final JRadioButtonMenuItem showLinksMenu = new JRadioButtonMenuItem("Show Links", true);
	showLinksMenu.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
		if (menuBar.getMenu(3) != null) {
			menuBar.remove(linkMenu);
			repaint();
		} else { 
			menuBar.add(linkMenu);
			repaint();

		}
			
		}
	});
	
	//thêm các item tới các menu
	fileMenu.add(newMenuItem);
	fileMenu.add(CopyMenuItem);
	fileMenu.add(saveMenuItem);
	fileMenu.addSeparator();
	fileMenu.add(showWindowMenu);
	fileMenu.addSeparator();
	fileMenu.add(showLinksMenu);
	fileMenu.add(CutMenuItem);
	fileMenu.add(PasteMenuItem);
	fileMenu.add(ExitMenuItem);
	fileMenu.add(PasteMenuItem);
	
	//thêm các menu tới MenuBar
	menuBar.add(linkMenu);
	menuBar.add(fileMenu);
	menuBar.add(aboutMenu);
	menuBar.add(editMenu);
	// thêm MenuBar tới các frame
	setJMenuBar(menuBar);
	setVisible(true);
}
class MenuItemlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	statusLabel.setText(e.getActionCommand() + "JMenuItem clicks");
	
		
	}
	
}
public static void main(String[] args) {
	 SwingMenuDemo swingMenuDemo = new SwingMenuDemo();
	 swingMenuDemo.ShowMenuDemo();
}

}
