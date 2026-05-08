class Solution {
    private static final char DELIMITER = '#';

    public static String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) builder.append(str.length()).append(DELIMITER).append(str);
        return builder.toString();
    }

    public static List<String> decode(String str) {
        List<String> toReturn = new ArrayList<>();

        for (int i = 0; i < str.length();) {
            int j = i;
            while (str.charAt(j) != DELIMITER) j++;

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;

            toReturn.add(str.substring(i, j));
            i = j;
        }

        return toReturn;
    }
}
