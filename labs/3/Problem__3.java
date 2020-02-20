
public class Problem__3 {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		for(i = 1; i <= 100; i++) {
			System.out.print((char)i);
			count++;
			if (count == 20) {
				System.out.println();
				count = 0;
			}
		} 

	}

}
