public class Factroial {
    public static int fact(int n){
        int facte=1;
        for(int i=1;i<=n;i++){
            facte*=i;
        }
        return facte;
    }
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
