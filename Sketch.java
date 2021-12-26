import processing.core.PApplet;
import java.lang.Math;

public class Sketch extends PApplet {


  /**
   * state global variables
   *  
   * */ 
  public float circleX = 0;
  public float circleY;
  public float speedX = 1;
  public int fillcolour = 219;

	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    
    // clear out old frames
    background(20, 136, 199);
    
    //sunset
    if (circleX >= 200)
    {
      fillcolour = fillcolour - 1;
      background(fillcolour);
    }

    // draw current frame based on state
    stroke(23, 184, 2);
    fill(23, 184, 2);
    rect(0, 250, 400, 200);
    
    stroke(252, 186, 3);
    fill(252, 186, 3);
    ellipse(circleX, circleY, 50, 50);

    // modify state
    circleX = circleX + speedX;

    //determine circleY variable
    float speedX2 = circleX - 100;
    double brackets = speedX2 - 100;
    double power = Math.pow(brackets, 2);
    double doublespeedY = 0.01 * power;
    circleY = (float)doublespeedY;
  
    //making two cycles
    if (circleY > height + 100)
    {
      circleX = 0;
      fillcolour = 219;
    }

    

  
  // define other methods down here.

  }
}