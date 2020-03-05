import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter: ");
		int size = input.nextInt();
		int intArray[] = new int[size];
		String numbers;
		System.out.print("Enter the numbers: ");
		for(int i=0; i < size; i++) {
			intArray[i] = input.nextInt();
		}
		System.out.print(removeDuplicates(intArray, size));
		
	}
	public static String removeDuplicates(int arr[], int n) {
			int duplicates = 0;
			String numb = "";
				if (n == 0 || n == 1) {
				return "";
			}
			// JA: Thois does not work. Some comments would help to understand what you are doing.
			for (int i = 0; i < n; i++) {
				int temp = arr[i];
				for (int j = 0; j < n; j++) {
				if (temp == arr[j]) {
					duplicates++;
				}
				}
				if (duplicates == 1) {
					numb += temp;
					numb += ", ";
				}
				duplicates = 0;
			}

			return numb;
		}

}


