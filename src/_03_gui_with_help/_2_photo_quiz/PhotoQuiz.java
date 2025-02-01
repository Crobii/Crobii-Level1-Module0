package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		int score;
		score = 0;
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )

		// 2. create a variable of type "Component" that will hold your image
		Component imageHolder;
		// 3. use the "createImage()" method below to initialize your Component
		imageHolder = createImage("file:////Users/league/git/Crobii-Level1-Module0/src/_03_gui_with_help/_2_photo_quiz/Dolphin1.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(imageHolder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer1 = JOptionPane.showInputDialog("Is this Dolphin Near Carwash?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer1.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(quizWindow, "Nope.");
		}
		else {
			JOptionPane.showMessageDialog(quizWindow, "That is not Dolphin Near Carwash.");
			score += 1;
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(imageHolder);
		// 10. find another image and create it (might take more than one line
		// of code)
		imageHolder = createImage("file:////Users/league/git/Crobii-Level1-Module0/src/_03_gui_with_help/_2_photo_quiz/DNC.jpeg");
		// 11. add the second image to the quiz window
		quizWindow.add(imageHolder);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("Is THIS Dolphin Near Carwash?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answer2.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(quizWindow, "That is Dolphin Near Carwash!");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(quizWindow, "Wrong, that's Dolphin Near Carwash");
		}
		//Repeats the process
		quizWindow.remove(imageHolder);
		
		imageHolder = createImage("file:////Users/league/git/Crobii-Level1-Module0/src/_03_gui_with_help/_2_photo_quiz/Dolphin2.jpg");
		
		quizWindow.add(imageHolder);
		
		quizWindow.pack();
		
		String answer3 = JOptionPane.showInputDialog("Final Question! Is this Dolphin Near Carwash?");
		
		if(answer3.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(quizWindow, "No it's really not");
		}
		else {
			JOptionPane.showMessageDialog(quizWindow, "Correct!");
			score += 1;
		}
		JOptionPane.showMessageDialog(quizWindow, "Your final score is: " + score);
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
