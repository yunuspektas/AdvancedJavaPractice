package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num ; i++) {
            sum +=i*i;

        }
        System.out.println(sum);



    }
}
