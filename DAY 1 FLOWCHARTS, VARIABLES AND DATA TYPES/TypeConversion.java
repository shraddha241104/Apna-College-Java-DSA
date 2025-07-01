
import java.util.Scanner;

public class TypeConversion {

    public static void main(String args[]) {
        int a = 10;
        long b = a;
        System.out.println(b);

        /*long c = 12;
        int d = c;*/ //not possible to convert bigger data type to smaller one 
        float c = 21.3f;
        double d = c;
        System.out.println(d);

        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
        sc.close();
    }
}
