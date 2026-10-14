class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        build(num, sum, ans);
        return ans.toString();
    }
    void build(int num, int sum, StringBuilder ans) {
        if (num == 0) {
            return;
        }
        int digit = Math.min(sum, 9);
        ans.append(digit);
        build(num - 1, sum - digit, ans);
    }
}
