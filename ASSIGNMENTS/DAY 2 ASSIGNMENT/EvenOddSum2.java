import java.util.*;
public class EvenOddSum2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number; int choice;
        int EvenSum = 0; int OddSum = 0;
        do{
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            if(number%2==0){
                EvenSum = EvenSum + number;
            }
            else{
                OddSum = OddSum + number;
            }
            System.out.print("If you want to continue press 1 else press 0:");
            choice = sc.nextInt();
        } while(choice==1);
            System.out.println("Sum of even numbers: "+EvenSum);
            System.out.println("Sum of odd numbers: "+OddSum);
            sc.close();
    }
}
