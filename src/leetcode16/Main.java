package leetcode16;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		
		int target = 1;
		
		System.out.println("Input: " + Arrays.toString(nums) + " target: " + target);
		
		FindClosestSumToTargetFunction solution = new FindClosestSumToTargetFunction();
		
		System.out.println("Solution: " + solution.threeSumClosest(nums, target));
	}
}
