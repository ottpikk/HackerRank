package strings;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(s.substring(start,end));

    }


}
