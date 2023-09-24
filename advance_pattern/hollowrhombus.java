public class hollowrhombus {
    public static void main(String[] args) {
        int n=4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                 System.out.print("  ");
            }
            for (int j2 = 0; j2 < n; j2++) {
                if(j2==0 || j2==(n-1) || i==n || i==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
