import java.util.*;
public class FunctionCheckEven {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean ans = isEven(num);
        if(ans==true){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        sc.close();
    }
}
