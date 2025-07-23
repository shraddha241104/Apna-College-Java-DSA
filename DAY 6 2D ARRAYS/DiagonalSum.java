
public class DiagonalSum {

    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                //pd
                if (i == j) {
                    sum += arr[i][j];
                } //sd
                else if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSumOptimized(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //pd
            sum += arr[i][i];
            //sd
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int sum = diagonalSum(matrix);
        System.out.println("primary diagonal sum + secondary diagonal sum = " + sum);
        int sum2 = diagonalSumOptimized(matrix);
        System.out.println("primary diagonal sum + secondary diagonal sum = " + sum2);
    }
}
