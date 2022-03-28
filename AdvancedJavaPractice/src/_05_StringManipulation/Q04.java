package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 4 harfli bir kelime girin : ");
        String sentence = scan.nextLine();

        System.out.println( sentence.substring(3)
                + sentence.substring(2,3)
                + sentence.substring(1,2)
                + sentence.substring(0,1));



    }
}
