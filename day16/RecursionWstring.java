package day16;

public class RecursionWstring {
   public static void prints(int idx ,String str,StringBuilder newstr,boolean map[]){
       if(idx==str.length()){
           System.out.println(newstr);
           return;
       }
       //kam
       char curr=str.charAt(idx);
       if(map[curr-'a']==true){
           prints(idx+1, str, newstr, map);
       }else{
           newstr.append(curr);
           map[curr-'a']=true;
           prints(idx+1, str, newstr, map);
       }
   }
    public static void main(String[] args){

      prints(0,"shhhirrish",new StringBuilder(""),new boolean[26]);
   }
}
