package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame;
	JButton button1;
	JButton button2;
	JButton button3;
	JPanel panel;
	public void runStart() {
		frame = new JFrame("CutenessTV");
		button1 = new JButton("Frog");
		button2 = new JButton("Ducks");
		button3 = new JButton("Unicorn");
		panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button3.addActionListener(this);
		button2.addActionListener(this);
		button1.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
