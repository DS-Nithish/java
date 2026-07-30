public class CountFactors {
    public static void main(String[] args){
        int n = 25;
        int a = n;
        int g = n;
        int s = 0;
        int count  = 0;
        int sum = 0;
        while(n > 0){
            if (a % n   == 0){
                System.out.print(","+n);
                sum = sum + n;
                count++;
            }
            if (s % n == 0 && n > 1)
                s = n;
                
            n --;
        }
        System.out.println("Greatest Factor:"+g);
        System.out.println("Smallest Factor:"+s);
        System.out.println("Count:"+count);
        System.out.println("Sum:"+sum);

    }
}
