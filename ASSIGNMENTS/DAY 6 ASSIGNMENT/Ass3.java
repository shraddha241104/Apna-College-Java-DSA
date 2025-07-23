
public class Ass3 {

    public static void transposeMatrix(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int transpose[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        transposeMatrix(arr);
    }
}
