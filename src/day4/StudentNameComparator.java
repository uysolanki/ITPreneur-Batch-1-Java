package day4;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<NewStudent> {

	@Override
	public int compare(NewStudent s1, NewStudent s2) {
		return s1.getSname().compareTo(s2.getSname());
	}

}
