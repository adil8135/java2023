package loop.pattern;

public class half_pyramid {
    public static void main(String[] args) {
        int number=4;
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <=(i+1) ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
