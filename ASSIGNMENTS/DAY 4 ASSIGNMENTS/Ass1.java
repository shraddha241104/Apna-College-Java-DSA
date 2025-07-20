
public class Ass1 {

    public static boolean checkRepetition(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 1};
        int arr2[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int arr3[] = {1, 2, 3, 4};
        System.out.println(checkRepetition(arr));
        System.out.println(checkRepetition(arr2));
        System.out.println(checkRepetition(arr3));
    }
}
