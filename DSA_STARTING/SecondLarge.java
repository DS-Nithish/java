public class SecondLarge {
    public static void main(String[] args) {
        int n = 2975;
        int b = n;
        int g = 0;

        while(n> 0){
            int ld = n % 10;
            if(ld > g && ld < 9 ){
                g = ld ;

            }
            n = n/ 10;
        }
        System.out.println(g);
    }
}
