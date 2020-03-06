import java.util.Scanner;
public class Prob5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.println("Enter a value for how many columns and rows you would like in your matrix: ");
		size = input.nextInt();
		int matrix[][] = new int[size][size];
		System.out.println("Enter the values to be insterted into the matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = input.nextInt();
			} 
		}
		System.out.println("This is the original matrix: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("This is the transpose of the matrix: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}