
public class Problem__7 {

	public static void main(String[] args) {
		int count = 0;
		int i = 0;
		for (i = 0; i < 50; i++) {
			System.out.print(pentagonal(i)+ " ");
			count++;
			if (count == 10) {
				System.out.println();
				count = 0;
				
			}
		}

	}
	public static double pentagonal(int A) {
		return ((3*Math.pow(A, 2)-A)/2);
	}

}
