package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 300;
    int y = 400;
    int birdYVelocity = 10;
    int pipe1X = 800;
    int pipe2X = 800;
    boolean mouseHeld = false;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
        background(0, 0, 210);
        fill(210, 210, 0);
        stroke(0, 0, 0);
        ellipse(x, y, 100, 100);
        fill(0, 150, 0);
        rect(pipe1X, 0, 100, 200);
        rect(pipe2X, 100, 100, 200);
        if(y <= 800) {
        	birdYVelocity += 2;
        	y = birdYVelocity;
        }
        if(pipe1X >= 50) {
        pipe1X -= 1;	
        }
        if(pipe2X >= 50) {
        	pipe1X -= 1;
        }
        else {
        	pipe1X = 800;
        	pipe2X = 800;
        }

        
      
    }
    
    public void mousePressed() {
    	int heldTime = 1;
    	for(int i = 0; i <= 1; i++) {
    		heldTime -= 1;
    	}
    	
    	while(heldTime == 0) {
    		mouseHeld = true;
    	}
    	while(heldTime == 1) {
    		mouseHeld = false;
    	}
    	if(mouseHeld = true) {
    		birdYVelocity -= 30;
    	}
    	
    	
    }
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
