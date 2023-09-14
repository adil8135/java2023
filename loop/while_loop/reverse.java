package loop.while_loop;

public class reverse {
    public static void main(String[] args) {
        int num = 12345,rev=0,rem;
        while (num !=0) {
            rem=(num%10);
            System.out.print(rem);
            rev = (rev*10)+rem;
            num = num/10;
        }        
        System.out.println();
        System.out.println(rev);
    }
}
