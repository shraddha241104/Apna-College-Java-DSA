
public class RodCutting {

    public static int maxProfit(int length[], int price[], int totRod) {
        int n = length.length;
        int w = totRod;
        int dp[][] = new int[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < w + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (length[i - 1] <= j) {
                    int incRod = price[i - 1] + dp[i][j - length[i - 1]];
                    int excRod = dp[i - 1][j];
                    dp[i][j] = Math.max(incRod, excRod);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String args[]) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int totRod = 8;
        System.out.println(maxProfit(length, price, totRod));
    }
}
