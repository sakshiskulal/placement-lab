public class arrayprogram6 {
        public static void main(String[] args) {
            int[] n = {1,7,3,5,4};
            int min=n[0];
            for(int i=1; i<n.length; i++){
                if(min>n[i]){
                    min = n[i];
                }
            }
            System.out.println(min);
        }
    }

