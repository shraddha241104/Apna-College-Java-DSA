
public class Ass2 {

    public static int pivotIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if (arr[start] <= arr[mid]) {//1st half sorted 
                    if (arr[start] <= target && target <= arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (arr[mid] <= target && target <= arr[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(pivotIndex(arr, target));
    }
}
