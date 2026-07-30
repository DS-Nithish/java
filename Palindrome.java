import java.util.*;

public class Palindrome {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();//234
        int b = n;
        int pal = 0;

        while(n>0){
            int ld = n % 10;
            pal = ld;
            n = ld / 10;
        }
        System.out.println(pal);
        if(b ==pal)
            System.out.println("palindrome");
        else
            System.out.println("Not a palindrome");
       
    }
}
