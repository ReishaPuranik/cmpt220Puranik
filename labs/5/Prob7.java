import java.util.Scanner;
public class Prob7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for how many columns and rows you would like in your matrix:");
		int rowCol = input.nextInt();
		int array[][] = new int[rowCol][rowCol];
		System.out.println("Enter the values: ");
		for (int i = 0; i < rowCol; i++) {
			for (int j = 0; j < rowCol; j++) {
				array[i][j] = input.nextInt();
			}
		}
		
		if (isUpperTriangular(array)) {
			System.out.println("Yes");
		} else { 
			System.out.println("No");
		}
	}
	
	public static boolean isUpperTriangular(int[][] array) {
		boolean tri = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) { 
				if (array[i][j] != 0) {
					tri = false;
					break;
				}
			}
		}
		return tri;
}
}