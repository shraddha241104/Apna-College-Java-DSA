
public class SmallestInArray {

    public static int getSmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 9, 8, 4};
        int ans = getSmallest(arr);
        System.out.println("The smallest element in array: " + ans);
    }
}
