
public class WildcardMatching {

    //O(n*m)
    public static boolean isMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        boolean dp[][] = new boolean[n + 1][m + 1];
        // pattern and string both empty
        dp[0][0] = true;
        // pattern empty only
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        // pattern last '*' - matched * with empty and have to check for rest of pattern i.e. j-1
        for (int j = 1; j < m + 1; j++) {
            dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //ith char == jth char OR jth char == ?
                if ((text.charAt(i - 1) == pattern.charAt(j - 1)) || (pattern.charAt(j - 1) == '?')) {
                    dp[i][j] = dp[i - 1][j - 1];
                    // * as last char in pattern - so * needs to be matched with empty or valid char
                } else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        //text -> n ; pattern -> m
        return dp[n][m];
    }

    public static void main(String args[]) {
        String text = "baaabab";
        String pattern = "*****ba*****ab";
        System.out.println(isMatch(text, pattern));
        System.out.println(isMatch("ab", "**d"));
    }
}
