import java.util.Scanner;

public class Oprehands{

    public static void basicOprehands(){
        Scanner sc = new Scanner(System.in);
        double meal_cost =sc.nextInt();
        int tip_percent =sc.nextInt();
        int tax_percent =sc.nextInt();
        double addedTip=meal_cost/100*tip_percent;
        double addedTax= tax_percent/100*meal_cost;
        Double total = meal_cost+tip_percent+tax_percent;
        System.out.println(total);
    }

    public static void main(String[] args) {
basicOprehands();


    }
}
