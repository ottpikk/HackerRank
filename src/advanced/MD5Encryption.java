package advanced;



import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.security.MessageDigest;


public class MD5Encryption {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte[] digest = md.digest();
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }


    }
}
