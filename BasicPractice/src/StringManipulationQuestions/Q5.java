package StringManipulationQuestions;

public class Q5 {
    public static void main(String[] args) {

        //You are given a string containing characters A and B only. Your task is
        // to change it into a string such that there are no matching adjacent characters.
        // EXAMPLE :
        // Input    : ABBAAB
        // Output   : ABAB
        //number of deletion : 2

        String input = "ABAABB" ;
        int uzunluk = input.length();
        String newWord = String.valueOf(input.charAt(0));

        for (int i = 0; i <uzunluk-1; i++) {
            for (int j = i+1; j <i+2 ; j++) {
                if(!(input.charAt(j)==input.charAt(i))) {
                    newWord +=input.charAt(j);
                }


            }

        }
        System.out.println(newWord);

    }
}
