public class CheckEvenOdd {
    public static void main(String[] args){
        int n = 1369;
        int b =n;
        boolean even = false;
        boolean odd = false;
        // Check whether all digits are even

        while(n> 0){
            int ld = n % 10;
            if (ld % 2 == 0){
                even = true;
                break;
            }
            n = n / 10;
        }
        if (!even) {
            System.out.println("No");
        } else {
            System.out.println("All digits are Odd");
        }


        // while(b> 0){
        //     int fd = b % 10;
        //     if (fd % 2 == 1){
        //         odd = true;
        //         break;
        //     }
        //     b = b / 10;
        // }
        // if (odd == true) {
        //     System.out.println("No");
        // } else {
        //     System.out.println("All digits are Even");
        // }


    }
}
