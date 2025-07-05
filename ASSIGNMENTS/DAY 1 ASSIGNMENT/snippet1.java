public class snippet1{
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 31.4f;
        double d = 99.9954;
        double result = (f*b)+(i%c)-(d*s);//highest data type available is double (type conversion)
        System.out.println(result);
    }
}