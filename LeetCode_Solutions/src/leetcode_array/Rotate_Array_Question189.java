
package leetcode_array;

/**
 * @author Tanay Rashinkar
 * 
 *         Link For Question - 189
 * 
 *         https://leetcode.com/problems/rotate-array/description/
 * 
 *         Description: Rotate an array of n elements to the right by k steps.
 * 
 *         For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is
 *         rotated to [5,6,7,1,2,3,4].
 * 
 *         Solution with space complexity O(1) and O(n) time complexity.
 */

public class Rotate_Array_Question189 {

	public void rotate(int[] nums, int k) {

		if (k == 0 || nums == null) {
			return;
		}
		k = k % nums.length;
		reverseArray(nums, 0, nums.length - 1);
		reverseArray(nums, 0, k - 1);
		reverseArray(nums, k, nums.length - 1);
	}

	public static void reverseArray(int[] nums, int left, int right) {
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
}
