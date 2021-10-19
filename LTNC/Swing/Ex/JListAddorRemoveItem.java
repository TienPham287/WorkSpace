package Ex;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JListAddorRemoveItem  extends JFrame implements ActionListener{
	private JTextField tfAdd;
	private JList<String> myList;
public JListAddorRemoveItem() {
		setTitle("Add-remove item int JList");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setLocationRelativeTo(null);
		setVisible(true);
		add(createMainPanel());
}
private JPanel createMainPanel() {
	JPanel panel = new JPanel(new BorderLayout());
	panel.setBorder(new EmptyBorder(0, 15, 15, 15));
	
	panel.add(createAddPanel(), BorderLayout.PAGE_END);
	panel.add(createDeletePanel(), BorderLayout.PAGE_START);
	panel.add(createList(), BorderLayout.CENTER);
	return panel;
}
private JPanel createDeletePanel() {
	JPanel panel = new JPanel(new GridLayout(0, 1));
	panel.add(createButton("Delete"));
	return panel;
	
	
}
private JPanel createAddPanel() {
	JPanel panel = new JPanel(new GridLayout(0,1));
	panel.add(tfAdd = new JTextField(20));
	panel.add(createButton("Add"));
	
	return panel;
	
}
private JList<String> createList(){
	DefaultListModel<String> model = new DefaultListModel<>();
	model.addElement("Java");
	model.addElement("C#");
	myList = new JList<String>(model);
	return myList;
	
}
private Component createButton(String btnName) {
	JButton  btn = new JButton(btnName);
	btn.addActionListener(this);
	return btn;
}
private void deleteItem() {
	//get model of JList
	DefaultListModel<String> model = (DefaultListModel<String>)myList.getModel();
	//delete item is selected
	if (!model.isEmpty() && myList.getSelectedIndex() >= 0) {
		model.remove(myList.getSelectedIndex());
	}
	//set Model for JList
	myList.setModel(model);
}


private void addItem() {
	String item = tfAdd.getText().trim();
	if (item.equals("")) {
		JOptionPane.showMessageDialog(null, "Pleas enter item add to JList", "Error", JOptionPane.ERROR_MESSAGE);
	
	}else {
		DefaultListModel model = (DefaultListModel)myList.getModel();
		model.addElement(item);
		tfAdd.setText("");
	}
}


@Override
public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand() == "Delete") {
		deleteItem();
		return;
	}
	if (e.getActionCommand() == "Add") {
		addItem();
	}

		
}
public static void main(String[] args) {
	new JListAddorRemoveItem();
}}
