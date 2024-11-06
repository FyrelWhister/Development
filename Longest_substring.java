/* 
Given a string s, find the length of the longest  substring without repeating characters. 
*/
class Longest_substring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char tmpChar;
        int tmpamount = 1, amount = 1;
        String temp = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            tmpChar = s.charAt(i);

            if (!Check_Repeat(temp, tmpChar)) {
                temp = temp + tmpChar;
                tmpamount++;
                if (amount < tmpamount) {
                    amount = tmpamount;
                }
            } else {
                temp = temp.substring(temp.indexOf(tmpChar) + 1) + tmpChar;

                tmpamount = temp.length();
                if (amount < tmpamount) {
                    amount = tmpamount;
                }

            }

        }
        return amount;
    }

    private static Boolean Check_Repeat(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                return true;
            }

        }
        return false;
    }

}