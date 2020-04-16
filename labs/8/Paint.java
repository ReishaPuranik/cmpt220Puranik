public class Paint {
	private double sqFeetPerBucket;
	public Paint(double sqFeetPerBucket) {
  	this.sqFeetPerBucket = sqFeetPerBucket;
  }
  
  public double amountOfPaintNeeded(Shape s) {
  	return s.getArea() / sqFeetPerBucket;
  }
  
  public static void main(String[] args) {
  	Paint p = new Paint(400.0);
  
  	Sphere sphere1 = new Sphere(15);
    System.out.println(sphere1 + " and paint needed is " + p.amountOfPaintNeeded(sphere1));
    
  	Rectangle rectangle1 = new Rectangle(10, 20);
    System.out.println(rectangle1 + "and paint needed is " + p.amountOfPaintNeeded(rectangle1));
    
    Cylinder cylinder1 = new Cylinder(5, 3);
    System.out.println(cylinder1 + "and paint needed is " + p.amountOfPaintNeeded(cylinder1));
  }
}