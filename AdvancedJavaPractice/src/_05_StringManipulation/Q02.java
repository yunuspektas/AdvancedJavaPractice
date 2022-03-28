package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isim ve soyisminizi giriniz :");
        String nameSurname = scan.nextLine();

        String name = nameSurname.substring(0, nameSurname.indexOf(" ")); // isim kısmını aldık
        String surname = nameSurname.substring( nameSurname.indexOf(" ")+1, nameSurname.length() ); // soy-isim kısmını aldık

        System.out.println(" Isminiz : " + name + " Soyisminiz : " + surname );
    }
}
