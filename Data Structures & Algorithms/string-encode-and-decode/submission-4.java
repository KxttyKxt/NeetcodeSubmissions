class Solution {
    // I guess these just have to be unique enough...?
    private static final String DELIMITER = "--;;;/-->";
    private static final String EMPTY_STR_PLACEHOLDER = "!!#T$grfs";
    private static final String EMPTY_LIST_PLACEHOLDER = "{}{WEFGrbfhtgr";

    public String encode(List<String> strs) {
        if (strs.isEmpty())
            return EMPTY_LIST_PLACEHOLDER;

        StringBuilder codeBuilder = new StringBuilder(prepare(strs.getFirst()));
        for (int i = 1; i < strs.size(); i++)
            codeBuilder.append(DELIMITER).append(prepare(strs.get(i)));
        return codeBuilder.toString();
    }

    public List<String> decode(String str) {
        if (str.equals(EMPTY_LIST_PLACEHOLDER))
            return List.of();
        else
            return Arrays.stream(str.split(DELIMITER)).map(s->prepare(s)).toList();
    }

    private static String prepare(String str) {
        return switch (str) {
            case "" -> EMPTY_STR_PLACEHOLDER;
            case EMPTY_STR_PLACEHOLDER -> "";
            default -> str;
        };
    }
}
