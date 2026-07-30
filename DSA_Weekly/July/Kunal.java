public class Kunal {
    public static void main(String[] args) {
        int month = 30;
        int count = 0;
        for(int i = 2; i<=month; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
