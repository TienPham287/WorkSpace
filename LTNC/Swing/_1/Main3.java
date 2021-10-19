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

public class Main3 {
	public static void main(String[] args) {
		createWindow();

	}

	private static void createWindow() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Swing Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createUI(frame);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void createUI(final JFrame frame) {
		JPanel panel = new JPanel(new FlowLayout());

		LayoutManager layout = new FlowLayout();
		panel.setLayout(layout);
		JButton button = new JButton("luu sinh vien");
		JLabel label = new JLabel();
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Có, chắc rồi", "Không, tôi đã thay đổi ý định", "Thôi bỏ" };
				int result = JOptionPane.showOptionDialog(frame, "Bạn có chắc muốn lưu sinh viên này", "Xác nhận",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if (result == JOptionPane.YES_OPTION) {
					label.setText("Bạn chọn :YES ");
				} else if (result == JOptionPane.NO_OPTION) {
					label.setText("Bạn chọn :NO");
				} else if (result == JOptionPane.CANCEL_OPTION) {
					label.setText("Bạn chọn CANCEL");
				} else {
					label.setText("Chưa");

				}
			}
			
		});
		panel.add(button);
		panel.add(label);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

	}

}
