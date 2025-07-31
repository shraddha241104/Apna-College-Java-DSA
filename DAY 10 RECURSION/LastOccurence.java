
import java.util.*;

public class LastOccurence {

    public static int lastOccur(int arr[], int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, idx + 1);
        if (isFound == -1 && arr[idx] == key) {
            return idx;
        }
        return isFound;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 5, 4, 7, 6, 5, 8};
        int key = sc.nextInt();
        int idx = 0;
        System.out.println(lastOccur(arr, key, idx));
    }
}
