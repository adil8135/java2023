package function.basic;
// java always call by value
import java.util.Scanner;

public class call_by_value {

    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input number");
        int num=sc.nextInt();
        return num;
    }
    public static void swap(int num1 , int num2){
        
        int num3;
        num3=num1;
        num1=num2;
        num2=num3;
    }
    public static void main(String[] args) {
        int a = input();
        int b = input();
        swap(a , b);
        System.out.println( a +" now a is same because of call_by_value  ");
        System.out.println( b +" now b is same because of call_by_value  ");
    }
    
}
