
public class MyLong {
	private long value;
	
	MyLong (long v) {
		this.value = v;
	}
	
  public long getValue() {
		return value;
	}
	
  public boolean isEven() {
		//checks if the value can be divisible by two
		if (value % 2 ==0) {
			return true; //even
				
		} else {
			return false; //odd
				
		}
	}
  
	public boolean isOdd() {
		//checks if the value is divisible by two
		if (value % 2 == 0) {
			return false; //even
			
			
		} else {
			return true; //odd
			
		}
	}
	
  public boolean isPrime() {
		return this.isPrime(value);	
  }
  
	public static boolean isEven(long value) {
		if (value % 2 == 0) {
			return true; //even
			
		} else {
			return false; //odd
			
		}
	}
	public static boolean isOdd(long value) {
		if (value % 2 == 0) {
			return false; //even
			
		} else {
			return true; //odd
			
		}
	}
	public static boolean isPrime(long value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			} 
		}
    return true;
	}
	public static boolean isEven(MyLong mL) {
		if (mL.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isOdd(MyLong mL) {
		if (mL.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
  public static boolean isPrime(MyLong mL) {
		return mL.isPrime(mL.value);
	}
  
	public boolean equals(long value) {
		if (this.value == value) {
			return true; //they do equal
		} else {
			return false; //they do not equal
		}
	}
	public boolean equals(MyLong mL) {
		if (this.value == mL.value) {
		      return true;
		} else {
			return false;
		}
	}
	public static long parseLong(char ch[]) {
		String str = "";
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		} return Long.parseLong(str);
	}
	public static long parseLong(String str) {
		return Long.parseLong(str);
	}
	public static void main(String[] args) {
		MyLong ml = new MyLong(7);
    
		System.out.println("The value is even? " + ml.isEven());
	    System.out.println("The value is odd? " + ml.isOdd());
		System.out.println("The value is prime? " + ml.isPrime());
	    
	    System.out.println("The value is even? " + MyLong.isEven(7));
	    System.out.println("The value is odd? " + MyLong.isOdd(7));
		System.out.println("The value is prime? " + MyLong.isPrime(7));
	    
	    System.out.println("The value is even? " + MyLong.isEven(ml));
	    System.out.println("The value is odd? " + MyLong.isOdd(ml));
		System.out.println("The value is prime? " + MyLong.isPrime(ml));
		
		System.out.println("Are they equal? " + ml.equals(7));
	    System.out.println("Are they equal? " + ml.equals(ml));
	  	
	    String s = "123";
	    char[] charArray = {'1', '2', '3'};
	    System.out.println(s + " to long value is " + MyLong.parseLong(charArray));
	    System.out.println(s + " to long value is " + MyLong.parseLong(s));
  }
}