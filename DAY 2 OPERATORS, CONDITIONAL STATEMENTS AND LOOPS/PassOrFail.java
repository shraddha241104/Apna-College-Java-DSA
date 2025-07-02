import java.util.*;
public class PassOrFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        //ternary operator
        String status = (marks>=33)?"PASS":"FAIL";
        System.out.println("student is "+status);
        sc.close();
    }
}
