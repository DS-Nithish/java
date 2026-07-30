public class IncreaseOrder {
    public static void main(String[] args) {
        // int n = 86472;
        // int i = 0;
        // boolean dec = true;
        // while(n> 0){
        //     int ld = n % 10;
        //     if( ld > i){
        //         i = ld;
        //     }
        //     else{
        //         dec = false;
        //     }
        //     System.out.println(i);
        //     n = n / 10;
        // }
        // if(dec)
        //     System.out.println("Decreasing Order");
        // else
        //     System.out.println("Not");

        int n = 278;
        int i = 9;
        boolean dec = true;
        while(n> 0){
            int ld = n % 10;
            if( ld <= i){
                i = ld;
            }
            else{
                dec = false;
            }
            System.out.println(i);
            n = n / 10;
        }
        if(dec)
            System.out.println("Increasing Order");
        else
            System.out.println("Not");
    }
}
