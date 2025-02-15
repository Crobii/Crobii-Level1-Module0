package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame;
	JButton button;
	Random rng;
	public void showButton() {
		System.out.println("Button clicked");
		rng = new Random();
		frame = new JFrame();
		button = new JButton("Open the fortune cookie!");
		frame.add(button);
		button.addActionListener(this);

		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num = rng.nextInt(5);
		
		if(num == 0) {
			JOptionPane.showMessageDialog(frame, "If you have love in your heart, you will be content.");
		}
		else if (num == 1) {
			JOptionPane.showMessageDialog(frame, "Go play Anodyne 2.");
		}
		else if (num == 2) {
			JOptionPane.showMessageDialog(frame, "Perceive the world in new ways.");
		}
		else if(num == 3) {
			JOptionPane.showMessageDialog(frame, "Benefitting others can benefit you.");
		}
		else if(num == 4) {
			JOptionPane.showMessageDialog(frame, "Death is more preferable than apathy.");
		}
	}
}
