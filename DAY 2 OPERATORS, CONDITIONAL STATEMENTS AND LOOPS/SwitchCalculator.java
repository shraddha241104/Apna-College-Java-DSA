import java.util.*;
public class SwitchCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of b: ");
        float b = sc.nextFloat();
        System.out.print("Enter the Operator: ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+': System.out.println(a+" + "+b+" = "+(a+b));
                        break;
            case '-': System.out.println(a+" - "+b+" = "+(a-b));
                        break;
            case '*': System.out.println(a+" * "+b+" = "+(a*b));
                        break;
            case '/': System.out.println(a+" / "+b+" = "+(a/b));
                        break;
            case '%': System.out.println(a+" % "+b+" = "+(a%b));
                        break;
            default:System.out.println("Operator not found!");
        }
        sc.close();
    }
}
