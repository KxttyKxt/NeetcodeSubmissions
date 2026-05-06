class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefixBuilder = new StringBuilder(strs[0]);

		for (String s : Arrays.copyOfRange(strs, 1, strs.length)) {
			if (s.isEmpty())
				return "";
			else if (prefixBuilder.length() > s.length())
				prefixBuilder.delete(s.length(), prefixBuilder.length());

			for (int i = 0; i < s.length(); i++)
				if (i < prefixBuilder.length() && prefixBuilder.charAt(i) != s.charAt(i))
					prefixBuilder.delete(i, prefixBuilder.length());
		}

		return prefixBuilder.toString();
    }
}