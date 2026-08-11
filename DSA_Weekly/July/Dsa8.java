import java.util.*;
public class Dsa8 {
    public static void main(String[] args) {
        /*Write a program to print the sum of negative numbers, 
        sum of positive even numbers and the sum of positive odd numbers from a 
        list of numbers (N) entered by the user. 
        The list terminates when the user enters a zero. */
          Scanner obj = new Scanner(System.in);
        int negative_sum = 0;
        int odd_sum = 0;

        for(int n = obj.nextInt(); n!=0; n++)
        {
          

            if(n<0)
            {
                negative_sum ++;
            }
            if(n>0 && n % 2 == 1){
                odd_sum++;
            }
        }
        System.out.println(negative_sum);
        System.out.println(odd_sum);

    }
}
