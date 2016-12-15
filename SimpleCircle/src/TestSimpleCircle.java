
public class TestSimpleCircle {

	
}	
	
	//Define circle class 
class SimpleCircle {
	double radius;
	
	//construct a circle with radius 1 (no arg constructor)
	SimpleCircle() {
		radius=1;
	}
	
	//construct a circle with a specified radius
	SimpleCircle(double newRadius){
		radius=newRadius;
	}
	//get area
	double getArea(){
		return radius*radius*3.14159
	}
	//get perimeter
	double getPerimeter(){
		return radius*2*3.14159
	}
	
}
	
	

