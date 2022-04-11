package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split("[ !,?._'@]+");
        int numOfWords = 0;
        List<String> wordsL = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            if (words[i].equals("")) {
            } else {
                numOfWords++;
                wordsL.add(words[i]);
            }
        }
        System.out.println(numOfWords);
        for (int i = 0; i < wordsL.size(); i++) {
            System.out.println(wordsL.get(i));
        }
    }
}
