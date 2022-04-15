package advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

interface PerformOperation{
    boolean check(int number);
}
class MyMath{
    public boolean checker (PerformOperation p, int num){
        return p.check(num);
    }
    PerformOperation isOdd(){
        PerformOperation operation =  number -> number%2 != 0;
        return operation;
    }
    PerformOperation isPrime(){
        PerformOperation operation =  number -> {
            if (number == 1){
                return true;
            } else {
                for (int i = 2; i < Math.sqrt(number); i++){
                    if (number%i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
        return operation;
    }
    PerformOperation isPalindrome(){
        List<Integer>numList = new ArrayList<>();
        PerformOperation operation = number -> {
            String numberToString = Integer.toString(number);
            String reversedNumber = "";
            for (int i = numberToString.length() - 1; i >= 0; i--){
                reversedNumber = reversedNumber + numberToString.charAt(i);
            }
            if (reversedNumber.equals(numberToString)){
                return true;
            } else {
                return false;
            }
        };
        return operation;
    }
}


public class LambdaExpressions {
    public static void main(String[] args) throws IOException {

        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
