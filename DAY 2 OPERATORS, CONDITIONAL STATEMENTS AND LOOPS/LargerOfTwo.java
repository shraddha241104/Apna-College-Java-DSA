import java.util.*;
public class LargerOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        //checking larger of two numbers entered
        if(a>b){
            System.out.println("a is greater");
        }
        else if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("b is greater than a");
        }
        sc.close();
    }
}
