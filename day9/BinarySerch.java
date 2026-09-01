package day9;
import java.util.*;
public class BinarySerch {
    public static void Binary(int arr[],int key){
            int start=0;
            int end=arr.length-1;
            
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==key){
                    System.out.println("found");
                    break;
                }else if(arr[mid]>key){
                    end=mid-1;
                }else{
                   start=mid+1;
                    
                }
            }
            System.out.println("not found");
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,6,4,7,9};
      Arrays.sort(arr);
      Binary(arr, 20);

    }
}
