import java.util.Scanner;
public class Prob1 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double array[] = new double[10];
			System.out.println("Enter 10 numbers: ");
			for (int i = 0; i < array.length; i++) {
				array[i] = input.nextInt();
			}
			System.out.print(max(array));
		}
		public static double max(double[] array) {
			/*double[] arr = new double[10];
			double max = arr[10];*/
			double max = array[0];
			for (int i = 0; i < array.length; i++) {				
				if (array[i] > max) {
					max = array[i];	
				} 
			} return max; 			
		}
}
