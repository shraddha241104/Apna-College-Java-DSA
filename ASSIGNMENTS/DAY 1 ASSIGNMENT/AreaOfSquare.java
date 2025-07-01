import java.util.*;
//Area of Square
//can be done using int as in solution int is given
public class AreaOfSquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the side of square: ");
        double side = sc.nextDouble();
        double area = side*side;
        System.out.println("Area of square: "+area);
        sc.close();
    }
}