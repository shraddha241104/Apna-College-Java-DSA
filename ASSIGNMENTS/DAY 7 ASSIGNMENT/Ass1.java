
public class Ass1 {

    public static int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "HI i am shraddha";
        int count = count(str);
        System.out.println("No. of lowercase vowels in string: " + count);
    }
}
