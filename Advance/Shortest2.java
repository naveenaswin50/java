/*
    Time Complexity - O(N)
    Space Complexity - O(K)

    where N is the length of the given string.
    and K is the number of distinct characters in the string.
*/
package Advance;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {

	public static String shortestSubstring(String s) {
		int n = s.length();
		int startIndex = 0, minLength = n;

		// Set to count distinct .
		Set<Character> m = new HashSet<>();

		for (int i = 0; i < n; i++) {
			m.add(s.charAt(i));
		}

		int distinctChar = m.size();

		// Map to store frequency of characters in a particular window.
		HashMap<Character, Integer> frequency = new HashMap<>();

		int count = 0;
		int start = 0;

		for (int end = 0; end < n; end++) {

			if (frequency.containsKey(s.charAt(end))) {
				frequency.put(s.charAt(end), frequency.get(s.charAt(end)) + 1);
			} else {
				frequency.put(s.charAt(end), 1);
			}

			// New character inserted.
			if (frequency.get(s.charAt(end)) == 1) {
				count++;
			}

			while (count == distinctChar) {

				if (end - start + 1 < minLength) {
					startIndex = start;
					minLength = end - start + 1;
				}

				frequency.put(s.charAt(start), frequency.get(s.charAt(start)) - 1);
				
				// Character is not present in the window after this.
				if (frequency.get(s.charAt(start)) <= 0) {
					count--;
				}
				
				start++;

			}
		}

		return s.substring(startIndex, startIndex + minLength);
	}
}