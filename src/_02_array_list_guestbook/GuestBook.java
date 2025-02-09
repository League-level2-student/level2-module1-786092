package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton AddButton = new JButton("Add Name");
	JButton ViewButton = new JButton("View Name");
	ArrayList<String> names = new ArrayList<String>();

	public GuestBook() {
		panel.add(AddButton);
		panel.add(ViewButton);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AddButton.addActionListener(this);
		ViewButton.addActionListener(this);
		frame.pack();

	}

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == AddButton) {
			String guest = JOptionPane.showInputDialog(frame, "Enter a name:");
			names.add(guest);

		} else if (e.getSource() == ViewButton) {

			String list = "";
			for (int i = 0; i < names.size(); i++) {
				list += "Guest # " + (i + 1) + " " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
}
