
import java.util.Arrays;

public class InbuiltSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, 0, 3);
        printArray(arr);
        System.out.println();
        Arrays.sort(arr);
        printArray(arr);
    }
}
