public class PrimeNumber {
    public static void main(String[] args) {
   
    int n = 18;
    int a = n;
    int i = 2;
    boolean prime = true;
    while(i<n){// 2<17
        if(n%i == 0){ //17 % 2 == 1
            prime = false; // prime = true
         break;
        }
        i++;// 2+1
    }
    if(n<=1)
        System.out.println("Not Prime");
    else if(prime)
        System.out.println("Prime Number");
    else
        System.out.println("Not Prime");
}
}