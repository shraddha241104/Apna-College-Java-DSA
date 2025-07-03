import java.util.*;
public class Print1ton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int x = 1;
        while(x<=n){
            System.out.print(x+" ");
            x++;
        }
        sc.close();
    }
}
