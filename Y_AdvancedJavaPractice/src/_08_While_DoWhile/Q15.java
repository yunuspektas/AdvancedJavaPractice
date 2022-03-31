package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scan.nextInt();

        int num3 = findFaktorial(num1);
        int num4 = findFaktorial(num2);
        int num5 = findFaktorial(num1-num2);

        System.out.println("Kombinasyon : " + num3/(num4*num5));


    }

    private static int findFaktorial(int num1) {
        int fakt = 1;
        while (num1 > 0) {
            fakt *= num1;
            num1 -= 1;
            findFaktorial(num1);
        }
        return fakt;
    }
}

