import java.util.*;
public class FunctionsBasics {
    public static void printHelloWorld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
    public static void CalculateSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("sum = "+(a+b));
        sc.close();
    }
    public static void main(String args[]){
        printHelloWorld();//function call
        CalculateSum();
    }
}
