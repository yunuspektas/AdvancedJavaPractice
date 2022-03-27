package StringManipulationQuestions;

public class Q7 {
    public static void main(String[] args) {

//        given a string, write a function to compress it by shortening every
//        sequence of the same character to that character followed by the number
//        of repetitions. If the compressed string is longer than the original,
//        you should return the original string
//
//        e.g
//
//        compress("a") = a
//        compress("aaa") = a3
//        compress("aaabbb") = a3b3
//        compress("aaabccc") = a3b1c3

        String word = "aaabbcc";
        compressWord(word);


    } // main

    public static void compressWord(String word) {
        word = word.trim();
        String[] newWord = word.split("");
        int count = 0;
        String output = "compress(\"" + word + "\") = ";
        System.out.print(output);
        for(int i=1;i<newWord.length;i++){
            if(newWord[i-1].equals(newWord[i])){
                count++;
            }else{
                System.out.print(newWord[i-1] +(count+1));
                count = 0;
            }
            if(i==newWord.length-1){ //en sona geldiginde
                System.out.println(newWord[i] +(count+1));
            }
        }





    } //method
}
