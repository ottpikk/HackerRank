package advanced;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++){
            L.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int j = 0; j < Q; j++){
            scanner.nextLine();
            String function = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (function.equals("insert")){
                L.add(scanner.nextInt(), scanner.nextInt());
            } else if (function.equals("delete")){
                L.remove(scanner.nextInt());
            }
        }
        for (Integer integer : L) {
            System.out.printf("%s ", integer);
        }

    }
}
