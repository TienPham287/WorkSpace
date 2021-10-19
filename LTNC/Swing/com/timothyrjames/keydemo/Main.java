package com.timothyrjames.keydemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {
public static void main(String[] args) {
	JFrame frame =  new JFrame();
	KeyDemoPanel panel = new KeyDemoPanel();
	panel.addKeyListener(new KeyDemoListener(panel));
	panel.setFocusable(true);
	//JTextField field = new JTextField(20);
	//field.addKeyListener(new KeyDemoListener());
	//panel.add(field);
	frame.getContentPane().add(panel);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setSize(500, 500);
	frame.setVisible(true);
	
}
}