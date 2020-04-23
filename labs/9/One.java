import java.util.Scanner;
import java.util.Random;
public class One {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int randNum;
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			randNum = random.nextInt(100);
			array[i] = randNum;
		} 
		System.out.println("Enter the index of the array: ");
		int index = input.nextInt();
		try {
			System.out.println("Element at index " + index + " is " + array[index]);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Out of bounds");
}
}
}
