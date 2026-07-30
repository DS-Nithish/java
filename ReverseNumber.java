import java.util.*;

public class ReverseNumber {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int a =  obj.nextInt();
        int target = 0;

        while(a>0){
            int ld = a % 10;
            System.out.print(ld);
            a = a / 10;

        }
    }    
}
