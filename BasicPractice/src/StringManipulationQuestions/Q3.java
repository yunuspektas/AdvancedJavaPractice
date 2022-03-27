package StringManipulationQuestions;

public class Q3 {
    public static void main(String[] args) {

        //Klavyeden okunan bir string tanımlayıcının kurallara uygun
        // olup olmadığını kontrol eden Java programını yazınız.
        //Not: Bir tanımlayıcı harflerden, rakamlardan, alt çizgi
        // karakterinden ( _ ) ve dolar ( $ ) işaretinden oluşur.

        String word="12 3$4_";

        boolean truefalse = isValidVariableName(word);

        if(truefalse) System.out.println("tanımlı");
        else System.out.println("tanımsız");
    }

    public static boolean isValidVariableName(String word) {
        boolean isValid = true ;
        for (int i = 0; i <word.length() ; i++) {
            char karakter = word.charAt(i);
            if( ! (Character.isDigit(karakter) || Character.isLetter(karakter)
            || karakter=='_' || karakter =='$')) {
                isValid = false;
            }

        }


        return isValid;
    }
}






