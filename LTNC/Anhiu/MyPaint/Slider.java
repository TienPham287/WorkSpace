package MyPaint;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JPanel {
	JSlider slider;
//	DrawingPanel drawingPanel;
	StatusBar statusBar;
	JLabel label;
	TabPane tabPane;

	public Slider(TabPane tabPane, StatusBar statusBar) {
		this.setBackground(Color.white);
		this.tabPane = tabPane;
		slider = new JSlider(1, 15);
		// gach
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		label = new JLabel();
		label.setText("Size nét vẽ~~" + slider.getValue());
		label.setFont(new Font("arial", Font.ITALIC, 15));
		slider.setBorder(BorderFactory.createEtchedBorder());
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(2);
		// don vi cach nhau moi vach
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(3);
//		slider.setOrientation(SwingConstants.VERTICAL);
		tabPane.drawPanels.get(tabPane.getSelectedIndex()).stroke = slider.getValue();
		statusBar.setSlider(slider.getValue());
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				label.setText("Size nét vẽ~~" + slider.getValue());
				tabPane.drawPanels.get(tabPane.getSelectedIndex()).stroke = slider.getValue();
				statusBar.setSlider(slider.getValue());
			}
		});
		add(slider);
		add(label);
	}
}
