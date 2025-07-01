
import java.util.*;

public class UnaryOperators {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pre increment
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        int A = ++a;
        System.out.println("Value of a: " + a);
        System.out.println("Value of A: " + A);
        //post increment
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int B = b++;
        System.out.println("Value of b: " + b);
        System.out.println("Value of B: " + B);
        //pre decrement
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        int C = --c;
        System.out.println("Value of c: " + c);
        System.out.println("Value of C: " + C);
        //post decrement
        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();
        int D = d--;
        System.out.println("Value of d: " + d);
        System.out.println("Value of D: " + D);
        sc.close();

    }

}
