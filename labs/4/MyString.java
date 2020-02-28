import java.util.Scanner;

	public class MyString {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String num = input.nextLine();
			System.out.println(num + (isPalindrome(num) ? " is " : " is not ") + "a palindrome.");
		}
		public static String reverse(String num) {
			String reverse = "";
			String a = num + "";
			for (int i = a.length() - 1; i >= 0; i--) {
				reverse += a.charAt(i);
			}
			return (reverse);		
		}
		public static boolean isPalindrome(String num) {
			boolean palin=false;
			if(num.contentEquals(reverse(num)))
				palin=true;
			return palin;		
		}
	}




