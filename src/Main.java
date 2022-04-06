import com.sun.jdi.Value;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       double mealCost = 12.00;
       int tipPercent = 20;
       int taxPercent = 8;
       Result.solve(mealCost, tipPercent, taxPercent);

    }
}

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * (tip_percent / 100.0);
        double tax = meal_cost * (tax_percent / 100.0);
        double totalCost = meal_cost + tip + tax;
        System.out.println(Math.round(totalCost));


    }

}
