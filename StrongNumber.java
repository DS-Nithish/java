public class StrongNumber {
    public static void main(String[] args) {
        int n = 146;

        int original = n;
        int fact = 1;
        int sum = 0;

        // 5*4*3*2*1 + 4*3*2*1 + 1*1 = 145
        while(n> 0){
            int ld = n % 10;// 5,4,1
            while(ld != 0){
            fact = fact * ld;//1*5,5*4,20 * 1                  
            ld --;
        }
           
            sum = sum + fact; // sum stores the factorial sum
            fact = 1;
            n = n / 10;//14,4,0

        }
        if(original==sum)
         System.out.println("Strong Number");

    }
}
