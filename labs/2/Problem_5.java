import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = input.next();
		System.out.println("Enter a second string: ");
		String s2 = input.next();
		if (s1.compareTo(s2) < 0) {
			System.out.println(s1);
			System.out.println(s2);
			
		} else {
			System.out.println(s2);
			System.out.println(s1);
		}
		

	}

}
