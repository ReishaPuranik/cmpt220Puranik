import java.util.Arrays;
import java.util.Scanner;
public class Prob4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int size1 = input.nextInt();
		int[] array1 = new int[size1];
		System.out.print("Enter the first array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		System.out.println("Enter the size of the second array: ");
		int size2 = input.nextInt();
		int[] array2 = new int[size2];
		System.out.print("Enter the second array");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();
		}
		if (equal(array1, array2)) {
			System.out.println("The arrays are identical");
		} else {
			System.out.println("The arrays are not identical");
		}
	}
	public static boolean equal(int[] array1, int[] array2) {
		boolean equal = true;
		Arrays.sort(array1);
		Arrays.sort(array2);
		if (array1.length != array2.length) {
			equal = false;
		} else { for (int i = 0; i < array2.length; i++) {
			if (array1[i] != array2[i]) {
				equal = false;
				break;
			} else { 
				equal = true;
			}
		}
			
		} return equal;
	}
}
