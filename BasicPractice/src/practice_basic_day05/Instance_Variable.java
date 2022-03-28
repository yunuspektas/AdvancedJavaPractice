package practice_basic_day05;

import java.util.Scanner;

public class Instance_Variable {
    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */
    public static void main(String[] args) {
        String isim ="Ahmet";
        String soyisim ="Polatlı";
        String sinif = "1/A";
        String okulNo = "12322";


        isimDegistir(isim, soyisim, sinif, okulNo);
        System.out.println(isim + " " + soyisim + " " + sinif + " " + okulNo);

        soyisimdegistir(soyisim);
        System.out.println(isim + " " + soyisim + " " + sinif + " " + okulNo);
    }

    private static void soyisimdegistir(String soyisim) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yeni soyisminizi giriniz : ");
        soyisim = scan.next();
    }

    private static void isimDegistir(String isim, String soyisim, String sinif, String okulNo ) {
        isim = "Mehmet";
        soyisim = "Alatlı";
        sinif = "2/B";
        okulNo = "5543";

        System.out.println(isim + " " + sinif + " " + okulNo);
    }
}
