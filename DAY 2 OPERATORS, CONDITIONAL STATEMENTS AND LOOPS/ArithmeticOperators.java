
import java.util.*;

public class ArithmeticOperators {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        int a = sc.nextInt();
        System.out.print("Enter the second operand: ");
        int b = sc.nextInt();
        System.out.println("Operands are " + a + " and " + b);
        float sum = a + b;
        float difference = a - b;
        float product = a * b;
        float division = a / b;
        float modulo = a % b;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Divsion = " + division);
        System.out.println("Modulo(remainder) = " + modulo);
        sc.close();
    }
}
