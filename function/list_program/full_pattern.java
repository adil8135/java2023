package function.list_program;

public class full_pattern {
    public static void butterfly(int n){
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
    public static void dimond(int n){
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
    public static void main(String[] args) {
        butterfly(5);
        dimond(5);
    }
}
