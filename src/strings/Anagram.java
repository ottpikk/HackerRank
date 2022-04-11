package strings;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
    static boolean isAnagram(String a, String b) {
        boolean ret;
        if (a.length() == b.length()){
            a = a.toLowerCase();
            b = b.toLowerCase();
            List<Character> AChars = new ArrayList<>();
            List<Character> bChars = new ArrayList<>();
            for (int i = 0; i < a.length(); i++){
                AChars.add(a.charAt(i));
                bChars.add(b.charAt(i));
            }
            Collections.sort(AChars);
            Collections.sort(bChars);
            ret = AChars.equals(bChars);
        } else {
            ret = false;
        }
        return ret;
    }
}
