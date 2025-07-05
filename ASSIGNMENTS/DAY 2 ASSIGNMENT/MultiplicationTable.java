import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for its table: ");
        int number = sc.nextInt();
        for(int i=1;i<=10;i++){
            int ans = number*i;
            System.out.println(number+" * "+i+" = "+ans);
        }
        sc.close();
    }
}
