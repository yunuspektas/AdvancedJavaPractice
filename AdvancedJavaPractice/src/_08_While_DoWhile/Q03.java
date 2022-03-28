package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */

        int sayiTaban = 3;
        int sayiUst = 4;

        usluSayiHesapla(sayiTaban, sayiUst);

    }

    private static void usluSayiHesapla(int sayiTaban, int sayiUst) {
        int sayac = 1;
        int sonuc = sayiTaban;
        do {
            sonuc *= sayiTaban;
            sayac++;
        } while (sayac < sayiUst);
        System.out.println(sonuc);
    }


}
