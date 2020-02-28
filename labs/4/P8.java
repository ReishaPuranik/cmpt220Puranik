import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, input;
		int seq[] = new int[100];
		System.out.println("Enter up to 100 positive real numbers and 0 to end: ");
		input = sc.nextInt();
		while(input != 0 && num<100) {
			seq[num] = input;
			num++;
			input = sc.nextInt();
		}
		for (int i = 1; i < num; ++i) {
			int currentVal = seq[i];
			int j = i-1;
			while (j>= 0 && seq[j] > currentVal) {
				seq[j+1] = seq[j];
				j = j-1;
			}
			seq[j+1] = currentVal;
		}
		System.out.println("The numbers from smallest to largest are: ");
		for (int i= 0; i < num; i++) {
			System.out.print(seq[i] + " ");
			System.out.println();
			sc.close();
		}
	}
}
