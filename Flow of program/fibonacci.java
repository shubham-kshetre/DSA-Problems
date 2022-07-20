public class fibonacci {
    public static void main(String[] args) {
        int a = 0; // first term
        int b = 1; //second term
        int count = 2;
        while(count < 10){
            int temp = b;
            System.out.print(a+",");
            b = a+b; //next term
            a = temp;
            count++;           
        }
        
    }
   
}
