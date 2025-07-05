import java.util.*;
public class PrintReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int n = sc.nextInt();
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
        sc.close();
    }
}


