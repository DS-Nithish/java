import java.util.*;
public class FirstLastDigit {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a =  n;
        
        // first digit
        while(n>10){
            n = n / 10;
        
        }
        System.out.println(n);  

        // last digit
        int ld = a%10;
        System.out.println(ld);

        //Sum of first and last digits
        int sum = n + ld;
        System.out.println(sum);

    }
}
