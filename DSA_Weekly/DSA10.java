public class DSA10 {
    public static void main(String[] args) {
        int n = 102030;

        // change the 0 digits with 5 so 102030 becomes 152535
        int ld = 0;
        int sum = 0;
        int rev = 0;
        while (n > 0){
            ld = n % 10; // 0,3

            if (ld == 0){// 
                ld = 5;
                //sum = ld + 5;// 5,5
             sum  =  sum * 10 + ld ;
            }
            else{
            //0, 3, 
            sum  =  sum * 10 + ld;

            }
          

           /// sum = sum ; // 102035
           
            n = n /10; // 102035
            
        }
        // System.out.print(sum);
        while (sum > 0) {
            int fd = sum % 10;
            rev = rev * 10 + fd;
            
            sum = sum / 10;

        }
        System.out.print(rev);
        
    }
}
