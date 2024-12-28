package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 300;
    int y = 400;
    int birdYVelocity = 1;
    int pipe1X = 800;
    int pipe2X = 1200;
    boolean mouseHeld = false;
    int accelerationY = 1;
    int pipe1Y = (int) random (50, 200);
    int pipe2Y = (int) random (50, 200);
    int pipeGap;
    
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
        birdYVelocity += accelerationY;
        y+= birdYVelocity;
        ellipse(x, y , 100, 100);
        
        
        fill(0, 150, 0);
        rect(pipe1X, 0, 100, pipe1Y);
        rect(pipe1X, 400, 100, pipe1Y);
        rect(pipe2X, 0, 100, pipe2Y);
        rect(pipe2X, 400-pipe2Y, 100, pipe2Y);
//        if(y <= 800) {
//        	birdYVelocity += 2;
//        	y = birdYVelocity;
//        	
//        }
        if(pipe1X >= 50) {
        pipe1X -= 1;	
        }
        else {
        	pipe1Y = (int) random (50, 250);
        	pipe1X = 800;
        }
        if(pipe2X >= 50) {
        	pipe2X -= 1;
        }
        else {
        	pipe2Y = (int) random (50, 250);
        	pipe2X = 800;
        }
        if (y <= pipe1Y  && x == pipe1X) {
        	y = 10000;
        	System.out.println("Game Over");
        }
        if (y  >= pipe2Y && x == pipe2X) {
        	y = 10000;
        	System.out.println("Game Over");
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
    		birdYVelocity  = -15;
    	}
    	
    	
    }
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
