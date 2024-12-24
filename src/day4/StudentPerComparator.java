package day4;

import java.util.Comparator;

public class StudentPerComparator implements Comparator<NewStudent>
{

	@Override
	public int compare(NewStudent s1, NewStudent s2) {
		if (s1.getPer() > s2.getPer())
			return -1;
		else if (s1.getPer() < s2.getPer())
			return 1;
		else
			return 0;

	}

}
