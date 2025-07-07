import java.util.*;
public class FactorialByFunction {
    public static int factorial(int num){
        int f = 1;
        for(int i = 1;i<=num;i++){
            f =f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int factorial = factorial(a);
        System.out.println("factorial = "+factorial);
        sc.close();
    }
}
