package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("3 kelimeden oluşan bir isim giriniz : ");
        String name = scan.nextLine();

       // System.out.println(name.substring(0 , name.indexOf(" ")) + "." + name.substring(name.indexOf(" ")+1, ));

    }
}
