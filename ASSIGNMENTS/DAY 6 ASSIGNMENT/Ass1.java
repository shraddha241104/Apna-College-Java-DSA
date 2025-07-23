
public class Ass1 {

    public static int count(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
        int key = 7;
        int count = count(matrix, key);
        System.out.println(key + " appeared " + count + " times");
    }
}
