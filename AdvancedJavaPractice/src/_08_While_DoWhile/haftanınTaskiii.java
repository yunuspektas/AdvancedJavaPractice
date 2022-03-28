package _08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        double birakildigiYuskeklik = 4.0; // 4 metre
        double ziplamaSayisi = 0;
        double aldigiToplamYol = 0;
        double zipladigiMesafe = 0;

        do {

            zipladigiMesafe = birakildigiYuskeklik * 3 / 4;
            aldigiToplamYol += birakildigiYuskeklik + birakildigiYuskeklik * 3 / 4;
            birakildigiYuskeklik -= birakildigiYuskeklik * 1 / 4;
            ziplamaSayisi++;

        } while (zipladigiMesafe >= 1);

        System.out.println("Aldığı Toplam Yol : " + aldigiToplamYol);
        System.out.println("Yere Vurma Sayısı : " + ziplamaSayisi);


    }
}
