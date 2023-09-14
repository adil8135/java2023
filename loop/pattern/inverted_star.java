package loop.pattern;
// * * * *
// * * *
// * *
// *
public class inverted_star {
    
    public static void main(String[] args) {
    int line =4;
    for (int i = 0; i < line; i++) {
        for (int j = 0; j < line-i ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
  }  
}
