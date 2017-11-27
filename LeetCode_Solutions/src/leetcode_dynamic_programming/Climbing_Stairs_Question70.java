package leetcode_dynamic_programming;

/**
 * @author Tanay Rashinkar
 * 
 *         Link For Question - 70
 * 
 *         https://leetcode.com/problems/climbing-stairs/description/
 * 
 *         Description: You are climbing a stair case. It takes n steps to reach
 *         to the top.
 * 
 *         Each time you can either climb 1 or 2 steps. In how many distinct
 *         ways can you climb to the top?
 * 
 *         Note: Given n will be a positive integer.
 */
public class Climbing_Stairs_Question70 {

	public int climbStairs(int n) {
		return fibonacci(n + 1);
	}

	public static int fibonacci(int n) {
		int x = 0;
		int y = 1;
		int z = 1;

		for (int i = 0; i < n; i++) {
			x = y;
			y = z;
			z = x + y;
		}
		return x;
	}

}
