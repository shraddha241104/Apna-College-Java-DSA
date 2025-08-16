
public class Ass2 {

    public static int countInRange(int arr[], int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i < hi; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majorityElementRec(int arr[], int lo, int hi) {
        if (lo == hi) {
            return arr[lo];
        }
        int mid = lo + (hi - lo) / 2;
        int left = majorityElementRec(arr, lo, mid);
        int right = majorityElementRec(arr, mid + 1, hi);
        if (left == right) {
            return left;
        }
        int leftCount = countInRange(arr, left, lo, hi);
        int rightCount = countInRange(arr, right, lo, hi);
        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int nums[]) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String args[]) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.print(majorityElement(arr));
    }
}
