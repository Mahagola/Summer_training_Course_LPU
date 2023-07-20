// Recursion--------------------------------------
import java.util.*;
public class lec_25{
    static void print_descending(int n){
        if(n<1)return;
        System.out.println(n);
        print_descending(n-1);
    }
    static int fibonacci(int n){
        if(n<2)return n;
        int a=fibonacci(n-1);
        int b=fibonacci(n-2);
        return (a+b);
    }
    static int binary_search(int []arr,int key){
        int l=0; 
        int r=arr.length-1; 
        while(l<=r){
            int mid=l+r/2;
            if(key==arr[mid])return mid;
            else if(key<arr[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=6;
        print_descending(n);
        System.out.print("fibonacci number for " + n + " is : ");
        System.out.print(fibonacci(n));
        int arr[]={2,23,44,54,300,566};
        int key=44;
        System.out.println("\nelement found at index : " + binary_search(arr, key));
    }
}
