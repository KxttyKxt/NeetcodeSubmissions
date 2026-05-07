class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
			return false;

		int len = s.length();
		List<Character> sChars = new ArrayList<>(len);
		List<Character> tChars = new ArrayList<>(len);
		int[] sMorphs = new int[len];
		int[] tMorphs = new int[len];

		for (int i = 0; i < len; i++) {
			char fromS = s.charAt(i);
			char fromT = t.charAt(i);

			if (!sChars.contains(fromS))
				sChars.add(fromS);
			if (!tChars.contains(fromT))
				tChars.add(fromT);

			sMorphs[i] = sChars.indexOf(fromS);
			tMorphs[i] = tChars.indexOf(fromT);

			if (!Arrays.equals(sMorphs, tMorphs))
				return false;
		}

		return true;
    }
}