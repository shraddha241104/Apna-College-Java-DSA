
import java.util.*;

public class Arrays2DBasic {

    public static boolean searchKey(int arr[][], int key) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    System.out.println(key + " found at (i,j) = (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(key + " not found in matrix");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        // input in matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output in matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchKey(matrix, 5);

    }

}
