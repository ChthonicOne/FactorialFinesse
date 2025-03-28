package net;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FactFinesse {

	public static void main(String[] args) {
		int nextFact = 4;
		List<Long> factList = new ArrayList<>();
		factList.add(24l); // 4!  This is the first valid factorial there exists a solution for.
		long upper = (long) (factList.get(nextFact - 4) * 2) - 2 * nextFact;
		while (true) {
			long halfLower = upper/2 - nextFact; // The lower number is always 2*n lower than the upper number where n!
			System.out.println(String.format(Locale.US, "%d - %d * 0.5 = %d!", (long)upper, (long)halfLower * 2, nextFact));
			nextFact++;
			if ((double) factList.get(nextFact - 5) * nextFact < Long.MAX_VALUE) {
				factList.add(factList.get(nextFact - 5) * nextFact);
				upper = (long) (factList.get(nextFact - 4) * 2) - 2 * nextFact; // The number we are searching for approaches 2x n! as n-> infinity
			} else {
				break;
			}
		}
	}
}
