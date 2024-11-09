package PrismBall;

import _01_methods._3_rain_game.RainGame;
import processing.core.PApplet;

public class PrismBall extends PApplet{
	static public void main(String[] args) {
        PApplet.main(PrismBall.class.getName());
    }
	 
	public void settings() {
	        size(255, 255);
	    }
	

    public void draw() {
		
		fill(mouseY, mouseY, mouseX);
		ellipse(127, 90, 50, 50);
		fill(mouseY, mouseX, mouseY);
		ellipse(157, 120, 50, 50);
}
	
	
}
