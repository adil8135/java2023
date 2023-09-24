package function.basic;

public class function_overloading_by_data_type {
    public static int add (int num1 , int num2){ //there are 2 parameter or 2 formal parameter
        return num1+num2;
    }
    public static float add (float num1 , float num2){ //there are 2 parameter or 2 formal parameter
        return num1+num2;
    }

    public static void main(String[] args) {
        System.out.println("sum of 2 number is :"+add(2, 3));
        System.out.println("sum of 3 number is :"+add(5.0f, 2.0f));
}
}