
public class Problem__4 {

	public static void main(String[] args) {
		int n = 0;
		int largestNum = 0;
		for (int i = 2 ; i < 15000; i++) {
			if (isPrime(i)) {
				if (i>largestNum) {
					largestNum = i;
				}
				
			}
		} System.out.print(largestNum);
		

	}
	static boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if (n%i == 0)
				return false;
			
		}
		return true;
	}

}
