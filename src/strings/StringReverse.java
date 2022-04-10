package strings;


import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String reverse = A;

        for (int i = 1; i <= A.length(); i++){
            reverse = reverse.replace(reverse.charAt(i-1),A.charAt(A.length()-i));
        }
        if (A.equals(reverse)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
