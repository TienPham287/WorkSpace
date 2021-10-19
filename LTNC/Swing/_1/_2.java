package _1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _2 {
	_2() {
		String[] st = { "cat", "dog", "snake" };
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		frame.setVisible(true);

		frame.setSize(500, 500);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JComboBox jc = new JComboBox(st);
		ImageIcon im = new ImageIcon(new ImageIcon("./Swing/_1/cat.jpg").getImage().getScaledInstance(300, 300, 0));
		JLabel label = new JLabel();
		label.setIcon(im);
		panel2.add(jc);
		panel1.add(label);
		panel.add(panel2);
		panel.add(panel1);  
		frame.add(panel);
		jc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == jc) {
					label.setIcon(new ImageIcon(new ImageIcon("./Swing/_1/" + jc.getSelectedItem() + ".jpg").getImage()
							.getScaledInstance(300, 300, 0)));
				}
			}
		});
		
		// thong bao khi dong cua so frame
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int ex = JOptionPane.showConfirmDialog(null, "b co muon out", null, JOptionPane.YES_NO_OPTION);
				if (ex == 0) {
					System.exit(0);
				}
			}
		});

	}

	public static void main(String[] args) {
		new _2();

	}

}
