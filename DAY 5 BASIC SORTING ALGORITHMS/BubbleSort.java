
public class BubbleSort {

    public static boolean bubbleSort(int arr[]) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap > 0) {
                isSorted = false;
            }
            if (swap == 0) {
                break;
            }
        }
        return isSorted;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 1, 4, 3, 2};
        int arr2[] = {1, 2, 3, 4, 5}; // TESTED WITH SORTED ARRAY
        boolean wasSorted = bubbleSort(arr);
        printArray(arr);
        if (wasSorted) {
            System.out.println("Array is already sorted");
        }
    }
}
