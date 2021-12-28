/*
   Time Complexity - O(N ^ 2)
   Space Complexity - O(K)

   where N is the length of the given string
   and K is the number of distinct characters in the string.
*/
package Advance;
import java.util.HashSet;
import java.util.Set;
class Solution {
	public static String shortestSubstring(String s) {
		int n = s.length();
		int startIndex = 0;
		int minLength = n;
		// Set to count distinct characters.
		Set<Character> m = new HashSet<>();
		for (int i = 0; i < n; i++) {
			m.add(s.charAt(i));
		}
		int distinctChar = m.size();
		for (int i = 0; i < n; i++) {
			int count;
			// Set to count distinct characters in the window.
			Set<Character> visited = new HashSet<>();

			for (int j = i; j < n; j++) {
				visited.add(s.charAt(j));

				count = visited.size();

				if (count == distinctChar) {
					if (j - i + 1 < minLength) {
						minLength = j - i + 1;
						startIndex = i;
					}
				}
			}
		}

		return s.substring(startIndex, startIndex + minLength);
	}

}
