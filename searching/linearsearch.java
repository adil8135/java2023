package searching;

import loop.problems.reverse;

public class linearsearch {
    public static int linear(int number[],int key){
        for (int i = 0; i < number.length; i++) {
            if (number[i]==key) {
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int number[]={0,1,2,3,12,345,342,132,5,2123,35,5,1,1,6,1,5};
        int key=2;
        int index = linear(number, key);
        if (index == -1) {
            System.out.println("wrong element");            
        } else {
            System.out.println("index is :"+index);            
        }

    }
    
}
