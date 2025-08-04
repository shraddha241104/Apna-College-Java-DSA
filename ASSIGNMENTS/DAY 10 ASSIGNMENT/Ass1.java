
import java.util.*;

public class Ass1 {

    public static void findIndices(int arr[], int key, int idx) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        findIndices(arr, key, idx + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 2, 5, 2, 7};
        int key = sc.nextInt();
        int idx = 0;
        findIndices(arr, key, idx);
    }
}
