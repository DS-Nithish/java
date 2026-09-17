import java.util.*;

public class ProductOfDigits{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int product = 1;
        while(a>0){
            int ld = a % 10;
            product = product * ld;
            a = a / 10;
        }
        System.out.println(product);
    }    
}

