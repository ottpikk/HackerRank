package introduction;

import java.util.Scanner;
public class JavaDataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTests = scanner.nextInt();
        String byteNum = "* byte";
        String shortNum = "* short";
        String intNum = "* int";
        String longNum = "* long";
        String none = " can't be fitted anywhere.";
        String canBe = " can be fitted in:";

        while (numOfTests > 0){
            String number = scanner.next();
            try {
                if (isLong(number)){
                    System.out.println(number + canBe);
                }
                if (isByte(number)) {
                    System.out.println(byteNum);
                }
            } catch (NumberFormatException e1){}
            try {
                if (isShort(number)) {
                    System.out.println(shortNum);
                }
            } catch (NumberFormatException e2){}
            try {
                if (isInt(number)) {
                    System.out.println(intNum);
                }
            } catch (NumberFormatException e3){}
            try {
                if (isLong(number)) {
                    System.out.println(longNum);
                }
            } catch (NumberFormatException e4){
                System.out.println(number + none);
            }
            numOfTests --;
        }
    }

    public static boolean isByte(String number){
        return (Byte.parseByte(number) <= 127 && Byte.valueOf(number) >= -128);
    }
    public static boolean isShort(String number){
        return (Short.parseShort(number) <= 32767 && Short.valueOf(number) >= -32768);
    }
    public static boolean isInt(String number){
        return (Integer.parseInt(number) <= 2147483647  && Integer.valueOf(number) >= -2147483648);
    }
    public static boolean isLong(String number){
        return (Long.parseLong(number) <= 9223372036854775807L && (Long.parseLong(number)) >= -9223372036854775808L);
    }



}
