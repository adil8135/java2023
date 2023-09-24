package function.problems;
import java.util.Scanner;
public class binary_to_decimal {

    public static void BinaryToDecimal(int binary){
        int pow=0;
        int number=binary;
        int decnum=0;
        while (binary != 0) {
            int last = binary%10;
            decnum = decnum + (last* (int)Math.pow(2, pow));
            binary = binary/10;
            pow++;
        }
        System.out.println("decimal of binary "+number+"is : "+decnum);
    }
    public static void main(String[] args) {
        BinaryToDecimal(111);
    }
}
