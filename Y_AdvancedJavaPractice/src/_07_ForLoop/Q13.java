package _07_ForLoop;

import java.util.Scanner;

public class Q13 {


    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz : ");
        String sentence = scan.nextLine().toLowerCase();

        System.out.print("Lütfen bir kelime giriniz : ");
        String word = scan.next().toLowerCase();

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == word.charAt(0)) count ++;
        }
        System.out.println("Girdiginiz cumlede \"" + word.charAt(0) + " harfi " + count + " kere kullanılmıştır."  );


    }

}
