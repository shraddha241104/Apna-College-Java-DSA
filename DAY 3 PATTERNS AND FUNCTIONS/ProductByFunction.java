import java.util.Scanner;
public class ProductByFunction {
    public static int multiply(int num1, int num2){
        int product = num1*num2;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println("product of entered number = "+product);
        sc.close();
    }
}
