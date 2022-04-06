package introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        if (breadth <= 0 || height <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(breadth * height);
        }
    }
}
