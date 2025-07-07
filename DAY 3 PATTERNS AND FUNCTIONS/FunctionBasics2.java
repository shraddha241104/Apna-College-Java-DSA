import java.util.*;
public class FunctionBasics2{
    public static void CalculateSum(int num1,int num2){//parameters or formal parameters
        int sum = num1+num2;
        System.out.println("sum = "+sum);
    }
    public static void main(String args[]){
        //function call
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        CalculateSum(a,b);//arguments or actual parameters
        sc.close();
    }
}
