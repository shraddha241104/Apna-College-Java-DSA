
public class SubArrays {

    public static void PrintSubarrays(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number  of subarrays: " + ts);
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        PrintSubarrays(arr);
    }
}
