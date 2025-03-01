package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

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
		if(e.getSource() == button1) {
			showDucks();
		}
		else if(e.getSource() == button2) {
			showFrog();
		}
		else if (e.getSource() == button3) {
			showFluffyUnicorns();
		}
	}
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	
	
	
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
}
