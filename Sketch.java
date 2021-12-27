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
  public int r = 176;
  public int g = 165;
  public int b = 9;
  public int counter = 1;

	
	
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
	  
    
    //day cycle
    if(counter % 2 == 1)
    {
    // clear out old frames
    background(20, 136, 199);
    
    //sunset
    if (circleX >= 200)
    {
      g = g - 1;
      background(r, g, b);
    }

    // draw current frame based on state
    stroke(23, 184, 2);
    fill(23, 184, 2);
    rect(0, 250, 400, 200);

    stroke(252, 186, 3);
    fill(252, 186, 3);
    ellipse(circleX, circleY, 50, 50);

    //tree
    stroke(165,42,42);
    fill(165,42,42);
    rect(300,200,20,150);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(310,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(280,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(340,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(310,170,50,50);

    // modify state
    circleX = circleX + speedX;

    //determine circleY variable
    float speedX2 = circleX - 100;
    double brackets = speedX2 - 100;
    double power = Math.pow(brackets, 2);
    double doublespeedY = 0.01 * power;
    circleY = (float)doublespeedY;

    if (circleY > height + 75){
      counter++;
      circleX = 0;
    }

    }

  else
    {
    r = 176;
    g = 165;
    b = 9;
    background(19, 20, 19);

    // draw current frame based on state
    stroke(3, 61, 3);
    fill(3, 61, 3);
    rect(0, 250, 400, 200);
  
    stroke(199, 212, 199);
    fill(199, 212, 199);
    ellipse(circleX, circleY, 50, 50);

    //stars
    stroke(199, 212, 199);
    fill(199, 212, 199);
    ellipse(random(width), random(height), 2, 2);
 
    //tree
    stroke(89, 46, 27);
    fill(89, 46, 27);
    rect(300,200,20,150);
    
    stroke(7, 120, 7);
    fill(7, 120, 7);
    ellipse(310,200,50,50);
    
    stroke(7, 120, 7);
    fill(7, 120, 7);
    ellipse(280,200,50,50);
    
    stroke(7, 120, 7);
    fill(7, 120, 7);
    ellipse(340,200,50,50);
    
    stroke(7, 120, 7);
    fill(7, 120, 7);
    ellipse(310,170,50,50);

    // modify state
    circleX = circleX + speedX;

    //determine circleY variable
    float speedX2 = circleX - 100;
    double brackets = speedX2 - 100;
    double power = Math.pow(brackets, 2);
    double doublespeedY = 0.01 * power;
    circleY = (float)doublespeedY;
  
    if (circleY > height + 75){
      counter++;
      circleX = 0;
    }
      
  }
    

  

    

  
  // define other methods down here.

  }
}