class Solution {
    public int maxArea(int[] heights) {
        int mostWater = 0;

		for (int i = 0; i < heights.length; i++)
			for (int j = heights.length - 1; j > i; j--)
				mostWater = Math.max(mostWater, (Math.min(heights[i], heights[j])) * (j - i));

		return mostWater;
    }
}
