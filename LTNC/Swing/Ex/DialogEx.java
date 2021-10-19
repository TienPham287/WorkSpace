package Ex;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DialogEx {
	public static void maint(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		JDialog dialog = new JDialog(frame, "Dialog", true);
		JPanel mainGui = new JPanel(new BorderLayout());
		mainGui.setBorder(new EmptyBorder(20, 20, 20, 20));
		mainGui.add(new JLabel("Đóng hộp thoại"), BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel(new FlowLayout());
		mainGui.add(buttonPanel, BorderLayout.SOUTH);
		JButton close = new JButton("Đóng");
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.setVisible(false);
			}
		});
		buttonPanel.add(close);

		frame.setVisible(true);

		dialog.setContentPane(mainGui);
		dialog.pack();
		dialog.setVisible(true);

	}
}