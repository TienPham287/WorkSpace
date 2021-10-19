package Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HandleEvent extends JFrame{
	public HandleEvent() {
		
	JButton btnOK =new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	JPanel pnButton = new JPanel();
	pnButton.add(btnOK);
	pnButton.add(btnCancel);
	
	OKListenerClass okLis = new OKListenerClass();
	CancelListenerClass cancelLis = new CancelListenerClass();
	btnOK.addActionListener(okLis);
	btnCancel.addActionListener(cancelLis);
	add(pnButton);
	
	setSize(300, 100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	class OKListenerClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("OK btton click");
		
			
		}
		
	}
	class CancelListenerClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Cancel button click");
		}
		
	}
	public static void main(String[] args) {
		new HandleEvent();
	}
	
	}
