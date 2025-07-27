
public class Operations2Bitwise {

    public static int ClearIthBit(int number, int i) {
        int bitmask = ~(1 << i);
        return number & bitmask;
    }

    public static int UpdateIthBit(int number, int i, int newBit) {
        number = ClearIthBit(number, i);
        int bitMask = newBit << i;
        return number | bitMask;
    }

    public static int ClearIBits(int number, int i) {
        int bitmask = ((~0) << i);
        return number & bitmask;
    }

    public static int ClearBitsInRange(int number, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return number & bitMask;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // int i = sc.nextInt();
        // int newBit = sc.nextInt();
        // System.out.println(UpdateIthBit(number, i, newBit));
        // System.out.println(ClearIBits(number, i));
        System.out.println(ClearBitsInRange(10, 2, 4));
    }
}
