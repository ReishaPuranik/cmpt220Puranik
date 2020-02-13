import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char char1 = input.next().charAt(0);
		System.out.println("Enter a second character: ");
		int a = (int)char1;
		char char2 = input.next().charAt(0);
		int b = (int)char2;
		System.out.print(a + b);		
		

	}

}
