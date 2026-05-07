class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String citizen : details)
            if (Integer.parseInt(citizen.substring(11, 13)) > 60)
                count++;

        return count;
    }
}