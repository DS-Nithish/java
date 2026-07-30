import java.util.*;

public class Harshad {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        int b = n;
        while(n>0){
            int ld = n % 10;
            sum = sum + ld;
            n = n/10;
        }
        if(b%sum == 0){
            System.out.println("Harshad");
        }
    }   
}
