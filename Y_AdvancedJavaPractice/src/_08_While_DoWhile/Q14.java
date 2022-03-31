package _08_While_DoWhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num1 = scan.nextInt();

        System.out.println("Girilen sayının faktöriyeli : " + findFakto(num1));

    }

    private static int findFakto(int num1) {
        int fakt = 1;
        while (num1 > 0) {
            fakt *= num1;
            num1 -= 1;
            findFakto(num1);
        }
        return fakt;

    }

}


