import java.util.*;
public class OddOrEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        // checking for odd or even
        if(a%2==0){
            System.out.println(a+" is even number");
        }
        else{
            System.out.println(a+" is odd number");
        }
        sc.close();
    }
}
