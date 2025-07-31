
import java.util.*;

public class FirstOccurence {

    public static int firstOccur(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        }
        return firstOccur(arr, idx + 1, key);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 3, 2, 7, 5};
        int idx = 0;
        int key = sc.nextInt();
        System.out.println(firstOccur(arr, idx, key));
    }
}
