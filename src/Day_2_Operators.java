import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author DRYELLE
 */
public class Day_2_Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        
        double tip = meal_cost * tip_percent /100;
        double tax = meal_cost * tax_percent /100;
        
        int total_cost = (int) Math.round(meal_cost + tip + tax);
        
        System.out.println("The total meal cost is " + total_cost + " dollars.");
        
        
    }
}

