import java.util.*;

public class LargestDigit {
    public static void main(String[]args){
        int a =  29875;
        int b = a;
        int target = 0;
        int s =9;
        while(a>0){
            int ld = a % 10;
            
            if (ld > target){
                target = ld;
                
            }
           
            a = a / 10;

        }
         System.out.println(target);
         /*Input:29485  
          Output:2 
          */
       
        while(b>0){
            int fd = b % 10;//5
            if (fd < s){// 5 > 0 , 8 > 5 , 4 > 8
            
                s  = fd; // 5 
             
            }
            b = b/10;
        }
        System.out.println(s);
    }    
}
