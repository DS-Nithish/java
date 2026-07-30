public class CountEvenN {
    public static void main(String[] args){
        int n = 10;

        int sum = 0;

        // Print from 1 to N

        // while(n!=0){    
        //     sum = sum + 1;
        //     System.out.println(sum);
        //     n--;
        // }
       
        // Print from N to 1
        
        // while(n!=0){
        //     n--;
        //     sum = n+ 1;
        //     System.out.println(sum);
        // }

        // Sum from 1 to N

        // while(n!=0){
        //     sum = n + sum;   
        //     n--;
        // }
        //  System.out.print(sum);
        
        
        //Multiplication Table
        // int sup = 1;
        // int mult = 10;
        // while (mult!=0) {
        //     sum = sum + 1;
        //     sup = n*sum;// 7 * 1 = 7
        //     System.out.println(n+"*"+sum+"="+sup);
        //     mult--;
        // }

        //Count Even integers from 1 to N
        // int count = 0;
        // while (n>0){
        //     sum = sum + 1;
        //     if(sum % 2 == 0){
        //         count++;
        //         System.out.println(sum);

        //     }
        //     n--;
        // }
        // System.out.println(count);

        //Print All Odd Numbers
        int count = 0;
        while (n>0){
            sum = sum + 1;
            if(sum % 2 == 1){
                count++;
                System.out.println(sum);

            }
            n--;
        }
        System.out.println(count);

    }
}
