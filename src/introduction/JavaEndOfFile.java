package introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNextLine()){
            System.out.println(i + " " + scanner.nextLine());
            i++;
        }
    }
}
