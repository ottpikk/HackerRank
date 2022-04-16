package advanced;



import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Scanner;
import java.security.MessageDigest;


public class MD5Encryption {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // MessageDigests are secure one way hash - functions that take
        // arbitrary size data and output fixed length  hash values
        MessageDigest md = MessageDigest.getInstance("MD5");

        md.update(s.getBytes());
        byte[] digest = md.digest();
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }

        // Just to get list of today's security providers
        Provider [] provider = Security.getProviders();
        for (int i = 0; i < provider.length; i++){
            System.out.println(provider[i]);
        }

    }
}
