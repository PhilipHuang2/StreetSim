import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class StreetSim extends PApplet {

public void setup()
{
	size(500,500);
	background(0);
}
public void draw()
{
 	stroke(255, 236, 94);
 	strokeWeight(2);
 	for (int b = 240; b < 261; b = b + 20) {
 		for (int a = 0; a < 500; a = a+50) {
 			line(a,b,a+40,b);
 		}
 	}
 	noStroke();
 	strokeWeight(0);
 	fill(150);
 	rect(0,404,500,500);
 	rect(0,0,500,96);
 	stroke(255);
 	fill(255);
 	strokeWeight(2);
 	for(int c = 96; c < 400; c = c + 170)
 	{
 		for(int d = 450; d < 500; d = d + 46)
 		{
 	 	 	line(d, c, d, c + 138);
 		}
 	}
 	text("450,96", 450, 96);
 	text("450,240", 450, 240);
 	text("450,260", 450, 260);
 	text("450,404", 450, 404);

}
class vehicle
{
	int myX, myY;
	vehicle()
	{

	}
}

class person
{
	int myX, myY;
	person()
	{

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "StreetSim" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
