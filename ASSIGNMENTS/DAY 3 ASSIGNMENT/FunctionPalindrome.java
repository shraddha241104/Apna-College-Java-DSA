import java.util.*;
public class FunctionPalindrome {
    public static void CheckPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while(palindrome!=0){
            int rem = palindrome%10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome/10;
        }
        if(number==reverse){
            System.out.println(number+" is a palindrome");
        }
        else{
            System.out.println(number+" is not a palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        CheckPalindrome(num);
        sc.close();
    }
}
