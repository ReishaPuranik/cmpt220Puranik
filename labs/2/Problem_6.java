import java.util.Random;

public class Problem_6 {

	public static void main(String[] args) {
		System.out.print("(");
		Random random = new Random();
		System.out.print(random.nextInt((9 - 1) - 2) + 2 + 1);
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		System.out.print(")");
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		System.out.print("-");
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		
		

	}

}
