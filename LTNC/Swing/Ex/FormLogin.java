package Ex;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormLogin extends JFrame  implements ActionListener{
	public FormLogin() {
		
		initUI();
		
		}

	private void initUI() {
		JPanel panel = new JPanel(new BorderLayout(5,5));
		panel.setLayout(new GridLayout(2,1));
		JPanel pnA = new JPanel();
		pnA.add(new JLabel("Tài khoản"));
		pnA.add(new JTextField(20));
		panel.add(pnA);
		
		JPanel pnB = new JPanel();
		pnB.add(new JLabel("Mật khẩu"));
		pnB.add(new JTextField(20));
		panel.add(pnB);
		JPanel panel1 = new JPanel(new BorderLayout(5, 5));
		panel1.setLayout(new FlowLayout());
		JButton btnLogin = new JButton("Login");
		JButton btnExit = new JButton("Exit");
		panel1.add(btnLogin);
		panel1.add(btnExit);
	    add(panel1, BorderLayout.SOUTH);
		
		add(panel);
		
		setTitle("Form");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					System.out.println("Ban vua nhan vaologin");
					
			}
		});
		btnLogin.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				JOptionPane.showMessageDialog(rootPane, "bạn đang nhấn phím gì đó vào login");
				
			}
		});
		btnExit.addActionListener(this);
	}
	public static void main(String[] args) {
		new FormLogin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Bạn vừa chạy vào listener do tôi chạy ra");
		
	}
	}

