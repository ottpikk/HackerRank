package strings;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        System.out.println((A.length() + B.length()));
        if (A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.replace(A.charAt(0),A.toUpperCase().charAt(0)) + " " + B.replace(B.charAt(0),B.toUpperCase().charAt(0)));

    }
}
