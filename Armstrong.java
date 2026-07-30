import java.util.*; 
public class Armstrong {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count = 0;
        int a = n;
        int b = n;
        int sum =0;
        while (n>0){
            n = n/ 10;
            count ++;
        }
            System.out.println(count);
        while(a>0){
            int ld = a % 10;
            int power = (int)Math.pow(ld, count);
            System.out.println(power);
            sum = power + sum;
            a = a /10;
        }
        System.out.println(sum);
        if (b == sum)
            System.out.println("Armstrong");
        else
            System.out.println("not");

    }
}
