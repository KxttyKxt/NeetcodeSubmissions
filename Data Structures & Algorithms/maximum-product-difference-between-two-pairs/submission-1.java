class Solution {
    // This seems like a good place to note that
    //  there is a question before this one in NeetCode All 
    //  that links out to LeetCode called "Destination City".

    // You can find that submission below:
    // https://leetcode.com/problems/destination-city/submissions/1998360498/

    public int maxProductDifference(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		return (nums[len-1] * nums[len-2]) - (nums[0] * nums[1]);
    }
}