package introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfQueries, numA, numB, numN;
        numOfQueries = scanner.nextInt();

        while (numOfQueries > 0){
            numA = scanner.nextInt();
            numB = scanner.nextInt();
            numN = scanner.nextInt();
            int previousResult = 0;
            for (int i = 0; i < numN; i++){

                int result = (int)(Math.pow(2,i) * numB) + previousResult;
                System.out.print(numA + result + " ");
                previousResult = result;
            }
            System.out.println();
            numOfQueries --;
        }
    }
}
