class Solution {
    public int appendCharacters(String s, String t) {
        String workingSequence = s;
		int toAppend = t.length();

		for (char c : t.toCharArray()) {
			int index = workingSequence.indexOf(c);

			if (index == -1) {
				return toAppend;
			}
			else {
				workingSequence = workingSequence.substring(index + 1);
				toAppend--;
			}
		}

		return 0;
    }
}