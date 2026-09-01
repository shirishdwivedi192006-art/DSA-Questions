package day9;

public class Largedt {  
    public static int larg(int arr[]){
        int l=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>l){
            l=arr[i];
        }
      }
      return l;
    }
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("rhis is the largest no= "+larg(arr));
         int s=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]<s){
            s=arr[i];
        }
      }
      System.out.println("smallest is "+s);
    }
}
