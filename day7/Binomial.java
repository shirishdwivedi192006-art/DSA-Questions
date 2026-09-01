public class Binomial {
     public static int fact(int n){
        int facte=1;
        for(int i=1;i<=n;i++){
            facte*=i;
        }
        return facte;
    }
    public static int binomial(int n,int r){
        int nfact=fact(n);
        int rfact=fact(r);
        int nrfact=fact(n-r);

        return nfact/(rfact*nrfact);

    }
    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
    }
}
