public class DSA7 {
    public static void main(String[] args) {
        int n = 9;
        int pal = 0;
        int sum = 0;
        int original = n; // 9
        int square = n * n; // 81
        int neon = n;

        while(n>0){
            int ld = n % 10;
            pal = pal * 10 + ld;
            n = n / 10;
        }//9

        while (square > 0) {
            int l = square % 10;
            sum = sum + l;
            square = square / 10;
        } // 8 + 1 = 9

        if (original == pal){
            if(neon == sum){
                System.out.println("Valid Acess Code");
            }
            else{
                System.out.println("Invalid Access Code");
            }
        
        }
        else{
            System.out.println("Invalid Access Code");
        }



    }
}
