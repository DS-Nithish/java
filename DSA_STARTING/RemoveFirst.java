public class RemoveFirst {
    public static void main(String[] args){
        int  n = 92;
        int ld=0;
        int original = 0;
        int sum = 0;
        
        while (n> 10) {
            ld  = n % 10;
            sum = (sum * 10) + ld;
            // System.out.println("Sum:"+sum);
            //  System.out.println("LD:"+ld);
            n = n / 10;
        }
        while(sum > 10){
            int fd = sum % 10;
            original = original * 10 + 1;
            System.out.print(fd);
            sum = sum / 10;
        }
        
        System.out.println(sum);
       
    }
}
