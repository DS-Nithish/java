import java.util.*;
public class CountDigits{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int count = 0;

        while(a>0){
            a = a / 10;
            count ++;
        }
        System.out.println(count);
    }
}
