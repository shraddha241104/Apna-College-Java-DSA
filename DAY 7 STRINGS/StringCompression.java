
public class StringCompression {

    public static String compression(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        String finalStr = sb.toString();
        return finalStr;
    }

    public static void main(String args[]) {
        String str = "aaabbcccdd";
        String finalStr = compression(str);
        System.out.println("compressedd String: " + finalStr);
    }
}
