public class IsPangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }


    public static boolean checkIfPangram(String sentence){
        int correctSum = 2847;
        int sum = 0;
        for (int i = 0; i< sentence.length();i++){
            int ascii_value = (int)sentence.charAt(i);
            sum = sum + ascii_value;
        }
        System.out.println(sum);
        if (sum != correctSum){
            return false;
        }
        return true;

    }
    
}
