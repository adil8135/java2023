package function.problems;

public class prime_range {
    public static void is_prime(int n){
        // boolean is_prime=true;
        if(n==1)
                return;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0)
                return;
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        int i=2;
        while (i<=n) {
            is_prime(i);
            i++;
        }
    }
}
