// Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        boolean b = true;
        char[] s = String.valueOf(x).toCharArray();
        for (int i = 0; i < s.length / 2; i++) {
            if (s[i] != s[s.length - i - 1]) {
                b = false;
            }

        }
        return b;
    }
}