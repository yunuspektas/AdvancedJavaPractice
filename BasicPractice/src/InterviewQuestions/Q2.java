package InterviewQuestions;

public class Q2 {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        String word = "army";
        int num =2;
        String newWord = word.substring(0,1)+word.substring(word.length()-1,word.length());
        for (int i = 0; i <num ; i++) {

            System.out.print(newWord);

        }
    }
}
