import java.util.Scanner;

public class BinomialCoefficient {
    public static int factorial(int num){
        int f = 1;
        for(int i = 1;i<=num;i++){
            f =f*i;
        }
        return f;
    }
    public static float coeff(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        float ans = n_fact/(r_fact*nmr_fact);
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println("Binomial coefficient = "+coeff(n, r));

        sc.close();
    }
}
