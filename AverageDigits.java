public class AverageDigits {
    public static void main(String[] args) {
        int n = 29875;
        int sum = 0;
        int count = 0;
        while(n> 0){
            int ld = n % 10;
            sum = sum + ld;
            n = n /10;
            count++;
        }
         int average = sum / count;
         System.out.println(average);
    }
}
