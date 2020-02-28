
public class P1 {

	public static void main(String[] args) {
		System.out.printf("in" + "     " + "cm" + "   |   "  + "cm" + "     " + "in" + "     ");
		System.out.print("\n---------------------------");
		for (int i = 1, j = 1; i <= 50; i++, j+=5)  {
			System.out.printf("\n%2d",i);
			System.out.printf("%10.2f", i * 2.54);
			System.out.printf("|%2d",j);
			System.out.printf("%10.2f", j / 2.54);
		}
			

	}

}
