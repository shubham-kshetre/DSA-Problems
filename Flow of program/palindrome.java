public class palindrome {
    public static void main(String[] args) {
    
        String str = "MADAM";
        String reversedStr = reverse(str);
        if (str.equals(reversedStr)){
            System.out.println(str+" is Palindrome");
        }
        else{
            System.out.println(str+" is  not Palindrome");
        }    
    }
    public static String reverse(String givenStr){ //function to recerse the string
        String reversed = ""; //string to append characters in reverse order
        char ch;
         
        for (int i = givenStr.length()-1; i >= 0; i--) {
            ch = givenStr.charAt(i);
            reversed = reversed+ch; //append ech char                             
        }
        System.out.println("the reversed string is "+reversed);
        return reversed;
    }
} 
