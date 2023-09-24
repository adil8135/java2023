package array.program;

public class reverse {
    public static void rev(int arr[]){
        int start=0,end=arr.length-1;
        // for (int i = 0; i < (arr.length)/2; i++) {
            //     arr[start]=arr[start]+arr[end];
            //     arr[end]=arr[start]-arr[end];
            //     arr[start]=arr[start]-arr[end];
            //     // System.out.println("run");
            //     start++;
            //     end--;
            // }
            while (start<end) {
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
            }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        rev(arr);
        for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]);
        
    }
}
