
public class Ass1 {

    public static boolean checkRepetition(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count >= 2) {
                return true;
            }
            count = 0;
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
