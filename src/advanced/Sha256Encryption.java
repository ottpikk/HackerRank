package advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Sha256Encryption {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // MessageDigests are secure one way hash - functions that take
        // arbitrary size data and output fixed length  hash values
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        }catch (NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
    }
}
