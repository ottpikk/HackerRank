package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfLines = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i= 0; i <= numOfLines; i++){
            int numsOnLine = scanner.nextInt();
            for (int j = 0; j <= numsOnLine; j++){
                int d = scanner.nextInt();
                list.add((i*numOfLines+j),d);
            }

        }
        System.out.println(list);



    }
}
