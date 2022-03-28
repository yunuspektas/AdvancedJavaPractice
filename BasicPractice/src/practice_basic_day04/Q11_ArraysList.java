package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        List<String> nameList = new ArrayList<>();
        while (true) {

            System.out.print("Çıkış için 0 a basınız , Lütfen isminizi giriniz  : ");
            String name = scan.next();
            // 2. adim
            name = name.replace(" ", "");

            // 3. adim
            if(name.equals("0")) break;
            if (name.length() > 0) {
                if (nameList.contains(name)) {
                    name = name + r.nextInt(10);
                    nameList.add(name);

                } else nameList.add(name);

            } else System.out.println("Giriş hatalı");

            System.out.println("En son girilen isim : " + nameList.get(nameList.size() - 1));

        }


    }
}
