public class ReverseAdd {
    public static void main(String[] args) {
        // int n = 2002;
        // int b = n;
        // int sum = 0;
        // while(n > 0){
        //     int ld  = n % 10;
        //     sum = sum * 10 + ld;
        //     n = n / 10;
        // }
        // int add = b + sum;
        // System.out.println(add);

        int n = 99875;
        int b = n;
        int sum = 0;
        while(n > 0){
            int ld  = n % 10;
            sum = sum * 10 + ld;
            n = n / 10;
        }
        if(sum > b)
            System.out.println("Larger");

    }
}
