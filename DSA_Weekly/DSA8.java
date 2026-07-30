public class DSA8 {
    public static void main(String[] args) {
        int n = 2026;
        int d = 0;
        while (n>0) {
            int ld = n % 10;
            if (ld == 0){
                d = 1;
                break;
            }
            n = n/ 10;
        }
        if(d == 1)
            System.out.println("Duck Number");
        else
            System.out.println("Not A Duck Number");
    }
}
