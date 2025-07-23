
public class Ass2 {

    public static int sum(int arr[][]) {
        int i = 1;
        int j = 0;
        int sum = 0;
        while (i == 1 && j <= arr[0].length - 1) {
            sum += arr[i][j];
            j++;
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = sum(arr);
        System.out.println("Sum of the second row = " + sum);
    }
}
