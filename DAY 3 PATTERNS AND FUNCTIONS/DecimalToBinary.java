import java.util.*;
public class DecimalToBinary {
    public static void DecToBin(int DecNum){
        int MyNum = DecNum;
        int BinNum = 0;
        int pow = 0;
        while(DecNum>0){
            int rem = DecNum % 2;
            BinNum = BinNum + (rem * (int)Math.pow(10, pow));
            pow++;
            DecNum = DecNum/2;
        }
        System.out.println("Binary of "+MyNum+" = "+BinNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int DecNum = sc.nextInt();
        DecToBin(DecNum);
        sc.close();
    }
}
