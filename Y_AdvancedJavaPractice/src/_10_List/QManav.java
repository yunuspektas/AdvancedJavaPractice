package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QManav {
    /*
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("domat - urun kodu : 1","elma - urun kodu : 2","muz - urun kodu : 3",
            "biber - urun kodu : 4", "balcan - urun kodu : 5" ));//urunlerin atanacagi bos list
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0,7.5,1.3,8.7,9.2));//urun fiyatlarinin atanacagi bos list
    static double toplamOdenecekTutar;
    static Scanner scan = new Scanner(System.in);

     */
    // Elmanın fiyatı 5 tl , muzun fiyatı 15 tl olacak şekilde index sırasına göre List e eklendi
    static List<Double> list = new ArrayList<>(Arrays.asList(5.0, 15.0, 5.0, 20.0, 35.0));

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        Scanner scan = new Scanner(System.in);
        int loop = 1;
        double price = 0.0;
        int itemNo = 0;
        while (loop == 1) { // kullanıcı alışverişe devam için 1 tuşuna basıp basmadığının kontrolu
            System.out.println("""
                    Lütfen almak istediğiniz ürünü seçmek için ilgili rakamı tuşlayınız\s
                    Elma için 1\s
                    Muz için 2\s
                    Portakal için 3\s
                    Kivi için 4\s
                    Çilek için 5""");
            itemNo = scan.nextInt(); // ürün fiyatını bulmak için List deki indexa bakılacak
            System.out.print("Kaç kilo almak istiyorsunuz : ");
            double miktar = scan.nextDouble();
            price += list.get(itemNo-1) * miktar ; // kullanıcıya ürün seçtirme işlemi 1 sayısı ile başlatıp,
            //ve List elemanlarının indexi 0  ile başladığından   list.get(itemNo-1)  yazıldı

                    System.out.print("Devam etmek için 1 \nÇıkış için 2 ye basın : ");
            loop = scan.nextInt();
        } // while loop

        System.out.println("Alışveriş tutarınız : " + price + "TL dir.");


       /*
        System.out.println(urunListesi);
        musteriSecim();

        */
    }

   /*
    private static void musteriSecim() {

        System.out.println("hangi urunu secmek istersiniz :");
        int secim = scan.nextInt();

        System.out.println("sectiginiz urunden kac kilo alacaksiniz : ");
        double kilo = scan.nextDouble();
        double urunTutari = urunFiyatlari.get(secim - 1);
        double urunToplamTutar = kilo * urunTutari;
        toplamOdenecekTutar += urunToplamTutar;//alınan her urun odemesi ana odemeye eklendi
        System.out.println("devam edecekseniz 1, kasa için 2 seciniz...");

        int karar = scan.nextInt();
        if (karar == 1) {
            musteriSecim();
        } else {
            kasa();
        }
    }

    private static void kasa() {

        System.out.println("alisverisinizin toplam tutari : " + toplamOdenecekTutar);
    }

    */
}

