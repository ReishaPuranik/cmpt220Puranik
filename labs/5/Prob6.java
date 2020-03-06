import java.util.Scanner;
public class Prob6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for how many columns and rows you would like in your matrix:");
		int rows = input.nextInt();
		int col = rows;
		double matrix[][] = new double[rows][col];
		System.out.println("Enter four elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the row number that you would like to calculate the average of: ");
		int rowNum = input.nextInt();
		System.out.println("The average of the values are: " + averageRow(matrix,rowNum));
	}
	public static double averageRow(double[][] array, int row) {
		double sum = 0;
		for (int i = 0; i < array[row].length; i++) {
			sum += array[row][i];
			
		}
		return sum/array[row].length;	
	}
}
