package _1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main2 {
	public static void main(String[] args) {
		createWindow1();
	}

	public static void createWindow1() {
		JFrame frame = new JFrame("Swing Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createUI(frame);
		frame.setSize(560, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void createUI(final JFrame frame) {
		JPanel panel = new JPanel();
		LayoutManager layout = new FlowLayout();
		panel.setLayout(layout);

		JButton button = new JButton("luu sinh vien");
		final JLabel label = new JLabel();
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(frame, "Bạn có chắc muốn lưu sinh vien này", "Xác nhận",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					label.setText("Bạn chọn: Yes");

				} else if (result == JOptionPane.NO_OPTION) {
					label.setText("Bạn chọn: No");

				} else {
					label.setText("Chưa");
				}
			}
		});
		panel.add(button);
		panel.add(label);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
	}

	private static void createWindow() {
		// TODO Auto-generated method stub

	}
}
