import java.util.Scanner;

public class Problem__6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = input.nextLine();
		System.out.print(count(text.toUpperCase()));

	}
	public static int count(String a) {
		int count = 0;
		for (int i = 0;i < a.length(); i++) {
			if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
				count++;
			}
		} return count;
	}

}
