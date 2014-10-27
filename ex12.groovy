//setup class
//define method to calculate distance between 2 points given two points
// call the method 
// find which was biggest


class Point {
	double x;
	double y;
}

double calculateDistance (Point A, Point B) {
	double DistX = 0, DistY = 0, Hyp = 0; 
	DistX =  A.x - B.x
	println (DistX);
	DistY = A.y - B.y;
	println (DistY);
	Hyp = Math.sqrt((DistX*DistX) + (DistY*DistY));
	println (Hyp);
	return Hyp;
}

void PointSetup (Point S) {
 	println ("Give me X coordinate");
	String Input = System.console().readLine();
	S.x = Double.parseDouble(Input);
	println ("Give me Y coordinate");
	Input = System.console().readLine();
	S.y = Double.parseDouble(Input);
}

Point Alpha = new Point();
PointSetup(Alpha);
Point Beta = new Point();
PointSetup(Beta);
Point Theta = new Point();
PointSetup(Theta);

double distance1 = calculateDistance(Alpha, Beta);
println (distance1);
double distance2 = calculateDistance(Beta, Theta);
println (distance2);
double distance3 = calculateDistance(Alpha, Theta);
println (distance3);

if (distance1 > distance2) {
	if (distance3 > distance1) {
		println ("The biggest distance is " + distance3);
	}
	else {
	println ("The biggest distance is " + distance1);
	}
}

if (distance2 > distance1 && distance2 > distance3) {
	println ("The biggest distance is " + distance2);
}

 
		
	


	
