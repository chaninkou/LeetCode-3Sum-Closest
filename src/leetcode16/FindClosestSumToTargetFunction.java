package leetcode16;

import java.util.Arrays;

public class FindClosestSumToTargetFunction {
	public int threeSumClosest(int[] nums, int target) {
		// Sort in order to do linear search
        Arrays.sort(nums);
        
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        
        // Use i as one pointer, move the right two pointers to get the closest sum
        for(int i = 0; i < nums.length - 2; i++){
        	// Skipping any duplicates
            if(i == 0 || nums[i] != nums[i - 1]){
            	// sliding windows method
                int start = i + 1;
                int end = nums.length - 1;
                
                while(start < end){
                    int sum = nums[i] + nums[start] + nums[end];
                    
                    if(sum > target){
                        end--;
                    } else if (sum < target){
                        start++;
                    } else{
                    	// if exact sum, just return it
                        return sum;
                    }
                    
                    // This is get the closest sum
                    if(Math.abs(sum - target) < Math.abs(result - target)){
                        result = sum;
                    }
                }
                
            }
        }
        
        return result;
    }
}
