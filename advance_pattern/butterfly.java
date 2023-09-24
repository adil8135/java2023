public class butterfly {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");              
            }
            for (int j2 = 0; j2 < (2*(n-i)) ; j2++) {
                    System.out.print("  ");
            }  
             for (int j = 1; j <= i; j++) {
                System.out.print("* ");              
            }
            System.out.println();
        }

// _____________-----------------------2nd half---------------------------____________________

            for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");              
            }
                for (int j2 = 0; j2 < (2*(n-i)) ; j2++) {
                        System.out.print("  ");
            }  
             for (int j = 1; j <= i; j++) {
                System.out.print("* ");              
            }
            System.out.println();
        }
    }
}
