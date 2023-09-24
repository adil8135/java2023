package function.problems;

import java.util.Scanner;

public class bionomial {
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }

    public static int factorial(int n){
        int fac=1;
        for(int i = 1; i <=n ; i++){
            fac=fac*i;
        }
        return fac;           
    }

    public static void bionomial()
    {
        System.out.println("enter the input number n");
        int a= input();
        System.out.println("enter the input number r");
        int b = input();
        int bionomial = (factorial(a))/(factorial(b)*(factorial(a-b)));
        System.out.println(bionomial);
    }

    public static void main(String[] args) {
    bionomial();
    }
}
