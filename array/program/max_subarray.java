package array.program;

public class max_subarray {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int total_pair=0;
        int current_sum;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                System.out.print("(");
                current_sum=0;
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(+arr[j2]+",");
                    current_sum+=arr[j2];
            }
            if (current_sum>max) {
                max=current_sum;
            }
                System.out.print(")");
            }
            System.out.println();
        }
        System.out.println("max is : " + max);
    }
}
