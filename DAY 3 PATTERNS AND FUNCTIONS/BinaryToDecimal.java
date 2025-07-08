import java.util.*;;
public class BinaryToDecimal {
    public static void BinToDec(int BinNum){
        int MyNum =BinNum;
        int pow=0;
        int decNum=0;
        while(BinNum>0){
            int lastDigit = BinNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("Decimal of "+MyNum+" = "+decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int BinNum = sc.nextInt();
        BinToDec(BinNum);
        sc.close();
    }
}
