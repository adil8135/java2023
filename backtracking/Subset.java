/**
 * Subset
*/
public class Subset {
    public static void subset(String str ,String ans ,int i){
        if (i==str.length()) {
            if (ans == "") {
                System.out.println("null");
            }
            System.err.println(ans);
            return;
        }
        subset(str, ans+str.charAt(i), i+1);
        subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
       subset(str,"",0);
    }
}