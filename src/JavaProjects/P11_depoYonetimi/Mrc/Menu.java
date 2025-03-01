package JavaProjects.P11_depoYonetimi.Mrc;

import java.util.Scanner;


public class Menu {
    static Scanner scan = new Scanner(System.in);
    public static void menuGiris(){
        System.out.println("");
        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
        System.out.println("===========================================");
        System.out.println("1-Ürün Tanımlama\n2-Ürün Listele\n3-Ürün Girişi\n4-Ürünü Rafa Koy\n5-Ürün Çıkışı");
        int secim = scan.nextInt();
        switch (secim) {
            case 1 : {
                DepoMethods.urunTanimlama();
                menuGiris();
            }
            case 2 : {
                DepoMethods.urunListele();
                menuGiris();
            }
            case 3 : {
                DepoMethods.urunGirisi();
                menuGiris();
            }
            case 4 : {
                DepoMethods.urunuRafaKoy();
                menuGiris();
            }
            case 5 : {
                DepoMethods.urunCikisi();
                menuGiris();
            }
            default : {
                System.out.println("Lütfen seçim işlemini yapınız");
                menuGiris();
            }
        }
    }
}
