/**
 * Subset
*/
public class Subset {
    static int count = 1;
    public static void subset(String str ,int i ,String ans){
        if (i==str.length()) {
            if (ans == "")
                System.out.println(STR."\{count}:null");
            else
                System.err.println(STR."\{count++}:\{ans}");
            return;
        }
        subset(str, i+1, ans+str.charAt(i));
        subset(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
       subset(str , 0 , "");
    }
}