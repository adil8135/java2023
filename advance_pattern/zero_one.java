public class zero_one {
     public static void main(String[] args) {
        int number,n=5,count=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // if (i%2!=0){
                //     if (j==1) {
                //         count=1;
                //     }
                //     if (count==1) {
                //         System.out.print(count+" ");
                //         count--;
                //     }
                //     else{
                //         System.out.print(count+" ");
                //         count++;
                //     }
                // } 
                // else        
                // {if (j==1) {
                //         count=0;
                //     }
                    
                //     if (count==1) {
                //         System.out.print(count +" ");
                //         count--;
                //     }
                //     else{
                //         System.out.print(count+" ");
                //         count++;
                //     }
                // }
// ------------------------OR----------------------------
                if ((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

