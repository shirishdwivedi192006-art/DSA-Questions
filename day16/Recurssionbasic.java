package day16;

public class Recurssionbasic {
    public static void print(int n){
       if(n==1){
        System.out.println(n);
        return;
       }
        System.out.print(n+" ");
      print(n-1);
    }
    public static void pribtinc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        pribtinc(n-1);
        System.out.print(n+" ");
    }
    public static int facṭ(int n){
       if(n==0){
           return 1;
       }
        int facts=n*facṭ(n-1);
        return facts;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int tosum=n+sum(n-1);
        return tosum;
    }
    
    public static void main(String[] args) {
       int n=10;
        System.out.print(sum(n));
    }
}
