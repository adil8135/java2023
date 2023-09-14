package loop.do_while;

import java.util.Scanner;

public class except_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int num = sc.nextInt();
            if (num%10==0)
                continue;
            System.out.println("num was "+num);
        } while (true);
    }
}
