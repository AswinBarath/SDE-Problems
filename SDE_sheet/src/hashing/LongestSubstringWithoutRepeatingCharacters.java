package hashing;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcaabcdba"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> mpp = new HashMap<>();
		
		int left = 0, right = 0;
		int n = s.length();
		int len = 0;
		while(right < n) {
			if(mpp.containsKey(s.charAt(right)))
				left = Math.max(mpp.get(s.charAt(right)) + 1, left);
			mpp.put(s.charAt(right), right);
			len = Math.max((right - left + 1), len);
			right++;
		}
		return len;
	}
}
