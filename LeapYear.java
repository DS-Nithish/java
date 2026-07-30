public class LeapYear {
    public static void main (String [] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();

        if (a%4 == 0){
            if(a%400 == 0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
