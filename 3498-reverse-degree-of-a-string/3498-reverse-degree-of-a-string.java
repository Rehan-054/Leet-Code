class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int index = 1;
        for(char ch : s.toCharArray()){
            int x = ch - 71;
            int w = 52 - x;
            int internal_sum = index * w;
            index++;
            sum += internal_sum;
        }
        return sum;
    }
}