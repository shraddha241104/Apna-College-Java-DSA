import java.util.*;
public class CheckPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int factor = 0;
        for(int i=1;i<=number;i++){//optimized condition: i<=Math.sqrt(n)
            if(number%i==0){
                factor++;
            }
        }
        if(factor==2){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }
        sc.close();
    }
}