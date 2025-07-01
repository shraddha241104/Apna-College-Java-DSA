
import java.util.*;

public class AssignmentOperators {

    //use of each operator one by one for desired output
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        int b = a;
        int c = a += 5;//faster statements advisable for competitive coding
        int d = a -= 5;
        int e = a *= 5;
        int f = a /= 5;
        int g = a %= 5;
        System.out.println("Value of b with a=b:" + b);//a=b
        System.out.println("Value with a+=5:" + c);//a=a+5
        System.out.println("Value with a-=5:" + d);//a=a-5
        System.out.println("Value with a*=5:" + e);//a=a*5
        System.out.println("Value with a/=5:" + f);//a=a/5
        System.out.println("Value with a%=5:" + g);//a=a%5
        sc.close();
    }
}
