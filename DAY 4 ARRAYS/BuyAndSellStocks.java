
public class BuyAndSellStocks {

    public static int bnsStocks(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = bnsStocks(prices);
        System.out.println("Maximum profit = " + maxProfit);
    }
}
