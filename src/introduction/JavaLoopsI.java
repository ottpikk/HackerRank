package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args)  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            bufferedReader.close();
            for (int i = 1; i <= 10; i++){
                int result = N * i;
                System.out.printf("%s x %s = %s\n", N, i, result);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
