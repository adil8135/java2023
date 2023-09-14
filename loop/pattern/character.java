package loop.pattern;

public class character {
    public static void main(String[] args) {
         int number=5;
         char character = 65;
        for (int i = 0; i < number; i++) {
            for (int j = 65; j <= 65+i ; j++) {
                System.out.print(character + " ");
                character++;
            }
            System.out.println();
        }
    }
}
