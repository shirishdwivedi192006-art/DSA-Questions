public class Primeinr {
    public static boolean isprime(int n){
        if(n==1||n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n){
        for(int i=1;i<=n;i++){
            if(isprime(i)==true){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeinrange(8);
    }
}
