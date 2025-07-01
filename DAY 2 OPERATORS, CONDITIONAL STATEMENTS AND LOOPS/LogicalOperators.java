
public class LogicalOperators {

    public static void main(String args[]) {
        System.out.println((3 > 2) && (5 < 10));// only t+t --> t
        System.out.println((3 > 2) || (5 < 0));// t+f or f+t or t+t all gives t
        System.out.println(!(3 > 2));//t-->f , f-->t
    }
}
