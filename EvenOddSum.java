import java.util.*;

public class EvenOddSum{
  public static void main(String[] args) {
   Scanner sc  = new Scanner(System.in);
   System.out.println("Enter a Number");
   int n = sc.nextInt();
     int oddsum = 0;
     int evensum = 0;

   while (n > 0) {
     int num = n % 10;//4523
     
     if (num % 2 == 0){ // 3 % 2 == 1
        evensum = num + evensum;
     }
     else if(num % 2 == 1){// 3 % 2 == 1
       oddsum = oddsum+ num; // oddsum = 0 + 3
      
     }
     else{
     System.out.println("noo");}
    n = n /10;//452
   }
   System.out.println("Even Sum: "+evensum);
   System.out.println("Odd Sum: "+oddsum);

  }
}