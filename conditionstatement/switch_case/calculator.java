package conditionstatement.switch_case;

import java.util.Scanner;

public class calculator {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b;
        char no = sc.next().charAt(0);
        switch (no) {
            case '+':
                b=sc.nextInt();
                System.out.println("your answer is:"+(a+b));
                break;
            case '-':{
                b=sc.nextInt();
                System.out.println("your answer is:"+(a-b));
                break;
            }
            case '*':{
                b=sc.nextInt();
                System.out.println("your answer is:"+(a*b));
                break;
            }         
            case '/':{
                b=sc.nextInt();
                System.out.println("your answer is:"+(a/b));
                break;
            }
            case '%':{
                b=sc.nextInt();
                System.out.println("your answer is:"+(a%b));
                break;
            }
            default:
                System.out.println("your choice is greater than 2");
        }

    }
}
