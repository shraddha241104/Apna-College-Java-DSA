import java.util.*;
public class FunctionAverage {
    public static float Avg(float a,float b,float c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        float avg = Avg(a,b,c);
        System.out.println("Average of three numbers entered: "+avg);
        sc.close();
    }
}
