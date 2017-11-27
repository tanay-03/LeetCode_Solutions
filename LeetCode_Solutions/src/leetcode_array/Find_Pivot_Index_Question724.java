package leetcode_array;

/**
 * @author Tanay Rashinkar
 * 
 *         Link For Question - 724 
 * 
 *         https://leetcode.com/problems/find-pivot-index/description/
 * 
 *         Description: Given an array of integers nums, write a method that
 *         returns the "pivot" index of this array.
 * 
 *         We define the pivot index as the index where the sum of the numbers
 *         to the left of the index is equal to the sum of the numbers to the
 *         right of the index.
 * 
 *         If no such index exists, we should return -1. If there are multiple
 *         pivot indexes, you should return the left-most pivot index.
 */
public class Find_Pivot_Index_Question724 {

	public int pivotIndex(int[] nums) {

		if (nums == null || nums.length < 3) {
			return -1;
		}
		int lsum = 0, rsum = 0, total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {

			rsum = total - lsum - nums[i];

			if (lsum == rsum) {
				return i;
			}
			lsum += nums[i];
		}
		return -1;
	}
}
