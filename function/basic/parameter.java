package function.basic;

import java.util.Scanner;

public class parameter {

    public static int add (int num1 , int num2){ //there are 2 parameter or 2 formal parameter
        return num1+num2;
    }
    public static int add (int num1 , int num4 , int num5){//there are 3 parameter or 3 formal parameter
        return num1+num4+num5;
    }
    public static void sum(){
         Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
 
        System.out.println("sum of a and b :"+add(a , b)/*argument and actual parameter*/);
        System.out.println("sum of a , b and c :"+add(a , b , c));
    }
    public static void main(String[] args) {
        sum();
    }
}
