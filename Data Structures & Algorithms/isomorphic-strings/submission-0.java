class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
			return false;

		int length = s.length();

		List<Character>
				sChars = new ArrayList<>(length),
				tChars = new ArrayList<>(length);
		int[]
				sMorphs = new int[length],
				tMorphs = new int[length];

		for (int i = 0; i < length; i++) {
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