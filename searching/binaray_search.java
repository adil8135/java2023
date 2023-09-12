package searching;

import array.largest;

public class binaray_search {
public static int binary( int list[] , int key){
        int start=0;
        int end = list.length-1;
        while (start<=end) {
        int mid=(start+end)/2;
        
        if (list[mid]==key) {
            return mid;
        }
        if(list[mid]>key){
            end = --mid;
        }
        if (list[mid]<key) {
            start = ++mid;
        }
        }
        return -1;
        }        
    public static void main(String args[]) {
        int number[]={0,1,2,3,4,5,6,7,8,9};
        int key=9;
        System.out.println(binary(number , key));
    }
}
