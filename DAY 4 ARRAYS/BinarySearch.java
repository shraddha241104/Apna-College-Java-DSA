
public class BinarySearch {

    public static int BinarySearchArray(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else {
                if (arr[mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 5, 6, 7, 8};
        int key = 30;
        int idx = BinarySearchArray(arr, key);
        int position = idx + 1;
        System.out.println("index of " + key + " in array is: " + idx);
        System.out.println("position of " + key + " in array is: " + position);
    }
}
