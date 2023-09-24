package function.basic;

public class function_overloading {
    public static int add (int num1 , int num2){ //there are 2 parameter or 2 formal parameter
        return num1+num2;
    }
    public static int add (int num1 , int num4 , int num5){//there are 3 parameter or 3 formal parameter
        return num1+num4+num5;
    }
    public static void main(String[] args) {
        System.out.println("sum of 2 number is :"+add(2, 3));
        System.out.println("sum of 3 number is :"+add(1, 2, 3));

    }
    
}
