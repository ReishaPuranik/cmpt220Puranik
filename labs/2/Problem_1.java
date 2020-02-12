import java.util.Scanner;

public class Problem_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for number 1: ");
		double number1 = input.nextDouble();
		System.out.println("Enter a value for number 2: ");
		double number2 = input.nextDouble();
		boolean a = number1 < number2;
		System.out.println(number1 + " is LESS THAN " + number2 + "? " + a);
		boolean b = number1 <= number2;
		System.out.println(number1 + " is LESS THAN or EQUAL TO " + number2 + "? " + b);
		boolean c = number1 == number2;
		System.out.println(number1 + " is EQUAL TO " + number2 + "? " + c);
		boolean d = number1	!= number2;
		System.out.println(number1 + " is NOT EQUAL TO " + number2 + "? " + d);
		boolean e = number1 > number2;
		System.out.println(number1 + " is GREATER THAN " + number2 + "? " + e);
		boolean f = number1 >= number2;
		System.out.println(number1 + " is GREATER THAN or EQUAL TO " + number2 + "? " + f);
	}
		
}