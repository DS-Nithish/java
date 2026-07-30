public class DSA5 {
    public static void main(String[] args)
    {
        // sum of digits = last two digits .3+5+2+7 (17 = 27 )

        int n = 145;
        int t = n % 100;
        int sum = 0;
        while(n>0){
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        if(t == sum){
            System.out.println("Secure Pin");
        }
        else{
            System.out.println("Not a secure Pin");
        }


    }
}
