package Ex;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonEx extends JFrame {
	private JLabel lb;

	public JButtonEx() {
		// create JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLayout(new GridLayout(2, 1, 5, 5));
		lb = new JLabel("Label title");
		lb.setHorizontalAlignment(JLabel.CENTER);
		add(lb);
		// tao button
		JButton button = new JButton("Nhan vao day");
		// Lắng nghe sự kiện Click và xử lý
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changeTestJLabel();
				
			}

		});
		add(button);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	private void changeTestJLabel() {
		lb.setText("Bạn đã nhấn vào Button");

	}

	public static void main(String[] args) {
		new JButtonEx();

	}
}
