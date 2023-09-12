package conditionstatement.switch_case;

import java.util.Scanner;

public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        switch (no) {
            case 1:
                System.out.println("your choice is 1");
                break;
            case 2:{
                System.out.println("your choice is 2");

                break;
            }
            default:
                System.out.println("your choice is greater than 2");
        }

    }
}
