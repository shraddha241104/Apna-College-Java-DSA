import java.util.*;
public class ReverseOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int n = sc.nextInt();
        System.out.println("Original number entered by user: "+n);
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            reverse = (reverse*10)+lastDigit;
            n = n/10;
        }
        n = reverse;
        System.out.println("Original reversed: "+n);
        System.out.println("Value of reversed: "+reverse);
        sc.close();
    }
}
