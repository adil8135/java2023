package array.basic;

import java.util.Scanner;

public class creating_array {
    public static void main(String[] args) {
        int marks[] = new int[50];
        int number[] = {1,2,3};
        int more_numbers[]={4,5,6};
        String letters[] = {"a","b","c"};
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);

    }
}
