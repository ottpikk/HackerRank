package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class subStringComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k){

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length()-k+1; i++){
            list.add(s.substring(i,i+k));
        }
        Collections.sort(list);
        String smallest = list.get(0);
        String largest = list.get(list.size()-1);

        return smallest + "\n" + largest;
    }
}
