import java.util.Random;
import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for a lower limit integer: ");
		int lowerLimit = input.nextInt();
		System.out.println("Enter a value for a upper limit integer: ");
		int upperLimit = input.nextInt();
		//int equation = (int)(Math.random() * (upperLimit - lowerLimit));
		Random random = new Random();
		int a = random.nextInt((upperLimit - 1) - lowerLimit)+ lowerLimit + 1;
		int b = random.nextInt((upperLimit - 1) - lowerLimit)+ lowerLimit + 1;
		int c = random.nextInt((upperLimit -1) - lowerLimit)+ lowerLimit + 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		

	}

}
