package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


    public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */
        int bolunen = 13;
        int bolen = 4;
        int kalan = bolunen;
        int sonuc = 0;

        while (kalan >= bolen) {
            kalan = kalan - bolen;
            sonuc++;
        }

        System.out.println(bolunen + " / " + bolen + " İşleminin sonucu : " + (sonuc));

    }

}


