import java.util.Random;

public class P2 {

	public static void main(String[] args) {
		char matrix [][] = new char[5][5];
		char i, j;
		Random random = new Random();
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				matrix[i][j] = (char) (random.nextInt(26) + 'a' + j);	
			}
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");	
			} 
			System.out.println();
		}
		
		
		
			
	}
}
		
	
		