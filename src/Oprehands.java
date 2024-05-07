import java.util.Scanner;

public class Oprehands{

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        // Calculate added tax and tip using precise double values
        double addedTax = (tax_percent / 100.0) * meal_cost;
        double addedTip = (tip_percent / 100.0) * meal_cost;

        // Calculate total cost without rounding
        double totalCost = meal_cost + addedTax + addedTip;

        // Round to nearest integer using Math.round()
        long roundedTotal = Math.round(totalCost);

        System.out.println(roundedTotal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mealPrice= sc.nextDouble();
        int tipPercent=sc.nextInt();
        int taxPercent= sc.nextInt();
solve(mealPrice,tipPercent,taxPercent);


    }
}
