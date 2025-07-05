import java.util.*;
public class EvenOddSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the set value: ");
        int SetCount = sc.nextInt();
        int EvenSum=0; int OddSum=0;
        for(int i=1;i<=SetCount;i++){
            System.out.print("Enter the number: ");
            int number = sc.nextInt();
            if(number%2==0){
                EvenSum = EvenSum + number;
            }
            else{
                OddSum =OddSum + number;
            }
        }
        System.out.println("Even Sum = "+EvenSum);
        System.out.println("Odd Sum = "+OddSum);
        sc.close();
    }
}
