public class Square {
	double width;
	// No-arg constructor, creates default square
	Square() {
		this.width = 1;
	}
	// Creates a square with a specified width
	Square(double w) {
		width = w;	
	}
	// Method that returns the area of the square
	public double getArea() {
		return(width * width);
	}
	// Method that returns the perimeter of the square
	public double getPerimeter() {
		return(4*width);
	}	
  public static void main(String[] args) {
		//initializing no-arg constructor
		Square square1 = new Square(40);
		System.out.println("This is the width: " + square1.width);
		System.out.println("This is the area: " + square1.getArea());
		System.out.println("This is the perimeter: " + square1.getPerimeter());
		//initializing specified constructor
		Square square2 = new Square(39.5);
		System.out.println("This is the width: " + square2.width);
		System.out.println("This is the area: " + square2.getArea());
		System.out.println("This is the perimeter: " + square2.getPerimeter());
	}
}