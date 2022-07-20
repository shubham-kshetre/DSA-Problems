public class reverseString{
    public static void main(String[] args) {
        String word = "shubham";
        int n = word.length();
        System.out.println(reverse(word, 0, word.length()));        
    }
    pulbic static void reverse(String word, int i, int j){
        //base condition       
        if (word.charAt(n) == ){

        }
        //do swapping of first and last chars
        int temp = word[i];
        word[i] = word[j];
        word[j] = temp;

        return reverse(word,i+1, j-1);
    }
}