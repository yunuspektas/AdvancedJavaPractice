package _05_StringManipulation;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime girin : ");
        String word = scan.next();


        System.out.println((word.length() >= 3) ? word.substring(word.length()-2 , word.length())
                + word.substring(word.length()-2 , word.length())
                + word.substring(word.length()-2 , word.length())
                : word );



    }
}
