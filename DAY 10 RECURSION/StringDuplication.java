
import java.util.*;

public class StringDuplication {

    public static void eradicateDuplication(String str, StringBuilder newStr, boolean map[], int idx) {
        //base case 
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == false) {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
        }
        eradicateDuplication(str, newStr, map, idx + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean map[] = new boolean[26];
        int idx = 0;
        StringBuilder newStr = new StringBuilder("");
        eradicateDuplication(str, newStr, map, idx);
    }
}
