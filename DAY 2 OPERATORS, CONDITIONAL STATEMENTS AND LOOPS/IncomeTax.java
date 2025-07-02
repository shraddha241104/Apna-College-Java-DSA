import java.util.*;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        int income = sc.nextInt();
        float tax;
        //printing tax at last
        if(income<500000){
            tax = 0;
            //System.out.println("Tax to be paid: "+tax);
        }
        else if(income>=500000 && income<1000000){
            tax = 0.2f*income;
            //System.out.println("Tax to be paid: "+tax);
        }
        else{
            tax = 0.3f*income;
            //System.out.println("Tax to be paid: "+tax);
        }
        System.out.println("Tax to be paid: "+tax);
        sc.close();
    }
}
