public class diamond {

    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j > i; j--) {
                 System.out.print("  ");
            }
            for (int j2 = 0; j2 < ((2*i)-1); j2++) {
                System.out.print("* ");
            }
            System.out.println();
        }



            for (int i = n; i >=1 ; i--) {
            for (int j = n; j > i; j--) {
                 System.out.print("  ");
            }
            for (int j2 = 0; j2 < ((2*i)-1); j2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
