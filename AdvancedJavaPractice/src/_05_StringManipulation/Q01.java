package _05_StringManipulation;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir cumle giriniz : ");
        String sentence = scan.nextLine();

        System.out.println(sentence.contains(" ")
                ? "Cümlenizde boşluk karakteri vardır."
                : "Cümlenizde boşluk karakteri yoktur ");


    }
}

