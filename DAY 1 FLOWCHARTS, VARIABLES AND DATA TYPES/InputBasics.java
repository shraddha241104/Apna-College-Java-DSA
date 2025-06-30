
import java.util.Scanner;

public class InputBasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // used when input is only one word
        System.out.println(input);
        String input2 = sc.nextLine();//used when input is multiple words
        System.out.println(input2);
        int number = sc.nextInt();// used to take number as input
        System.out.println(number);
        float price = sc.nextFloat();
        System.out.println(price);
    }
}
