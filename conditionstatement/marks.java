package conditionstatement;
// marks >= 33 : pass
//  marks < 33 : fail 
public class marks {
    public static void main(String[] args) {
        int  number = 33;
        // if (number < 33) {
        //     System.out.println("fail");
        // } else {
        //     System.out.println("pass");
        // }
        String result = (number<33)?"fail":"pass";
        System.out.println(result); 
    }
}
