
// 1 2 3 4 5
// then
// -2 in all
// ans -1 0 1 2 3
public class array {
    
    public static void changeArr(int arr[],int i , int val)
    {
        if (arr.length==i) {
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;        
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
