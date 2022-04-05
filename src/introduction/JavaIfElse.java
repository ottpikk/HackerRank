package introduction;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2 == 0 && (num < 6 || num > 20)){
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
