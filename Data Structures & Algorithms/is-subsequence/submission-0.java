class Solution {
    public boolean isSubsequence(String s, String t) {
        String workingSequence = t;
		for (char letter : s.toCharArray()) {
			int index = workingSequence.indexOf(letter);

			if (index == -1)
				return false;
			else
				workingSequence = workingSequence.substring(index + 1);
		}
		return true;
    }
}