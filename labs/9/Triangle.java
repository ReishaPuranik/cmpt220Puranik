
class Triangle extends Shape {
		private double side1, side2, side3;
		Triangle() {
			
		}
		public Triangle(double side1,double side2,double side3) throws IllegalTriangleException {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			if ((side1 + side2 ) > side3) {
				throw new IllegalTriangleException();
			} if((side3 + side2 ) > side1) {
				throw new IllegalTriangleException();
			} if((side1 + side3 ) > side2) {
				throw new IllegalTriangleException();
			}
		}
		public void setSide1(double side1) {
		  	this.side1 = side1;
		}
		public double getgetSide1() {
		   	return side1;
		}
		public void setSide2(double side2) {
		  	this.side2 = side2;
		}
		public double getgetSide2() {
		   	return side2;
		}
		public void setSide3(double side3) {
		  	this.side3 = side3;
		}
		public double getgetSide3() {
		   	return side3;
		}
		public double getArea() {
			double p = this.getPerimeter()/2;
			double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
			return area;
		}
		public double getPerimeter() {
			return side1+side2+side3;
		}
		public String toString() {
			return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		}
	}