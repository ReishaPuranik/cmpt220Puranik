
public class Circle {
	private double x;
	private double y;
	private double radius;
	//no-arg constructor, creates a default circle
	Circle() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	//specified constructor
	Circle(double xVal, double yVal, double r) {
		x = xVal;
		y = yVal;
		radius = r;
	}
	//returns the area
	public double getArea() {
		return(3.14*(radius*radius));
	}
	//returns the perimeter
	public double getPerimeter() {
		return (2*3.14*radius);
	}
	//checks if a given point is inside the circle
	public boolean insideCircle(double x, double y) {
		double distance = Math.sqrt(Math.pow((getX()-x),2)-Math.pow((getY()-y),2));
		if (distance <= radius) {
			return true;
		}
		return false;
	}
	//checks if a circle is inside another circle
	public boolean containsCircle(Circle circle) {
		double distance = Math.sqrt(Math.pow((getX()-circle.x),2)-Math.pow((getY()-circle.y),2));
		if (radius > (distance + circle.radius)) {
			return true;
		}
		return false;
	}
	//checks if a circle overlaps a circle
	public boolean overlapsCircle(Circle circle) {
		double distance = Math.sqrt(Math.pow((getX()-circle.x),2)-Math.pow((getY()-circle.y), 2));
		if (distance < radius + circle.radius) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//initializing circle 1
		Circle c1 = (new Circle(2, 2, 5.5));
		//Gets the area
		System.out.println("The area of Circle 1 is: " + c1.getArea());
		//Gets the perimeter
		System.out.println("The perimeter of Circle 1 is: " + c1.getPerimeter());
		//Checks if the given point is inside circle 1
		System.out.println("Is the given point inside the circle? True or false: " + c1.insideCircle(3,3));
		//Checks if a new circle is inside circle 1
		System.out.println("Does Circle 1 contain another circle: True or false: " + c1.containsCircle(new Circle(4, 5, 10.5)));
		//Checks if another circle overlaps with circle 1
		System.out.println("Does Circle 1 overlap a new circle? True or false: " + c1.overlapsCircle(new Circle(3, 5, 2.3)));	
	}
}
