public class OverloadingDataTypes {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(5, 6));
        System.out.println(sum(3.2f, 4.8f));
    }
}
