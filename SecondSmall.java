public class SecondSmall {
    public static void main(String[] args) {
        int n = 29875;

        int s = 0;
        int f  = 1;

        while (n > 0){
            int ld = n % 10;
            if(ld < s){
                s = ld;
            }
            n = n / 10;

        }
            while (b > 0){
            int fd = b % 10;
            if(fd < sm && fd >1){
                s = ld;
            }
            i++;
            b = b / 10;

        }
        System.out.println(s);
    }
}
