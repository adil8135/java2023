package loop.problems;

public class reverse {
    public static void main(String args[]) {
        int n=10899,lastdigit,rev=0;
        
        while (n>0) {
            lastdigit = n % 10;
            rev= (rev*10)+lastdigit;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println();
        System.out.println(rev);
    }
    
}
