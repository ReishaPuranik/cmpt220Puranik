import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		double speed = 299972458;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value for mass: ");
		double mass = input.nextInt();
		double energy = mass * (Math.pow(speed, 2));
		System.out.print(energy);

	}

}
