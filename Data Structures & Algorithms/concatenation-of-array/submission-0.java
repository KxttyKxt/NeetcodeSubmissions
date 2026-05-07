class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concatNums = new int[nums.length * 2];
		for (int i = 0; i < nums.length * 2; i++)
			concatNums[i] = nums[i % nums.length];
		return concatNums;
    }
}