/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
 */

class LeetCode1281 {
    public int subtractProductAndSum(int n) {
        String str = Integer.toString(n);
        int product = 1;
        int sum = 0;
        for (int i=0; i < str.length(); i++) {
            char c = str.charAt(i);
            int a = Integer.parseInt(String.valueOf(c));
            sum =  sum + a;
            product = product * a;
        }
        return product - sum;
    }
}