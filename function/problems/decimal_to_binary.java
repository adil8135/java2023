package function.problems;

public class decimal_to_binary {
    public static void decimalToBinary(int num){
        int binary=0;
        int power = 0;
        while (num>0){
            binary= binary+((num%2)*(int)Math.pow(10, power));
            num = num/2;
            power++;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        // decimalToBinary(2);
        System.out.println((int)Math.pow(10, 0));
        // System.out.println(5%2);
    }    
}
