package com.timothyrjames.keydemo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyDemoListener implements KeyListener {
	private KeyDemoPanel panel;
 public KeyDemoListener(KeyDemoPanel panel ) {
	this.panel = panel;
}
	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("Key Typed:" + e.getKeyChar() );
	}

	@Override
	public void keyPressed(KeyEvent e) {
//	System.out.println("Key Pressed:"+ e.getKeyChar());
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			panel.moveLeft();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			panel.moveRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			panel.moveDown();
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			panel.moveUp();
		}
		}

	@Override
	public void keyReleased(KeyEvent e) {
	//	System.out.println("Key Released:" + e.getKeyChar());
		
	}

}
