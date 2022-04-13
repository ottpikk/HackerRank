package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DupliceteWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        /*
        \w ----> A word character: [a-zA-Z_0-9]
        \W ----> A non-word character: [^\w]
        \b ----> A word boundary
        \1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
        + ----> Match whatever it's placed after 1 or more times
         */
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);

        Scanner scanner = new Scanner(System.in);
        int numSentences = Integer.parseInt(scanner.nextLine());

        while (numSentences > 0) {
            String input = scanner.nextLine();
            Matcher m = pattern.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(),m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
            numSentences--;
        }
        scanner.close();
    }
}
