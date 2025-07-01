
import java.util.Scanner;

public class TypeCasting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        int number2 = (int) number;
        System.out.println(number2);
        sc.close();

        char ch = 'a';
        int number3 = ch;//in java its possible to type cast char into int
        System.out.println(number3);//ASCII VALUE
    }

}
