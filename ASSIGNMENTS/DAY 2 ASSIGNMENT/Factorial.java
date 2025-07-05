import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which factorial should be found: ");
        int number = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=number; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of "+number+" = "+factorial);
        sc.close();
    }
}
