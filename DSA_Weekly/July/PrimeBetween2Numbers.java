public class PrimeBetween2Numbers {
    public static void main(String[] args) {
        // Write a function that returns all prime numbers between two given numbers.

        int n = 35;
        int c = 13;
        int start = 0;
        int primeNumber = 0;
        // while(n > 0){
        //     int ld = n % 10;
        //     if(5 %  start %)
        // }

        for(int prime = c; prime * prime  <= n; prime ++){
                if(prime % start == 0 && start < prime){ 
                    break;
                }
                else{
                    primeNumber = prime;
                    System.out.println(primeNumber); 
                }
                start ++;
        }
    }
}
