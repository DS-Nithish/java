public class CountOccurence {
    public static void main(String[] args) {
         int n = 292725;

         int d = 2;
         int count = 0;
         while (n>0)
         {
            int ld = n % 10;
            if(ld == d){
                count++;
                
            }
            n = n /10;
         }
         System.out.println(count);
    }
}
