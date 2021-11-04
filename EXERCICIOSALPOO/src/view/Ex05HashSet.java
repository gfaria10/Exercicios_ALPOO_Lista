package view;

import java.util.HashSet;
import java.util.Set;

class Ex05HashSet {

	public static void main(String[] args)
	{

		Set<Integer> hs = new HashSet<>();

		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);

		hs.add(4);

		for (Integer temp : hs) {
			System.out.print(temp + " ");
		}
	}
}
