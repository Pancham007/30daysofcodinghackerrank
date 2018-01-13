import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        double tip,tax,tt;
        scan.close();
        tip=(mealCost*tipPercent)/100;
        tax=(mealCost*taxPercent)/100;
        tt=mealCost+tip + tax    ;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(tt);
      
System.out.println("The total meal cost is "+totalCost+" dollars.");    
    }
}