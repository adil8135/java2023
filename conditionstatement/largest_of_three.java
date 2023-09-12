package conditionstatement;

import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
        int a = 45,b=78,c=339;
        if (a>=b && a>=c) {
            System.out.println("largest number is A :"+a);
        }if (b>=c) {
            System.out.println("largest number is B :"+b);
        }else{
                System.out.println("largest number is C :"+c);
             }
    }
    
}
