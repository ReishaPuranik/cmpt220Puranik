import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Main class
public class Main {
	static List<PersonClass> People = new ArrayList<PersonClass>();
	public static void main(String[] args) {
		Scanner InputScan = new Scanner(System.in);
		int PNum = InputScan.nextInt();
		for (int it = 0; it < PNum; it++) {
			String Name = InputScan.next();
			Name = Name.substring(0, Name.length() - 1);
			StringBuilder SB = new StringBuilder();
			while (InputScan.hasNext("class")) {
				int Class;
				String ToTheClass = InputScan.next();
				if (ToTheClass.equals("upper"))
					Class = 3;
				else if (ToTheClass.equals("middle"))
					Class = 2;
				else
					Class = 1;
				SB.append(Class);
			}
			InputScan.next();
			SB.reverse();
			People.add(new PersonClass(Name, SB));
		}
		InputScan.close();
		Collections.sort(People, new ClassComparator());
		for (int it = 0; it < People.size(); it++) {
			System.out.println(People.get(it).NamesMy);
		}
	}
}
