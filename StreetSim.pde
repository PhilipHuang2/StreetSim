void setup()
{
	size(500,500);
	background(255);
}
void draw()
{
	//make 50 & 40 a variable
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