import java.io.*;
import java.util.*;
public class FileProb1 {
	public static void main(String[] args) throws Exception {
		int N = 100;
    
    File file = new File("Exercise10_1.txt");
    file.createNewFile();
	
    // Write random numbers
		if (file.exists()) {
			PrintWriter output = new PrintWriter(new File("Exercise10_1.txt"));
			int randNum = 0;
			Random random = new Random();
			for (int i = 0; i < N; i++) {
				randNum = random.nextInt(N);
				output.print(randNum + " ");
			}
			output.close();
		}
    
    // Read the numbers
    int[] numbers = new int[N];
		Scanner input = new Scanner(new File("Exercise10_1.txt"));
    int i = 0;
		while (input.hasNext()) {
			numbers[i] = Integer.parseInt(input.next());
      i += 1;
		}
		Arrays.sort(numbers);
		for (i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		input.close();
	}
}