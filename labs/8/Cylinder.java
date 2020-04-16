
class Cylinder extends Shape {
	double radius, height;
	Cylinder() {
		
	}
	Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	public void setRadius(double radius) {
	  	this.radius = radius;
	}
	public double getRadius() {
	   	return radius;
	}
	public void setHeight(double height) {
	  	this.radius = radius;
	}
	public double getHeight() {
	   	return height;
	}
	public double getArea() {
		return (3.14*(radius*radius)*height);
	}
	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + radius + ", Surface area=" + getArea() + "]";
	}
	               
}