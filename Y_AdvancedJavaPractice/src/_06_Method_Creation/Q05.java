package _06_Method_Creation;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        String input = "The quick brown fox jumps over the lazy dog.";
        findNumberOfWords(input);

    }

    private static void findNumberOfWords(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') count++;
        }
        System.out.println("Number of words in the string: " + (count + 1));
    }
}
