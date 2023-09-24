package array.program;

public class subarray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int total_pair=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                System.out.print("(");
                for (int j2 = i; j2 < j; j2++) {
                System.out.print(+arr[j2]+",");
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
