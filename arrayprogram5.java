public class arrayprogram5 {
    public static void main(String[] args) {
        int[] n = {1,7,3,5,4};
        int max=0;
        for(int i=0; i<n.length; i++){
            if(max<n[i]){
                max = n[i];
            }
        }
        System.out.println(max);
    }
    
}
