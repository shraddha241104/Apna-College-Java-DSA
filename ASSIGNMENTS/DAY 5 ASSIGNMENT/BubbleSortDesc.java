
public class BubbleSortDesc {

    public static boolean bubbleSort(int arr[]) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
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
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // int arr[] = {5, 4, 3, 2, 1}; tested with already sorted array to achieve optimization O(n)
        boolean wasSorted = bubbleSort(arr);
        printArray(arr);
        System.out.println();
        if (wasSorted) {
            System.out.println("Array was already sorted");
        }
    }
}
