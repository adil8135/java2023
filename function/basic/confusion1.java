package function.basic;

import java.util.Scanner;

/**
 * parameter
 */
public class confusion1 {

    public static void print(int n){
        System.out.println("int is :" + n);
        // return(); optional in return type void 
    }
    public static void print(float n){
        System.out.println("float is :" + n);
        // return(); optional in return type void 
    }
    public static void main(String[] args) {
       
        int n=9;
        print(n/2);
    }
    
}