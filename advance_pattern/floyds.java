/**
 * floyds
 */
public class floyds {

        public static void main(String[] args) {
            int number=1,n=5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++,number++) {
                    System.out.print(number+" ");
                }
                System.out.println();
            }
        }
    }