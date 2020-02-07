import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a value for ounces: ");
		double ounces = input.nextDouble();
		double ouncesToGramsEquation = 28.3495 * ounces;
		System.out.println(ounces + " ounces is" + ouncesToGramsEquation);

	}

}
