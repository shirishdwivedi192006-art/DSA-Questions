package day9;
import java.util.*;
public class LinearSerch {
    public static String linear(String arr[],String keye){

        for(int i=0;i<arr.length;i++){
          if(arr[i].equals(keye)){
            return keye;
          }
        }


        return "not found";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String arr[]={"apple","mango","banana","pineapple"};
        String key= sc.next();

       String ans= linear(arr , key);

       if(ans.equals("not found")){
        System.out.println("key not found");
       }else{
        System.out.println("kry was found");
       }

    }
}
