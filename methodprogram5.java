public class methodprogram5 {
    //without argument and without return type
    static void run(){
        System.out.println("Exectuing run()....");
    }
    //with argument and without retun type
    static void mul(int a,int b,int c){
        System.out.println(a*b*c);
    }
    static String name(){
        return "SMVITM";
    }
    static boolean res(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        run();
        mul(2,3,2);
        boolean ans=res(5);
        System.out.println(name());
        System.out.println(ans);
    }
}