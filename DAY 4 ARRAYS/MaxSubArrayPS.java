
public class MaxSubArrayPS {

    public static void MaxSubArraySumPS(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maximum subarray sum: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        MaxSubArraySumPS(arr);
    }
}
