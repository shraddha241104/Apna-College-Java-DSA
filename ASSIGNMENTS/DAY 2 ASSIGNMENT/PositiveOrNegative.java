import java.util.*;
public class PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if (a>0){
            System.out.println(a+" is positive");
        }
        else if(a==0){
            System.out.println("number entered is zero");
        }
        else{
            System.out.println(a+" is negative");
        }
        sc.close();
    }
}
