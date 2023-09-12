package conditionstatement;
// income < 5Lakh then tax is 0% tax
// income b/w 5 to 10Lakh then 20% tax
// income > 10Lakh then 30%

import java.util.Scanner;

public class income_tax_calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income < 500000) {
            System.out.println("zero tax");
        }if (income >= 500000 && income<1000000) {
            System.out.println("your tax is " + income*0.2);
        } else {
            System.out.println(" your tax is " + income*0.3);
        }
    }
}
