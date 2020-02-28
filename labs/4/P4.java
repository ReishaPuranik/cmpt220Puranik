import java.util.Scanner;

public class P4 {
	private static Scanner scan = null;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String str = null;
		System.out.println("Enter a string: ");
		str = scan.nextLine();
		int[] count = new int[255];
		int length = str.length();
		char[] ch = new char[str.length()];
		for (int i = 0; i < length; i++) {
			if (str.charAt(i)<97 || str.charAt(i)>149) 
				continue;
			count[(int)str.charAt(i)]++;
			
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) {
				continue;
				
			}
			System.out.println("Number of occurences of " + (char)i + " letter is: " + count[i]);
		
		}

	}

}
