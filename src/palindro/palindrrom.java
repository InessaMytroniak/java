
package palindro;

public class palindrrom {


    public static void main(String[] args) {
        String word = "okko";
// algorithm #1

        boolean flag = false;

        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println(" Algorithm #1. It is a Palindrome");
        } else {
            System.out.println(" Algorithm #1. It isn't a Palindrome");
        }

// algorithm ¹2 

        String backward = "";
        for (int i = 0; i < word.length() ; i++){
            backward+=word.charAt(word.length()-1-i);
        }
        System.out.println(word);
        System.out.println(backward);

        if(word.equals(backward)) {
            System.out.println(" Algorithm #2. It is a Palindrome");
        } else {
            System.out.println(" Algorithm #2. It isn't a palindrome");
        }
    }
}