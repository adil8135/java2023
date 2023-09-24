package array.program;
// prefix
public class max_subarry2 {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        for (int i = 1; i <= arr.length; i++) {
                arr[i]+=arr[i-1];
        }
    }
}
