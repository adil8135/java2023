package search;

import java.util.Scanner;

public class linear_search {
    public static int find(int arr[] , int key){
        int index=0;
        System.out.print("input array is :");
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]) 
                return i;  
        }
        return -1;
    }
    public static void main(String[] args) {
        
        // int arr[]=new int[50];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 10; i++) {
        //     arr[i]=sc.nextInt();
        // }
        int arr[]={1,2,13,4,25,6,57,8};
        int key = 57;
        int result = find(arr, key);
        if(result==-1)
        System.out.println("not present");
        else
        System.out.println("index is : "+result);

    }
}
