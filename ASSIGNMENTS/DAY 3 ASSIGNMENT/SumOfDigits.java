import java.util.*;
public class SumOfDigits{
    public static void Sum(int num){
        int MyNum=num;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("Sum of digits of number "+MyNum+" = "+sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Sum(num);
        sc.close();
    }
}