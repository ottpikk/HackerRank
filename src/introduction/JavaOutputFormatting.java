package introduction;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char space =' ';
        String string1 = scanner.next();
        while(string1.length() != 15){
            string1 = string1 + space;
        }
        String int1 = scanner.next();
        String string2 = scanner.next();
        while(string2.length() != 15){
            string2 = string2 + space;
        }
        String int2 = scanner.next();
        String string3 = scanner.next();
        while(string3.length() != 15){
            string3 = string3 + space;
        }
        String int3 = scanner.next();

        while(int1.length() < 3){
            int1 = "0"+int1;
        }
        while(int2.length() < 3){
            int2 = "0"+int2;
        }
        while(int3.length() < 3){
            int3 = "0"+int3;
        }

        String equations = "================================";
        System.out.printf("%s\n", equations);
        System.out.printf("%s%s\n", string1, int1);
        System.out.printf("%s%s\n", string2, int2);
        System.out.printf("%s%s\n", string3, int3);
        System.out.printf("%s\n", equations);
    }
}
