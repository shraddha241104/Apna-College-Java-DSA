
public class TypePromotion {

    public static void main(String args[]) {
        char a = 'a';
        System.out.println((int) a);
        char b = 'b';
        System.out.println((int) b);
        System.out.println(b - a);// byte,short,char ---> int
        int c = 10;
        float d = 20.25f;
        long e = 25;
        double f = 30;
        double ans = c + d + e + f;
        System.out.println(ans);//long,float,double ---> long,float,double
        byte x = 5;
        byte y = (byte) (x * 2);//explicit conversion cuz type promotion
        System.out.println(y);
    }
}
