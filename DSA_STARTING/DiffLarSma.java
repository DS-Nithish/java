public class DiffLarSma {
    public static void main(String[] args) {
        int n = 298739;

        int g = 0;
        int s = 9;

        // while(n> 0){
        //     int fd = n % 10;
        //     if (fd > g){
        //         g = fd;
        //     }
        //     if (fd < s){
        //         s = fd;
        //     }
        //     n = n/ 10;
        // }
        // int diff = g - s;
        // System.out.println(diff);

         while(n> 0){
            int fd = n % 10;
            if (fd > g && fd % 2 == 0){
                g = fd;
            }
            if (fd < s && fd % 2 == 1){
                s = fd;
            }
            n = n/ 10;
        }
        System.out.println(g);
        System.out.println(s);

       
    }
}
