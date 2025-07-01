import java.util.*;
//Average of 3 numbers
public class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.err.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.err.print("Enter the third number: ");
        double c = sc.nextDouble();
        double avg = (a+b+c)/3;
        System.out.print("average is : "+avg);
        sc.close();
    }
}