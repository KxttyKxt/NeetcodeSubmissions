class Solution {
    // This seems like a good place to note that
    //  there is a question before this one in NeetCode All 
    //  that links out to LeetCode called "Circular Sentence".

    // You can find that submission below:
    // https://leetcode.com/problems/circular-sentence/submissions/1998381748/

    public int maxScore(String s) {
        int N = s.length();
		int[] zeroesFromLeft = new int[s.length() - 1];
		int[] onesFromRight = new int[s.length() - 1];

		int countZeroes = 0, countOnes = 0;
		for (int pivotLeft = 0; pivotLeft < N - 1; pivotLeft++) {
			int pivotRight = N - pivotLeft - 1;
			if (s.charAt(pivotLeft) == '0')
				countZeroes++;
			if (s.charAt(pivotRight) == '1')
				countOnes++;

			zeroesFromLeft[pivotLeft] = countZeroes;
			onesFromRight[pivotRight-1] = countOnes;
		}

		int maxScore = 0;
		for (int i = 0; i < zeroesFromLeft.length; i++)
			maxScore = Math.max(maxScore, zeroesFromLeft[i] + onesFromRight[i]);
		return maxScore;
    }
}