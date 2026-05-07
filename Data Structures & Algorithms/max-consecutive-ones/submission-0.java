class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int consecutiveOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                consecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
            } else {
                consecutiveOnes = 0;
            }
        }

        return maxConsecutiveOnes;
    }
}