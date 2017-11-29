package leetcode_array;

/**
 * @author Tanay Rashinkar
 * 
 *         Link For Question - 674
 * 
 *         https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 * 
 *         Description: Given an unsorted array of integers, find the length of
 *         longest continuous increasing subsequence.
 */
public class Longest_Continuous_Increasing_Subsequence_Question674 {
	public int findLengthOfLCIS(int[] nums) {

		if (nums == null) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int longestLength = 0;
		int currentLength = 0;
		int previous = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			if (current > previous) {
				currentLength++;
			} else {
				longestLength = Math.max(longestLength, currentLength);
				currentLength = 1;
			}
			previous = current;
		}
		longestLength = Math.max(longestLength, currentLength);
		return longestLength;
	}
}
