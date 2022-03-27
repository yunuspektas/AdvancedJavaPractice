package practice_basic_day04;

import java.util.Arrays;

public class Q03_Arrays {

    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String word = "HeySiri" ;
        String[] word2 = word.split("");

        word2[0]="B";
        word2[1]="y";
        word2[2]="e";

        for (int i = 0; i < word2.length ; i++) {

            System.out.print(word2[i]);

        }

    }
}
