class Circle3 {
	double radius = 1.0;
	String color = "red";
	Circle3() {
		
	}
	Circle3(double radius) {
		this.radius = radius; 
	}
	Circle3(double radius, String color) {
		this.radius = radius;
    this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return(3.14*(radius*radius));
	}
	public String toString() {
		return "Circle with color: " + color + " and radius " + radius;
	}
}
class Cylinder3 extends Circle3 {
	double height = 1.0;
	Cylinder3() {
		super();
	}
	Cylinder3(double radius) {
		super(radius);
	}
	Cylinder3(double radius, double height) {
		super(radius);
		this.height = height;
	}
	Cylinder3(double radius, double height, String color) {
		super(radius, color);
	    this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return(3.14*(radius*radius)*height);
	}
}
public class TestCylinder { 
    public static void main(String[] args) {
  		Cylinder3 c1 = new Cylinder3();
    	System.out.println("Cylinder:" + " radius=" + c1.getRadius() + " height=" + c1.getHeight() + " base area=" + c1.getArea() + " volume=" + c1.getVolume());
    	Cylinder3 c2 = new Cylinder3(10.0);
    	System.out.println("Cylinder:" + " radius=" + c2.getRadius() + " height=" + c2.getHeight() + " base area=" + c2.getArea() + " volume=" + c2.getVolume());
		Cylinder3 c3 = new Cylinder3(2.0, 10.0);
		System.out.println("Cylinder:" + " radius=" + c3.getRadius() + " height=" + c3.getHeight() + " base area=" + c3.getArea() + " volume=" + c3.getVolume());
    }
}
	