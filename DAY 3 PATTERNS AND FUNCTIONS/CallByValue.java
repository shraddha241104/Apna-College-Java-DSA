public class CallByValue {
    public static void main(String args[]){
        //swap -- exchange value
        int a = 10;
        int b = 5;
        System.out.println("BEFORE SWAPPING");
        System.out.println("value of a and b: "+a+","+b);
        //swap code
        int temp = a;
        a = b;
        b = temp;
        System.out.println("AFTER SWAPPING");
        System.out.println("value of a and b: "+a+","+b);
    }
}
