import java.util.Scanner;

public class printSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        int sum = 0;
        
        while (true){
            System.out.println("Enter the number ");
            int num = in.nextInt();
            sum += num;

            System.out.println("Press x to stop the program ");
            ch = in.next();
            if (ch == 'x'){
                break;
            }
            
        }
        System.out.println("Sum "+sum);
    }
}