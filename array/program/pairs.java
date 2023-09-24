package array.program;

// total_pair = n*(n-1)/2

public class pairs {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int total_pair=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("total pair is : "+total_pair);
    }
}
