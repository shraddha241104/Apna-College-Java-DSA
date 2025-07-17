
public class MaxSubArrayBF {

    public static void BFMaxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                    if (currSum > maxSum) {
                        maxSum = currSum;
                    }
                }
                System.out.print(currSum + " ");
            }
        }
        System.out.println("; max subarray sum: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        int arr2[] = {1, -2, 6, -1, 3};
        BFMaxSubArraySum(arr);
        BFMaxSubArraySum(arr2);
    }
}
