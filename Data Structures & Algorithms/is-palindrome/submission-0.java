class Solution {
    public boolean isPalindrome(String s) {
        String parsed = s.toLowerCase(Locale.ROOT).replaceAll("\\W*", "");
		
		for (int i = 0; i < parsed.length(); i++)
			if (parsed.charAt(i) != parsed.charAt(parsed.length()-1-i))
				return false;
		
		return true;
    }
}
