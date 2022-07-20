public class LeapYearOrNot {
    // 1. Input a year and find whether it is a leap year or not.
    public static void main(String[] args) {
        int n = 2016;

        if (n % 4 == 0){
            if (n % 100 == 0){
                if (n % 400 == 0){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
            }
            else{
                System.out.println("True");
                }
        }
        else{
            System.out.println("False");
        }
    }
 

}





