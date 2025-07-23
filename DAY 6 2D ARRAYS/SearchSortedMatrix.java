
public class SearchSortedMatrix {

    public static boolean searchSortedMatrix(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("key found at (row,col) = (" + row + "," + col + ")");
                return true;
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found in matrix");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 33;
        searchSortedMatrix(matrix, key);
    }
}
