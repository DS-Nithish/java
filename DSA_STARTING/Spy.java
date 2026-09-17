import java.util.*;

public class Spy {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        int product = 1;
        int b = n;
        while(n>0){
            int ld = n % 10;
            sum = sum + ld;
            n = n/10;
        }
        while(b>0){
            int fd = b % 10;
            product = product * fd;
            b = b / 10;
        }        
        if(sum == product){
            System.out.println("Spy Number");
        }
    }   
}
