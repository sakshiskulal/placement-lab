public class automorphicnumber {
    public static void main(String[] args) {
        int n=25;
        int sq=n*n;
        if(sq%10==n){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not an Automorphic number");
        }
    }
}
