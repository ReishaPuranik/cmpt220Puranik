
public class Bond {
	private double coupon;
	private int numOfPayments;
	private double interest;
	private double valueMaturity;
	//default constructor 
	Bond() {}
	// specified constructor
	Bond(double c, int N, double i, double M) {
		coupon = c;
		numOfPayments = N;
		interest = i;
		valueMaturity = M;
	}
	public void setcoupon(double coupon) {
  	this.coupon = coupon;
	}
	public double getcoupon() {
   	return coupon;
   	}
	public void setnumOfPayments(int numOfPayments) {
  	this.numOfPayments = numOfPayments;
  	}
	public int getnumOfPayments() {
  	return numOfPayments;
  	}
	public void setinterest(double interest) {
  	this.interest = interest;
  	}
	public double getinterest() {
  	return interest;
  	}
	public void setvalueMaturity(double valueMaturity) {
  	this.valueMaturity = valueMaturity;
  	}
	public double getvalueMaturity() {
  	return valueMaturity;
  	} 
	//Method with the equation to get the price
	public double getPrice() {
		double price =  coupon * (1.0-(1.0/(Math.pow(1.0+interest, numOfPayments)))) + valueMaturity * (1.0/(Math.pow(1.0+interest, numOfPayments)));
		return price;
	}
	//Main method to invoke the getPrice method 
	public static void main(String[] args) {
		//initializing specified constructor
		Bond bond2 = new Bond(500, 100, 0.05, 10000);
		System.out.println(bond2.getPrice());
	}
}