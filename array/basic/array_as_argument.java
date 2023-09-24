
package array.basic;

/**
 * array_as_argument
 */
public class array_as_argument {
    public static void udate(int marks[]){
     for (int i = 0; i < marks.length; i++) {
        marks[i]=marks[i]+1;
     }
    }
    public static void main(String[] args) {
        int  marks[]={1,2,3};
        udate(marks);
    for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
}
    }
}