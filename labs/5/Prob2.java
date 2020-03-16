import java.util.Scanner;
public class Prob2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[] = new double[10];
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println(mean(array));
		System.out.println(deviation(array));
	}
	public static double deviation(double[] x) {
		double sum2 = 0;
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = x[i] + sum;
		}
		sum = sum/10;
		for (int i = 0; i < x.length; i++) {
			sum2 = Math.pow(x[i] - sum, 2) + sum2;
		}
		sum2 = sum2/(x.length - 1);
		return Math.sqrt(sum2);		
	}
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = x[i] + sum;
		}
		sum = sum/10;
		return sum;
	}
}
