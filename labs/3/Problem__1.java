import java.util.Scanner;

public class Problem__1 {

	public static void main(String[] args) {
		int even = 0;
		int sum = 0;
		int count = -1;
		int i = 1;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a positive integer, the input ends with a 0: ");
		while (i != 0) {
			i = reader.nextInt();
			sum += i;
			if ((i % 2 == 0) && i != 0) {
				even++;	
			} count++;
		} System.out.println("The average is: " + sum/count);
		System.out.println("The sum is: " + sum);
		System.out.println("The number of even numbers is: " + even);		

	}

}