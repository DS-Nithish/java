import java.util.*;

public class EvenOrOdd {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if(a % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
}
