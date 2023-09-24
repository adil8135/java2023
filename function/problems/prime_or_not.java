package function.problems;

public class prime_or_not {
    
    public static boolean is_prime(int n){
        // boolean is_prime=true;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(is_prime(n));
    }
    
}
