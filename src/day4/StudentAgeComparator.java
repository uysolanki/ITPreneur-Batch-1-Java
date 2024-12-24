package day4;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<NewStudent>
{

	@Override
	public int compare(NewStudent s1, NewStudent s2) {
		if (s1.getAge() > s2.getAge())
			return 1;
		else if (s1.getAge() < s2.getAge())
			return -1;
		else
			return 0;

	}

}
