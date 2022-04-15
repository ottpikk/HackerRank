package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String regCode = "<(.+)>([^<]+)</\\1>";

        while(testCases>0){
            String line = in.nextLine();
            boolean matchFound = false;

            Pattern pattern = Pattern.compile(regCode);
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if (! matchFound){
                System.out.println("None");
            }
            testCases--;
        }
    }
}
