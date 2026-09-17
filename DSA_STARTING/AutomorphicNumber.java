public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 13;

        int square = n * n;

        int first = n % 10;
        int second = square % 10;

        if (first == second){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not a Automorphic Number");
        }
    }
}
