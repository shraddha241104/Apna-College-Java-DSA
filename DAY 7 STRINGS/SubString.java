
public class SubString {

    public static String printSubString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String args[]) {
        String str = "Hello World";
        int si = 0;
        int ei = 6;
        String subStr = printSubString(str, si, ei);
        System.out.println(subStr);
        System.out.println();
        System.out.println(str.substring(0, 6));
    }
}
