public class DSA6 {
    public static void main(String[] args) {
        // fd*ld + evencount * oddcount 
        int n  = 58392;
        int ld = n;
        int evencount = 0;
        int oddcount = 0;
        int fd = n % 10;
        while (ld>10) {
            ld = ld /10;
        }
        
        while(n>0){
            int fd1 = n % 10;
            if (fd1 % 2 == 0){
                evencount++;
            } 
            else{
                oddcount++;
            }
            n = n/10;
        }
        int count = evencount * oddcount;

        int verify = fd * ld + count;
        System.out.println(verify);
    }
}
