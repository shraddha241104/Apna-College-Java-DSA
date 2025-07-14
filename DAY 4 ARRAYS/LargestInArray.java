
public class LargestInArray {

    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 9, 8, 4};
        int ans = getLargest(arr);
        System.out.println("The largest element in array: " + ans);
    }
}
