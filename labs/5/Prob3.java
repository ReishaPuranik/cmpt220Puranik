import java.util.Scanner;
public class Prob3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int num = input.nextInt();
		
		String names[] = new String[num];
		int score[] = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter a name: ");
			names[i] = input.next();
			System.out.println("Enter their score: ");
			score[i] = input.nextInt();
		}
		
		for (int i = 0; i < num-1; i++) {
			for (int j = 0; j < num-i-1; j++) {
				if (score[j] > score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
					String temp1 = names[j];
					names[j] = names[j+1];
					names[j+1] = temp1;
				}
			}
		}
		
		for (int i = 0; i < num; i++) {
			System.out.println("Their name is: " + names[i]); 
			System.out.println("Their score is: " + score[i]);
		}
	}
}
