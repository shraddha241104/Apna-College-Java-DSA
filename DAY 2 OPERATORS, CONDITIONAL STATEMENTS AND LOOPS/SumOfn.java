import java.util.*;
public class SumOfn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        int x = 1;
        while(x<=n){
            sum = sum + x;
            x++;
        }
        System.out.println("sum = "+sum);
        sc.close();
    }
}
