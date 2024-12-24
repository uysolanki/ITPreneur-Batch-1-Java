package day4;

import java.util.Comparator;

public class StudentRnoComparator implements Comparator<NewStudent> {

	@Override
	public int compare(NewStudent s1, NewStudent s2) {
		if (s1.getRno() > s2.getRno())
			return 1;
		else if (s1.getRno() < s2.getRno())
			return -1;
		else
			return 0;

	}

}
