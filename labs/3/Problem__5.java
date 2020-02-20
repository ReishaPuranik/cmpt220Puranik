import java.util.Scanner;

public class Problem__5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a = input.nextDouble();
		System.out.println("Enter the second number: ");
		double b = input.nextDouble();
		System.out.println("Enter the third number: ");
		double c = input.nextDouble();
		System.out.print(average(a, b, c));

	}
	public static double average(double a, double b, double c) {
		double sum = (a + b + c)/3; 
		return sum;
	}

}
