package advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int num;
        int n = scanner.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++){
            scanner.nextLine();
            name = scanner.nextLine();
            num = scanner.nextInt();
            phoneBook.put(name, num);
        }
        scanner.nextLine();
        while (scanner.hasNextLine()){
            name = scanner.nextLine();
            if (phoneBook.containsKey(name)){
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }

        }

    }
}
