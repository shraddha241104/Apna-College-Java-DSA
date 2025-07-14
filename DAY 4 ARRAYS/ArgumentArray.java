
public class ArgumentArray {

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 5;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int nonChangeable = 10;
        int marks[] = {97, 98, 99};
        update(marks, nonChangeable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); // only arrays passed by reference
        }
        System.out.println();
        System.out.println(nonChangeable);
    }
}
