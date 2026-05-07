class Solution {
    public boolean isAnagram(String s, String t) {
		for (char inS: s.toCharArray()) {
			int indexInT = t.indexOf(inS);

			if (indexInT == -1)
				return false;
			else
				t = String.format("%s%s", t.substring(0, indexInT), t.substring(indexInT + 1));
		}
		return t.isEmpty();
    }
}
