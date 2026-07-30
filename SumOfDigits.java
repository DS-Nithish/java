import java.util.*;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        //System.out.println("dfsdfsdf");
        int a = obj.nextInt();
        int sum = 0;
        //System.out.println(a);
        while(a>0){
            int ld = a%10;
            sum = sum + ld;
            a = a / 10;
        }
        //System.out.println(a);
        System.out.println(sum);
    }
}
