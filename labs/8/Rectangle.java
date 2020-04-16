
class Rectangle extends Shape {
	double length, width;
	Rectangle() {
		
	}
	Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	public void setLength(double length) {
	  	this.length = length;
	}
	public double getLength() {
	   	return length;
	}
	public void setWidth(double width) {
	  	this.width = width;
	}
	public double getWidth() {
	   	return width;
	}
	public double getArea() {
		return(length*width);
	}
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", area=" + getArea() + "]";
	}
}