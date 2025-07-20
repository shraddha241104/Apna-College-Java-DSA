
public class Ass3 {

    public static void stockPrice(int arr[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > buyPrice) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }
        System.out.println("Maximum profit = " + maxProfit);
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        stockPrice(prices);
    }
}
