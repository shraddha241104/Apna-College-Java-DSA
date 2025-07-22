
import java.util.*;

public class InbuiltSort2 {

    public static void printArray(Integer arr[]) {
        for (Integer arr1 : arr) {
            System.out.print(arr1 + " ");
        }
    }

    public static void main(String args[]) {

        Integer arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArray(arr);
        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
