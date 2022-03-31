package tasks;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz : ");
        String sentence =scanner.nextLine();

        LongestWord(sentence);

    }

    private static void LongestWord(String sentence) {
        String[] arr = sentence.split(" ");
        String longestWord ="";
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length() > longestWord.length()) longestWord = arr[i] ;
        }
        System.out.println("The Longest word is : " + longestWord);
    }
}
