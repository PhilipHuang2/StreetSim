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
	background(255);
}
public void draw()
{
 	stroke(255, 236, 94);
 	for (int b = 240; b < 261; b = b + 20) {
 		for (int a = 0; a < 500; a = a+50) {
 			line(a,b,a+40,b);
 		}
 	}


}
class vehicle
{
	vehicle()
	{

	}
}

class person
{
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
