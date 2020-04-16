
public class Sphere extends Shape {
	double radius;
	Sphere() {
		
	}
	Sphere(double r) {
		radius = r;
	}
	public void setRadius(double radius) {
	  	this.radius = radius;
	}
	public double getRadius() {
	   	return radius;
	}
	public double getArea() {
		return 4*3.14*(radius*radius);
	}
	public String toString() {
		return "Sphere [radius=" + radius + ", Surface Area=" + getArea() + "]";
	   }
}
