import java.util.Random;
public class P5 {

	public static void main(String[] args) {
		Random r = new Random();
		int sum = 0;
		int array[] = new int[1000];
		for (int i=0; i<array.length; i++) {
			array[i] = r.nextInt();
		}
		for (int i=0; i<array.length; i++) {
			sum = sum + array[i];
		}
		sum = sum/1000;
		System.out.print("Numbers lower than average: ");
		for (int i=0; i<array.length; i++) {
			if (array[i] < sum) {
				System.out.println(array[i]);
			}
		}
		System.out.print("Numbers higher than average: ");
		for (int i=0; i<array.length; i++) {
			if (array[i] > sum) {
				System.out.println(array[i]);
	}

}}}

