import java.util.Comparator;

public class Class implements Comparator<PeopleClass> {

	public int compare(PeopleClass c1, PeopleClass c2) {
		int CompareClass = compareClasses(c1, c2);
		if (CompareClass < 0) {
			return 1;
		} else if (CompClass == 0) {
			int CompName = c1.Name.compareTo(c2.Name);
			if (ComName < 0) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return -1;
		}
}

	private int compareClasses(PersonClass c1, PersonClass c2) {
		StringBuilder c1Value = new StringBuilder(c1.Class.toString());
		StringBuilder c2TempVal = new StringBuilder(c2.Class.toString());
		int c1LengthValues = c1Value.length();
		int c2LengthValues = c2TempVal.length();
		int diff = Math.abs(p1LengthValues - p2LengthValues);
		if (c1LengthValues > c2LengthValues) {
			for (int it = 0; it < diff; it++) {
				c2TempVal.append(2);
			}
		} else if (c1LengthValues < c2LengthValues) {
			for (int it = 0; it < diff; it++) {
				c1TempVal.append(2);
			}
		}
		return c1TempVal.toString().compareTo(c2TempVal.toString());
	}
}
