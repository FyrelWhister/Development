/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */

class Longest_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String Prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!Longest_Prefix.Startwithprefix(strs[i], Prefix)) {
                Prefix = Prefix.substring(0, Prefix.length() - 1);
                if (Prefix.isEmpty()) {
                    return "";

                }
            }
        }
        return Prefix;
    }

    private static boolean Startwithprefix(String str, String prefix) {
        if (str.length() < prefix.length()) {
            return false;
        }
        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}