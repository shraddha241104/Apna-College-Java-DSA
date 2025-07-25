
import java.util.Arrays;

public class Ass4 {

    public static void checkAnagrams(String str1, String str2) {
        //convert both the strings to lowercase to avoid the step of checking upper or lower case separately
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //Check length of both the strings 
        if (str1.length() == str2.length()) {
            //convert str to charArray
            char chArray1[] = str1.toCharArray();
            char chArray2[] = str2.toCharArray();
            //sort Arrays
            Arrays.sort(chArray1);
            Arrays.sort(chArray2);
            //compare both character arrays
            boolean result = Arrays.equals(chArray1, chArray1);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }
    }

    public static void main(String args[]) {
        String str1 = "heart";
        String str2 = "earth";
        checkAnagrams(str1, str2);
    }
}
