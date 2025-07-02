import java.util.*;
public class IfElseBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        //checking for adult status
        if(age>=18){
            System.out.println("ADULT : Vote, Drive");
        }
        if(age>=13 && age<=19){
            System.out.println("TEENAGER");
        }
        else{
            System.out.println("NOT ADULT");
        }
        sc.close();
    }
}