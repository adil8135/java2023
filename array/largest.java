package array;

public class largest {

    public static int larges(int list[]){
        int lno = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > lno) {
                lno=list[i];
            }
        }    
                return lno;
    }
    public static void main(String[] args) {
        int large[]={1,2,3,41,5,6,7};
        int num=larges(large);
        System.out.println(num);
    }
    
}
