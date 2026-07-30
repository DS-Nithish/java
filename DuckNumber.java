public class DuckNumber {
    public static void main(String[] args) {
        int n = 900875;
        int i = 0;
        while(n>0){
            int ld = n % 10;
            if(ld == 0){
                 i =1 ;
                
                break;
            }
            n = n /10;
        }
        if (i == 1) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
        
    }

}
